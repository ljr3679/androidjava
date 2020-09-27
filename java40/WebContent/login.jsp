<%@page import="bean.MemberVO"%>
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
                  //자동import: 해당 클래스를 클릭하고, Ctrl + Shift + m 
                  MemberDAO dao = new MemberDAO();
                  boolean result =dao.read(id, pw);
                  String check = "입력이 바르지 않습니다";
                  if(result){
                	  check = "반갑습니다"  ;
                  }
                
            %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<h3><%= check %></h3>

<hr color = "blue">
<a href="login.html">로그인 페이지로</a>
</body>
</html>