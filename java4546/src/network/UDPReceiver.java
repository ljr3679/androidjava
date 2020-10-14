package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws IOException {
		//socket프로그램 (소켓프로그램)
		DatagramSocket socket = new DatagramSocket(7100);
		System.out.println("받는 쪽 소켓 시작");
		System.out.println("받을 준비 끝!!");
		//빈 패키지 필요
		byte[] data = new byte[256];//받아서
		DatagramPacket packet = new DatagramPacket(data, data.length);//빈패킷에 넣어줌
		socket.receive(packet);
		System.out.println("받은 데이터 : " + new String(data));//받은것을 string으로 변환
		
	}

}
