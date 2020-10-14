<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
   String pw = request.getParameter("pw");
   String pw1 = request.getParameter("pw1");
   
   String pwch = "<font color=red><b>ⓘ  비밀번호가 달라요</b></font>";
   if(pw.equals(pw1)){
	   pwch = "<font color=blue><b>ⓘ 비밀번호 사용가능</b></font>";
   }
   %><%=pwch %>
  
