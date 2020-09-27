<%@page import="bean.SignVO"%>
<%@page import="bean.SignDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
            	  //jsp객체 
                  //HttpServletRequest request = new HttpServletRequest();
                  //내장된 객체
                  //scriptlet(스크립트릿)
                  String id = request.getParameter("id");
                  String pw = request.getParameter("pw");
                  //자동import: 해당 클래스를 클릭하고, Ctrl + Shift + m 
                  SignDAO dao = new SignDAO();
                  boolean result =dao.read(id, pw);
                  String check = "이 AppleMango ID는 보안상의 이유로 사용하실 수 없습니다. 계정을 재설정 하십시요";
                  if(result){
                	  check = "환영합니다";
                  }
                  SignVO vo = new SignVO();
                  session.setAttribute("id", vo.getId());    
            %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인1</title>
	  
</head>
<body>
	<h3><%= check %></h3>
	<hr color = "blue">
	<a href="login.html">로그인 페이지로</a>
</body>
</html>