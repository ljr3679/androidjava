package network;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.wsdl.ActionBasedOperationSignature;
import java.awt.Color;
import java.awt.Font;

public class 메신저B extends JFrame {
	private JTextField textField;
	private JTextField input;
	private JTextArea list;
	
	public 메신저B() {
		JFrame f = new JFrame();
		
		setTitle("메신저B");
		setSize(300, 500);
		getContentPane().setLayout(null);
		
		input = new JTextField();
		input.setBounds(12, 390, 260, 61);
		getContentPane().add(input);
		input.setColumns(10);
		
		list = new JTextArea();
		list.setFont(new Font("Monospaced", Font.BOLD, 15));
		list.setBackground(new Color(147, 112, 219));
		list.setBounds(22, 10, 250, 370);
		getContentPane().add(list);
		list.setEditable(false);
		
		
		
		input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String data = input.getText();
				//입력한 값 가지고 와서, list up!
				list.append("누구냐>>" + data + "\n");
				input.setText("");
				//상대방에게 네트워크 전송!
				try {
					DatagramSocket socket = new DatagramSocket();
					
					byte[] data2 = data.getBytes();//string을 byte로 만듦 
					InetAddress ip = InetAddress.getByName("192.168.1.180");
					
					DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5000);
					socket.send(packet);
					System.out.println("클라이언트 포트" + socket.getLocalPort());
					socket.close();
				} catch (Exception e) {
					System.out.println("데이터 보내는중 오류 발생!!!");
					e.printStackTrace();
				}

			}
		});
	
	
		FlowLayout flow = new FlowLayout();
		setVisible(true);
	}
	
	public void process() {
		
				while (true) {
					try {
						//socket프로그램 (소켓프로그램)
						DatagramSocket socket = new DatagramSocket(6000);
						System.out.println("받는 쪽 소켓 시작");
						System.out.println("받을 준비 끝!!");
						//빈 패키지 필요
						byte[] data = new byte[256];//받아서
						DatagramPacket packet = new DatagramPacket(data, data.length);//빈패킷에 넣어줌
						socket.receive(packet);
						System.out.println("받은 데이터 : " + new String(data));//받은것을 string으로 변환
						list.append(new String(data) + "<<누구냐 넌" + "\n");
						socket.close();

					} catch (Exception e) {
						System.out.println("데이터 받는중 에러발생");
						e.printStackTrace();
					} 
				}
				
	}
	
	public static void main(String[] args) {
		메신저B m = new 메신저B();
		m.process();
	}
}
