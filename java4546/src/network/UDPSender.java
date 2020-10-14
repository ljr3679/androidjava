package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSender {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket();
		String str = "i am a android programmer!";
		byte[] data = str.getBytes();//string을 byte로 만듦 
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		socket.send(packet);
		socket.close();
		

	}

}
