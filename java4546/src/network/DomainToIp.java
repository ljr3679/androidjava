package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//domain name : www.naver.com
//DNS (domain,범위 name system) 서버 ==> 주소!! : 
public class DomainToIp {

	public static void main(String[] args) throws UnknownHostException {
		String domain = "www.naver.com";
		String domain1 = "www.daum.net";
		InetAddress ip = InetAddress.getByName(domain);
		InetAddress ip1 = InetAddress.getByName(domain1);
		System.out.println("IP주소 : " + ip);
		System.out.println("IP주소 : " + ip1);
		

	}

}
