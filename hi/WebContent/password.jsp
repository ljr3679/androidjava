<%@page import="bean.SignVO"%>
<%@page import="java.util.List"%>
<%@page import="bean.SignDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	    	
    	String id = request.getParameter("id");
    	String tel = request.getParameter("tel");
    	SignDAO dao = new SignDAO();
    	List<SignVO> list = dao.all(id, tel);
    	
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>암호찾기1</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/NewFile.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script>

</script>

</head>

<body>
<div class="container">
	<h1>당신의 비밀 번호는!!</h1>
	<form action="login.html">
    <div class="form-group">
    <%
		for (int i = 0; i < list.size(); i++) {
			SignVO vo = list.get(i);		
	%>
	<input type="password" class="form-control" name="pw"  id="pw" value = "<%= vo.getPw()%>">
	<%
		}
	%>
    </div>
    <div class="form-group">
      <input type="submit" class="form-control1" value="로그인 페이지로" name="login">
    </div>
    
    

    </form>
</div>
  
</body>
</html>