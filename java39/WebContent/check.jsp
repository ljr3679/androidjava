
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--
    	1.클라이언트가 입력해서 제출한 데이터를 받아와야 한다.  =>네트워트 전송
    	2.DB연동해서 처리해서 결과 받아와야 한다.
    	3.받아온 결과에 따라서 화면을 (html)만들어서 클라이언트에게 전송한다.
      -->
      
      <%
            	//jsp객체 
                  //HttpServletRequest request = new HttpServletRequest();
                  //내장된 객체
                  //scriptlet(스크립트릿)
                  String id = request.getParameter("id");
                  String pw = request.getParameter("pw");
                  //자동import: 해당 클래스를 클릭하고, Ctrl + Shift + m 
                  MemberDAO dao = new MemberDAO();
                  boolean result =dao.read(id, pw);
                  String check = "로그인 not";
                  if(result){
                	  check = "로그인 ok";
                  }
            %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신이 입력한 정보 결과는 <%= check %></h3>
<hr color = "red">
아이디 : <%= id %><br><!-- expressiong : 표현식 -->
비밀번호 : <%= pw %><br>
<hr color = "blue">
<a href="login.html">로그인 페이지로</a>
</body>
</html>