<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	//�ݹ��Լ�(call-back�Լ�)
	//Ư���� �̺�Ʈ�� ��ٷȴٰ� �� �̺�Ʈ�� �߻��ϸ� 
	//�Լ��� ���� �Ǿ� �ִ� ������ ���ư� �ڵ� ȣ��Ǵ� �Լ�
	//body�� ���� ������Ʈ(�±�)�� ���� �������� dom-tree�� ������ ��
	//�ݹ��Լ��� ���� �ϰ� �Ǿ�����.
	//�������� ��ũ��Ʈ�� ���� �����ϰ� �ν��ϴ� ���� �ƴ϶�
	//body�κ��� ���� �о dom-tree�� ���鵵�� �ؾ���.
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
					console.log("����!!" + result)
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
					console.log("����!!" + result)
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
					console.log("����!!" + result)
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
					console.log("����!!" + result)
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
<button id="b1">�ｺ ����</button>
<button id="b2">Ʈ���� ����</button>
<button id="b3">��Ʈ ����</button>
<button id="b4">�Ѱ� ����</button>


<div id="d1"></div>

</body>
</html>