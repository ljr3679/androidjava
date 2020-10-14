package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// 1.연결 요청만 담당하는 서버용 socket필요
		// prototype(프로토타입) 방법 <-> singletone(싱글톤)
		// 필요할때마다 객체생성 <-> 하나만 객체생성 주소를 재사용
		ServerSocket server = new ServerSocket(9100);//9100port 서버를 만듦 선언
		System.out.println("TCP서버 시작됨");
		System.out.println("클라이언트 요청을 기다리는중....");
		int count = 0;//count
		while (true) {
			Socket socket = server.accept();// socket 기다리는 객체생성
			System.out.println(count +  "개의 서버와의 연결 성공!!");
			count++;//증가
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);//socket 쓰기
			out.println("i am a java programmer");//출력값 다시 보내기
			
		}
	}
}
