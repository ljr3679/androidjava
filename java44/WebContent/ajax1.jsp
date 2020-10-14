<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	//콜백함수(call-back함수)
	//특정한 이벤트를 기다렸다가 그 이벤트가 발생하면 
	//함수가 정의 되어 있는 곳으로 돌아가 자동 호출되는 함수
	//body의 하위 엘리먼트(태그)를 먼저 브라우저가 dom-tree를 구성한 후
	//콜백함수를 정의 하게 되어있음.
	//브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
	//body부분을 먼저 읽어서 dom-tree를 만들도록 해야함.
	$(function () {
		$("#b1").click(function () {//b1 button클릭시 액션
			$.ajax({//ajax
				url:"data/member.xml",//member.xml 연결
				success: function (doc) { //연결 성공 여부 
					console.log('XML요청 성공!!')//xml 데이터 요청 여부 확인
					console.log('XML요청 결과 :' + doc)//xml 요청결과(doc) 확인
					list = $(doc).find('record')//list로 전체 record 확인
					console.log('레코드의 개수 :' + list.length)//레코드 개수 console에서 확인
					if(list.length > 0){//레코드가 0보다 크면
						$(list).each(function () {//for-each문
							id = $(this).find('id').text()//전체 id값 가져 옴
							first_name = $(this).find('first_name').text()
							last_name = $(this).find('last_name').text()
							email = $(this).find('email').text()
							gender = $(this).find('gender').text()
							ip_address = $(this).find('ip_address').text()
							$("#d1").append(id + "<br>")//append로 전체 id값 출력
							$("#d1").append(first_name + "<br>")
							$("#d1").append(last_name + "<br>")
							$("#d1").append(email + "<br>")
							$("#d1").append(gender + "<br>")
							$("#d1").append(ip_address + "<br>")	
						})
						$.ajax({
								url:"db1.jsp",//db1.jsp로 연결.
								data:{//db1.jsp에서 데이터를 불러옴.
									id : id,//id
									first_name : first_name,
									last_name : last_name,
									email : email,
									gender : gender,
									ip_address : ip_address
								},
								success:function(result){//연결 성공여부 확인
									alert("db1.jsp를 통해서 db에 넣기!-성공적으로 전송함.")//alert로 성공여부 띄워줌
									alert("db1.jsp의 결과 : " + result)//alert로 db create결과 띄워줌	
								}
							})
							
					}					
				}
			})
		})
		
		
		
		$("#b2").click(function () {
			$.ajax({
				url:"data/member.json",
				success: function (doc) {
					console.log('JSON요청 성공!!')
					console.log(doc)
					$(doc).each(function (index, item) {
						id = item.id,
						first_name = item.first_name,
						last_name = item.last_name,
						email = item.email,
						gender = item.gender,
						ip_address = item.ip_address
						$("#d1").append(id + "<br>")//append로 전체 id값 출력
						$("#d1").append(first_name + "<br>")
						$("#d1").append(last_name + "<br>")
						$("#d1").append(email + "<br>")
						$("#d1").append(gender + "<br>")
						$("#d1").append(ip_address + "<br>")	
					})
					
				}
			})
			
		})
		
		
		
		
		$("#b3").click(function () {
			
		})
	})
	</script>
</head>
<body>
<button id="b1">XML읽어오기</button>
<button id="b2">JSON읽어오기</button>
<button id="b3">DB에 넣기</button>
<div id="d1"></div>

</body>
</html>