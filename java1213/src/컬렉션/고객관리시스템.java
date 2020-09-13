package 컬렉션;

import java.util.HashMap;

public class 고객관리시스템 {

	public static void main(String[] args) {
		HashMap client = new HashMap();
		client.put(100, "김데이");
		client.put(200, "김사전");
		client.put(300, "김구조");
		client.put(400, "김자료");
		System.out.println(client);
		System.out.println(client.get(200) +"탈락");
		System.out.println(client.get(300) +"개명");
		client.put(200, "탈략");
		client.put(300, "김충성");//값변경
		System.out.println(client);
		client.remove(200);
		System.out.println(client);
	}

}
