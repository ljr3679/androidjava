<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <% application.setAttribute("count", "100");%>
	<% session.setAttribute("id", "park"); %>
	<% session.setAttribute("name", "박길동"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<a href="세션보기.jsp">세션보기</a>
<a href="세션보기2.jsp">세션보기2</a>
</body>
</html>