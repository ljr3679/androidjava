<%@page import="bean.SignVO"%>
<%@page import="bean.SignDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="vo" class="bean.SignVO"></jsp:useBean>
	<!-- useBean액션태그 : new를 가지고 객체생성, import역할 -->
	<jsp:setProperty property="*" name="vo"/>
     <%
        String id = request.getParameter("id");
                    SignDAO dao = new SignDAO();
                    SignVO vo2 = dao.one(id);
                    
                    
                    SignDAO dao2 = new SignDAO();
                    boolean result = dao2.update(vo);            
                   
     %>
        
        
<!DOCTYPE html>
<html>
<head>
 <title>회원정보수정1</title>
  
<body>
<h3>업데이트 결과는<%= result %>입니다.!!</h3>
<%= vo.getId() %><br>
<%= vo.getName() %><br>
<%= vo.getBirth() %><br>
<%= vo.getTel() %><br>
<%= vo.getPw() %><br>


</body>
</html>