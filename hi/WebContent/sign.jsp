<%@page import="bean.SignDAO"%>
<%@page import="bean.SignVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <jsp:useBean id="vo" class="bean.SignVO"></jsp:useBean>
    
    <jsp:setProperty property="*" name="vo"/>
    
   <%
    SignDAO dao2 = new SignDAO();   
    String id = request.getParameter("id");
    int result2 =dao2.read(id);
    String check1 = "사용가능 입니다.";
    if(result2 == 1){//있음
  	  check1 = "사용불가 입니다";
    }
   
    SignDAO dao = new SignDAO();
    boolean result = dao.create(vo);
    
    String check = "작성실패";
    if(result){
  	  check = "작성성공!!!!!"; 
    }
    
    %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>  
<meta charset="utf-8">

</head>
<body>
<%= check1 %><br>
<%= check %>

<a href = "sign.html">회원가입 페이지로</a>

</body>
</html>