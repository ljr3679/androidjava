<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!--  ǥ����(Expression) => 
	Expression Lanuage(EL) : �Ӽ��� ������ ��쿡�� ����Ʈ ���� -->
������ ����id�� <%= session.getAttribute("id") %><br>
������ ���� name�� ${name}<br>
������ �� count�� <%= application.getAttribute("count") %>
</body>
</html>