<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//jsp객체 
          //HttpServletRequest request = new HttpServletRequest();
          //내장된 객체
          //scriptlet(스크립트릿)
          String id = request.getParameter("id");
          String pw = request.getParameter("pw");
          String name = request.getParameter("name");
          String tel = request.getParameter("tel");
          MemberDAO dao = new MemberDAO();
          dao.create(id, pw, name, tel);
          String check = "가입완료";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신이 입력한 정보<%= check %></h3>
<hr color = "red">
아이디 : <%= id %><br><!-- expressiong : 표현식 -->
비밀번호 : <%= pw %><br>
이름 : <%= name %><br>
전화번호 : <%= tel %><br>
<hr color = "blue">
<a href="login.html">로그인 페이지로</a>

</body>
</html>