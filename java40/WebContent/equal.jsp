<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
 
    String id = request.getParameter("id");
    
    MemberDAO dao = new MemberDAO();
    int result =dao.read(id);
    String check = "사용가능 아이디 입니다.";
    if(result == 1){//있음
  	  check = "사용불가 존재 합니다";
    }
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h3>이아이디는  <%= check %></h3>
	
</body>
</html>