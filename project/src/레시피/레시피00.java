package 레시피;

public class 레시피00 {

	public static void main(String[] args) {
		String[] titles = { "~~닭볶음탕 황금 레시피 알려드려요~~", "~~부대찌개 황금 레시피 알려드려요~~", "~~떢볶이 황금 레시피 알려드려요~~",
							"~~소불고기 황금 레시피 알려드려요~~", "~~오징볶음 황금 레시피 알려드려요~~", "~~소장조림 황금 레시피 알려드려요~~" };
		String[] images = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg" };
		String[] images0 = { "1-1.jpg", "2-1.jpg", "3-1.jpg", "4-1.jpg", "5-1.jpg", "6-1.jpg" };
		String[] images1 = { "1-1-1.jpg", "2-1-1.jpg", "3-1-1.jpg", "4-1-1.jpg", "5-1-1.jpg", "6-1-1.jpg" };
		String[] images2 = { "1-1-2.jpg", "2-1-2.jpg", "3-1-2.jpg", "4-1-2.jpg", "5-1-2.jpg", "6-1-2.jpg" };
		String[] images3 = { "1-1-3.jpg", "2-1-3.jpg", "3-1-3.jpg", "4-1-3.jpg", "5-1-3.jpg", "6-1-3.jpg" };
		String[] images4 = { "1-1-4.jpg", "2-1-4.jpg", "3-1-4.jpg", "4-1-4.jpg", "5-1-4.jpg", "6-1-4.jpg" };
		String[] ingredients  = { "[1재료]\r\n"   
								+ "닭한마리, 당면, 감자3개, 당근1/2쪽, 양파1~1.5개, 고추3개, 대파1개, 다진마늘5쪽,\r\n"  
								+ "우유200ml, 육수:멸치 다시마 표고버섯등(생략가능)", 
								"[2재료]\r\n"   
								+ "닭한마리, 당면, 감자3개, 당근1/2쪽, 양파1~1.5개, 고추3개, 대파1개, 다진마늘5쪽,\r\n"  
								+ "우유200ml, 육수:멸치 다시마 표고버섯등(생략가능)",
								"[3재료]\r\n"   
								+ "닭한마리, 당면, 감자3개, 당근1/2쪽, 양파1~1.5개, 고추3개, 대파1개, 다진마늘5쪽,\r\n"  
								+ "우유200ml, 육수:멸치 다시마 표고버섯등(생략가능)",
								"[4재료]\r\n"   
								+ "닭한마리, 당면, 감자3개, 당근1/2쪽, 양파1~1.5개, 고추3개, 대파1개, 다진마늘5쪽,\r\n"  
								+ "우유200ml, 육수:멸치 다시마 표고버섯등(생략가능)",
								"[5재료]\r\n"   
								+ "닭한마리, 당면, 감자3개, 당근1/2쪽, 양파1~1.5개, 고추3개, 대파1개, 다진마늘5쪽,\r\n"  
								+ "우유200ml, 육수:멸치 다시마 표고버섯등(생략가능)",
								"[6재료]\r\n"   
								+ "닭한마리, 당면, 감자3개, 당근1/2쪽, 양파1~1.5개, 고추3개, 대파1개, 다진마늘5쪽,\r\n"  
								+ "우유200ml, 육수:멸치 다시마 표고버섯등(생략가능)"
								};
		String[] Seasoning = {"[1양념]\r\n"
								+ "간장(싱겁게 드시는 분들 조절해주세요), 8~11큰술 고추장4큰술고춧가루2큰술, \r\n"
								+ "요리당6큰술, 간양파1/2개, 청주1큰술, 물400(당면넣지않을때)~600, (당면넣을때)후추약간, \r\n"
								+ "참기름약간, 액젓한큰술(싱겁게 드시는분들은 간장을 줄이시고 액젓을 추가해주세요 액젓을 \r\n" 
								+ "한큰술 넣으면 감칠맛이 살아납니다(요것도 선택가능)",
								"[2양념]\r\n"
								+ "간장(싱겁게 드시는 분들 조절해주세요), 8~11큰술 고추장4큰술고춧가루2큰술, \r\n"
								+ "요리당6큰술, 간양파1/2개, 청주1큰술, 물400(당면넣지않을때)~600, (당면넣을때)후추약간, \r\n"
								+ "참기름약간, 액젓한큰술(싱겁게 드시는분들은 간장을 줄이시고 액젓을 추가해주세요 액젓을 \r\n" 
								+ "한큰술 넣으면 감칠맛이 살아납니다(요것도 선택가능)",
								"[3양념]\r\n"
								+ "간장(싱겁게 드시는 분들 조절해주세요), 8~11큰술 고추장4큰술고춧가루2큰술, \r\n"
								+ "요리당6큰술, 간양파1/2개, 청주1큰술, 물400(당면넣지않을때)~600, (당면넣을때)후추약간, \r\n"
								+ "참기름약간, 액젓한큰술(싱겁게 드시는분들은 간장을 줄이시고 액젓을 추가해주세요 액젓을 \r\n" 
								+ "한큰술 넣으면 감칠맛이 살아납니다(요것도 선택가능)",
								"[4양념]\r\n"
								+ "간장(싱겁게 드시는 분들 조절해주세요), 8~11큰술 고추장4큰술고춧가루2큰술, \r\n"
								+ "요리당6큰술, 간양파1/2개, 청주1큰술, 물400(당면넣지않을때)~600, (당면넣을때)후추약간, \r\n"
								+ "참기름약간, 액젓한큰술(싱겁게 드시는분들은 간장을 줄이시고 액젓을 추가해주세요 액젓을 \r\n" 
								+ "한큰술 넣으면 감칠맛이 살아납니다(요것도 선택가능)",
								"[5양념]\r\n"
								+ "간장(싱겁게 드시는 분들 조절해주세요), 8~11큰술 고추장4큰술고춧가루2큰술, \r\n"
								+ "요리당6큰술, 간양파1/2개, 청주1큰술, 물400(당면넣지않을때)~600, (당면넣을때)후추약간, \r\n"
								+ "참기름약간, 액젓한큰술(싱겁게 드시는분들은 간장을 줄이시고 액젓을 추가해주세요 액젓을 \r\n" 
								+ "한큰술 넣으면 감칠맛이 살아납니다(요것도 선택가능)",
								"[6양념]\r\n"
								+ "간장(싱겁게 드시는 분들 조절해주세요), 8~11큰술 고추장4큰술고춧가루2큰술, \r\n"
								+ "요리당6큰술, 간양파1/2개, 청주1큰술, 물400(당면넣지않을때)~600, (당면넣을때)후추약간, \r\n"
								+ "참기름약간, 액젓한큰술(싱겁게 드시는분들은 간장을 줄이시고 액젓을 추가해주세요 액젓을 \r\n" 
								+ "한큰술 넣으면 감칠맛이 살아납니다(요것도 선택가능)",
								};
		
		String[] Sequence = {"[순서]\r\n"
							+"1)닭 한마리를 준비 하여\r\n"  
							+ " 닭을 깨끗이 씻어 손질 해 줍니다\r\n"  
							+ " (닭 사이사이 붙어있는 기름을 제거해주면 좋아요)\r\n",
							"[순서]\r\n"
							+"1)닭 한마리를 준비 하여\r\n"  
							+ " 닭을 깨끗이 씻어 손질 해 줍니다\r\n"  
							+ " (닭 사이사이 붙어있는 기름을 제거해주면 좋아요)\r\n",
				
		};
	}

}
