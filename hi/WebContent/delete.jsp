<%@page import="bean.SignDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
        SignDAO dao = new SignDAO();//1~2단계
        boolean result1 =dao.read(id, pw);
        String check = "AppleMango ID와 암호가 일지하지 않습니다.";
        if(result1){
      	  check = "ok";
        }
        SignDAO dao2 = new SignDAO();//1~2단계
        boolean result = dao2.delete(id);
        String check1 = "탈퇴처리중 문제가 발생함. 탈퇴처리가 되지 않음.";
        if(result){
        		check1 = "탈퇴완료";
        }
      	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계정삭제1</title>
</head>
<body>
<h3>탈퇴 결과는 아래와 같습니다.</h3>
<hr color="blue">
<span style = "color:red"></span>
<%=check %><br>
<%=check1 %>

</body>
</html>