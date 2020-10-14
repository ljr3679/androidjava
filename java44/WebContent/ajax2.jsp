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
		$("#b1").click(function () {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f",
				data:{
					url: 'http://health.chosun.com/site/data/rss/rss.xml',
					api_key: 'bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f',
					count : 20
				},
				success : function (result) {
					console.log("성공!!" + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function (index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total = "<br> <a href=" + link + ">" + title + "<br>" + pubDate + "<br>"
							$("#d1").append(total + "<hr>")
						})
						
					}
				}
			})	
		})
		
		$("#b2").click(function () {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f",
				data:{
					url: 'http://travel.chosun.com/site/data/rss/rss.xml',
					api_key: 'bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f',
					count : 20
				},
				success : function (result) {
					console.log("성공!!" + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function (index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total = "<br><a href=" + link + ">"+ title + "<br>" + pubDate + "<br>" + link
							$("#d1").append(total + "<hr>")
						})
						
					}
				}
			})
		})
		
		$("#b3").click(function () {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fart.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f",
				data:{
					url: 'http://art.chosun.com/site/data/rss/rss.xml',
					api_key: 'bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f',
					count : 20
				},
				success : function (result) {
					console.log("성공!!" + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function (index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total = "<br><a href=" + link + ">"+ title + "<br>" + pubDate + "<br>" + link
							$("#d1").append(total + "<hr>")
						})
						
					}
				}
			})
		})
		
		$("#b4").click(function () {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_enter.xml&api_key=bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f",
				data:{
					url: 'http://rss.hankyung.com/new/news_enter.xml',
					api_key: 'bpbragfes1zkcwzkz9ilmw2zimypeidrxinxuc7f',
					count : 20
				},
				success : function (result) {
					console.log("성공!!" + result)
					list = result.items
					console.log(list.length)
					if(list.length > 0){
						$(list).each(function (index,news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							image = news.image
							console.log(title)
							console.log(pubDate)
							console.log(link)
							console.log(image)
							total = "<br><a href=" + link + ">"+ title + "</a><br>" + pubDate + "<br>" + link + "<br>" + "<image><url>" +image+"</url></image>"
							$("#d1").append(total + "<hr>")
						})
						
					}
				}
			})
		})
		
		
		
		
		
		
	})
	</script>
</head>
<body>
<button id="b1">헬스 연결</button>
<button id="b2">트래블 연결</button>
<button id="b3">아트 연결</button>
<button id="b4">한경 연결</button>


<div id="d1"></div>

</body>
</html>