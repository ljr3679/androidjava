<%@page import="bean.SignDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 1. 넘어오는 4개의 값을 받아서 vo에 넣어준다. -->
    
    <!-- 액션태그 -->
    <jsp:useBean id="vo" class="bean.SignVO"></jsp:useBean>
	<!-- useBean액션태그 : new를 가지고 객체생성, import역할 -->
	<jsp:setProperty property="*" name="vo"/>
	<!-- setProperty액션태그:클라이언트가 전송한 파라메터 받아오고, vo의set()메서드를 호출해옴. --> 
    <!-- 2. dao를 이용해서 update시킨다. -->
    <%
    SignDAO dao = new SignDAO();
    boolean result = dao.update(vo);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
 <title>회원정보수정2</title>
  
<body>

<h3>업데이트 결과는<%= result %>입니다.!!</h3>
</body>
</html>