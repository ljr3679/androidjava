package network;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class TCPClient1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 9100); //서버와 연결
			System.out.println("client" + i + "와 서버 연결됨.");
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));//버퍼를 이용한 쓰기
			String data = input.readLine();//한줄씩 출력해주기 위해
			System.out.println("받은 데이터 : " + data);
			
		}
	}

}
