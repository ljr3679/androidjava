<%@page import="java.io.PrintWriter"%>
<%@page import="login.SignVO"%>
<%@page import="login.SignDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
                  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인1</title>
<link rel="stylesheet" href="css/NewFile.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	  
  
</head>
<body>

   <%
   	String id = request.getParameter("id");
         				 String pw = request.getParameter("pw");
         				 String check = null;
                        SignDAO dao = new SignDAO();
                        SignVO bag = new SignVO();
                        bag.setId(id);
                        bag.setPw(pw);
                        boolean result1 = dao.read(bag);
                        if(result1 == true){
                     	  PrintWriter script = response.getWriter();
                      	  check = "ok";
                      	  script.println("<script>");
                      	  script.println("alert('환영합니다')");
                      	  script.println("location.href='main.html'");
                      	  script.println("</script>");
                      	  session.setAttribute("id", bag.getId());
                        }else if(result1 == false){
                      	  PrintWriter script = response.getWriter();
                      	  check = "no";
                      	  script.println("<script>");
                			  script.println("alert('로그인 실패!')");
                			  script.println("history.back()");
              		      script.println("</script>");
                        }
                         
                        session.setAttribute("id", bag.getId());
   %>




</body>
</html>