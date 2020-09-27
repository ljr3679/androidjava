<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="vo" class="bean.BbsVO"></jsp:useBean>
    
    <jsp:setProperty property="*" name="vo"/>
    
    
    
    <%//jsp객체 
  	BbsDAO dao = new BbsDAO();
    boolean result = dao.create(vo);
    
    
      //1.VO를 만들어서
  /*  BbsVO vo = new BbsVO();
      //2.전달되는 값 받은 다음, VO에 넣어야 한다.
      int no = Integer.parseInt(request.getParameter("no"));
      String title = request.getParameter("title");
      String content = request.getParameter("content");
      String writer = request.getParameter("writer");
     
      vo.setNo(no);
      vo.setTitle(title);
      vo.setContent(content);
      vo.setWriter(writer);
      //3.DAO이용해서, insert처리함.
      BbsDAO dao = new BbsDAO();
      boolean result = dao.create(vo);
      //4.처리결과를 client 알려주어야함.*/
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
</head>
<body>
<h3>게시글 <%= check %> 입니다</h3>
넘버 : <%= vo.getNo() %><br><!-- expressiong : 표현식 -->
제목 : <%= vo.getTitle() %><br>
내용 : <%= vo.getContent() %><br>
작성자 : <%= vo.getWriter() %><br>
<a href="bbs.html">게시판 페이지로</a>
</body>
</html>