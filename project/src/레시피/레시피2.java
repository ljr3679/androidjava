package 레시피;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class 레시피2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.info);
		JLabel l0 = new JLabel("~~닭볶음탕 황금 레시피 알려드려요~~");
		l0.setBackground(UIManager.getColor("textHighlight"));
		l0.setHorizontalAlignment(SwingConstants.LEFT);
		l0.setForeground(new Color(147, 112, 219));
		l0.setFont(new Font("궁서", Font.PLAIN, 30));
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		
		
		JTextArea t1 = new JTextArea("[재료]\r\n" 
				+ "닭한마리, 당면, 감자3개, 당근1/2쪽, 양파1~1.5개, 고추3개, 대파1개, 다진마늘5쪽,\r\n"
				+ "우유200ml, 육수:멸치 다시마 표고버섯등(생략가능)");
		t1.setLineWrap(true);
		t1.setBackground(SystemColor.control);
		t1.setFont(new Font("HY헤드라인M", Font.PLAIN, 13));
		t1.setColumns(50);
		t1.setRows(5);
		JTextArea t2 = new JTextArea("[양념]\r\n"
				+ "간장(싱겁게 드시는 분들 조절해주세요), 8~11큰술 고추장4큰술고춧가루2큰술, \r\n"
				+ "요리당6큰술, 간양파1/2개, 청주1큰술, 물400(당면넣지않을때)~600, (당면넣을때)후추약간, \r\n"
				+ "참기름약간, 액젓한큰술(싱겁게 드시는분들은 간장을 줄이시고 액젓을 추가해주세요 액젓을 \r\n" 
				+ "한큰술 넣으면 감칠맛이 살아납니다(요것도 선택가능)");
		t2.setBackground(SystemColor.control);
		t2.setFont(new Font("HY헤드라인M", Font.PLAIN, 13));
		t2.setColumns(50);
		t2.setRows(5);
		JTextArea t3 = new JTextArea();
		JTextArea t4 = new JTextArea("[순서]\r\n"+"1)닭 한마리를 준비 하여\r\n" + 
						" 닭을 깨끗이 씻어 손질 해 줍니다\r\n" + 
						" (닭 사이사이 붙어있는 기름을 제거해주면 좋아요)\r\n");
		t4.setBackground(SystemColor.info);
		t4.setFont(new Font("HY엽서L", Font.BOLD, 13));
		t4.setColumns(30);
		t4.setRows(5);
		JTextArea t5 = new JTextArea("2)닭한마리기준\r\n" 
				+"간장9~11 고추장4 고춧가루2 양파갈은거1/2 마늘5알 \r\n"
				+"요리당6 청주1 후추약간 액젓1\r\n" + 
				" 이렇게 양념소스를 만들어 주세요\r\n" + 
				" 요거 진짜 맛집 하고 거의 흡사한 맛이에요 \r\n" + 
				" 맛집은 낙지나 새우를 첨가해 주기도 하죠!");
		t5.setBackground(SystemColor.info);
		t5.setFont(new Font("HY엽서L", Font.BOLD, 13));
		t5.setColumns(30);
		t5.setRows(5);
		JTextArea t6 = new JTextArea("3)냄비에 양념장과 육수600ml를 넣고 한소끔 끓여 주며\r\n" + 
				"   감자를 넣어 뚜껑을 덮고 중불에 30분정도 끓여 주세요\r\n" + 
				" 물대신 육수를 넣어주시면 좀더 감칠맛이\r\n "
			  + "나는데 물로하셔도 맛있어요 (육수는 물로 대체 가능)");
		t6.setBackground(SystemColor.info);
		t6.setFont(new Font("HY엽서L", Font.BOLD, 13));
		t6.setColumns(30);
		t6.setRows(5);
		JTextArea t7 = new JTextArea("4)그사이에 야채손질을 해주시는데요\r\n" + 
				" 대파 양파 당근 고추를 적당한 크기로 잘라 준비해주세요\r\n" + 
				" 나머지 야채를 넣고 한번더 끓여 주면 끝!!");
		t7.setBackground(SystemColor.info);
		t7.setFont(new Font("HY엽서L", Font.BOLD, 13));
		t7.setColumns(30);
		t7.setRows(5);

		ImageIcon img0 = new ImageIcon("1-1.jpg");
		ImageIcon img1 = new ImageIcon("1-1-1.jpg");
		ImageIcon img2 = new ImageIcon("1-1-2.jpg");
		ImageIcon img3 = new ImageIcon("1-1-3.jpg");
		ImageIcon img4 = new ImageIcon("1-1-4.jpg");

		l1.setIcon(img0);
		l2.setIcon(img1);
		l3.setIcon(img2);
		l4.setIcon(img3);
		l5.setIcon(img4);
		
		

		f.setSize(700, 900);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l0);
		f.getContentPane().add(l1);		
		
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		
		f.getContentPane().add(t4);
		f.getContentPane().add(l2);
		f.getContentPane().add(t5);
		f.getContentPane().add(l3);
		f.getContentPane().add(t6);
		f.getContentPane().add(l4);
		f.getContentPane().add(t7);
		f.getContentPane().add(l5);

		f.setVisible(true);
	}

}

