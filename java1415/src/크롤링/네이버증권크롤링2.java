package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public static void main(String[] args) {
				Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");	
				try {
					Document doc = con.get(); 
					Elements list = doc.select("td.first");
					Elements list1 = list.select(".blind");
					String n1 = list1.get(0).text();
					String n2 = list1.get(1).text();
					System.out.println("전일 : " + n1);
					System.out.println("시가 : " + n1);
					System.out.println(list);
					
					Elements list2 = doc.select("td");
					Elements list3 = list2.select(".blind");
					String n3 = list3.get(0).text();
					String n4 = list3.get(1).text();
					System.out.println("저가 : " + n3);
					System.out.println("고가 : " + n4);
					System.out.println(list2);
										 
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		
		
		
	}

}
