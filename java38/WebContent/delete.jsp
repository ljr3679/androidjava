<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
        MemberDAO dao = new MemberDAO();//1~2단계
        boolean result = dao.delete(id);
        String check = "탈퇴처리중 문제가 발생함. 탈퇴처리가 되지 않음.";
        	if(result){
        		check = "탈퇴완료!!";
        	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>탈퇴 결과는 아래와 같습니다.</h3>
<hr color="blue">
<span style = "color:red"></span>
<%=check %>

</body>
</html>