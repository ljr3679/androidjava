package network;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class TCPClient3 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 9100);
		System.out.println("client3 서버와 연결됨.");
	}

}