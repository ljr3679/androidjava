<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
설정된 세션id는 <%= session.getAttribute("id") %><br>
설정된 앱 count는 <%= application.getAttribute("count") %>
</body>
</html>