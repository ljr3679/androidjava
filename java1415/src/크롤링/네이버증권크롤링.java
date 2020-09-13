package 크롤링;



import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		// 크롤링: 웹 사이트에서 정보를 가지고 오는것
		//단순: 스크랩핑
		//단순+@: 크롤링
		//크롤링 순서
		//1. 사이트 연결
		//2. 해당페이지 다운로드(html)
		//3. 원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");
				
		try {
			Document doc = con.get(); 
			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();
			System.out.println("회사이름 : " + name);
			
			
			Elements list2 = doc.select("span.code");
			String code = list2.get(0).text();
			System.out.println("회사코드 : " + code);
			
			Elements list3 = doc.select("div.today");
			//System.out.println(list3);
			
			Elements list4 = list3.select(".blind");
			System.out.println(list4);
			String now = list4.get(0).text();//현재가
			String dif = list4.get(1).text();//차이
			String percent = list4.get(2).text();//증감비율
			System.out.println("현재가 : " + now);
			System.out.println("차이 : " + dif);
			System.out.println("증감비율 : " + percent);			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
