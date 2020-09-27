package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.crypto.dsig.Transform;
import javax.xml.transform.Transformer;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.font.TransformAttribute;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.awt.Container;

public class ThreadRun4 extends JFrame{
	JLabel top = new JLabel("1"); //전역변수, 글로벌 변수
	JLabel center = new JLabel("2");
	JLabel sub = new JLabel("3");
	
	
	public ThreadRun4() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("나의 멀티스레드");
		setSize(800, 300);
		
		
		top.setFont(new Font("굴림", Font.BOLD, 50));
		getContentPane().add(top, BorderLayout.NORTH);
		
		
		getContentPane().add(center, BorderLayout.CENTER);
		
		
		sub.setFont(new Font("굴림", Font.BOLD, 50));
		getContentPane().add(sub, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("                 ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("                 ");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel_1, BorderLayout.EAST);
		
		CounterThread2 counter = new CounterThread2();
		ImgThread2 img = new ImgThread2();
		TimerThread2 timer = new TimerThread2();
		counter.start();
		img.start();
		timer.start();
		
		setVisible(true);
		
		
		
	}
	//내부클래스(inner class)
	//변수를 다른 클래스와 공유할 목적
	//단점 : 내부클래스는 독립적으로 사용불가
	public class CounterThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				top.setText("카운터 : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
//		public void view() {
//			super.run();//super. 부모클래스의 있는 것을 호출할때.
//			System.out.println("내용을 프린트");
//		}
	}
	
	public class ImgThread2 extends Thread {
		@Override
		public void run() {
			String[] img = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg" };
			for (int i = 0; i < img.length; i++) {
				ImageIcon img2 = new ImageIcon(img[i]);
				center.setIcon(img2);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}
	
	public class TimerThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 300; i++) {
				Date date = new Date();
				SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String date3 = date2.format(date);
				sub.setText(date3);
				
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	public static void main(String[] args) {
		ThreadRun4 t = new ThreadRun4();
			
	}

}
