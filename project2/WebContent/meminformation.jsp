<%@page import="java.io.PrintWriter"%>
<%@page import="login.SignVO"%>
<%@page import="login.SignDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="vo" class="login.SignVO"></jsp:useBean>
	<!-- useBean액션태그 : new를 가지고 객체생성, import역할 -->
	<jsp:setProperty property="*" name="vo"/>
	
	<%
	
	%>
    
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인1</title>
<link rel="stylesheet" href="css/styles.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	  
  
</head>
<body>

	<%
	

		SignDAO dao2 = new SignDAO();
		boolean result = dao2.update(vo);
		String check = "정보수정에 실패하였습니다.!!";
		if (result == true) {
			PrintWriter script = response.getWriter();
			check = "ok";
			script.println("<script>");
			script.println("alert('정보수정을 완료 하였습니다!')");
			script.println("location.href='main.html'");
			script.println("</script>");
		} else if (result == false) {
			PrintWriter script = response.getWriter();
			check = "no";
			script.println("<script>");
			script.println("alert('정보수정을 다시 시도 해주세요')");
			script.println("history.back()");
			script.println("</script>");

		}
	%>



</body>
</html>

