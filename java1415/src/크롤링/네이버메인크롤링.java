package 크롤링;



import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		// 크롤링: 웹 사이트에서 정보를 가지고 오는것
		//단순: 스크랩핑
		//단순+@: 크롤링
		//크롤링 순서
		//1. 사이트 연결
		//2. 해당페이지 다운로드(html)
		//3. 원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://www.naver.com/");
		System.out.println("1. 사이트 연결 성공!!");
		
		try {
			Document doc = con.get();//index.html
			System.out.println("2. 해당페이지 다운로드 완료.!!");
			System.out.println("----------------------");
			//System.out.println(doc);
			//System.out.println(doc.select("a.nav"));
			System.out.println("3.원하는 위치의 정보를 추출 성공.!!");
			Elements list =  doc.select("a.nav");
			System.out.println(list.size());
			//Elements == ArrayList + @@
			Element tag = list.get(0);
			System.out.println(tag);
			String text = tag.text();
			System.out.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Document doc = con.get();
			System.out.println("2. 해당페이지 다운로드 완료.!!");
			System.out.println("----------------------");
			//System.out.println(doc);
			//System.out.println(doc.select("a.nav"));
			System.out.println("3.원하는 위치의 정보를 추출 성공.!!");
			Elements list =  doc.select("a.nav");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				//System.out.println(tag);
				String text = tag.text();
				System.out.println(text);
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
