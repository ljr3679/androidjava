<%@page import="java.util.List"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String title = request.getParameter("title");
    	BbsDAO dao = new BbsDAO();
    	List<BbsVO> list = dao.all(title);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type ="text/css">
	td{
		width : 100px;
		text-align: center;
	}
	.td{
		background: yellow;
	}

</style>
</head>
<body>
<h3 style="color: blue">
		게시글은 <%=list.size()%> 개 입니다.	</h3>

	
	<table border="1">
	<tr>
		<td class="td">넘버</td>
		<td class="td">제목</td>
		<td class="td">내용</td>
		<td class="td">작성자</td>
	</tr>
	
	<%
		for (int i = 0; i < list.size(); i++) {
			BbsVO vo = list.get(i);
			
	%>
	
	<tr>
		<td><%=vo.getNo()%></td>
		<td><%=vo.getTitle()%></td>
		<td><%=vo.getContent()%></td>
		<td><%=vo.getWriter()%></td>
	</tr>
	
	<%--검색된 id <%=vo.getId()%><br>
	검색된 pw <%=vo.getPw()%><br>
	검색된 name <%=vo.getName()%><br>
	검색된 tel <%=vo.getTel()%><br><br>--%>
	
	
	
	<%--검색된 id <%=list.get(i).getId()%><br>
	검색된 pw <%=list.get(i).getPw()%><br>
	검색된 name <%=list.get(i).getName()%><br>
	검색된 tel <%=list.get(i).getTel()%><br><br>--%>

	<%
		}
	%>
	</table>
</body>
</html>