<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%
        int no = Integer.parseInt(request.getParameter("no"));
                    BbsDAO dao = new BbsDAO();
                    BbsVO vo = dao.one(no);
        %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= vo.getNo() %>번 글 수정 페이지 입니다.</h3>
<hr color = "blue">
<form action="update4.jsp">
		<table>
			<tr align="center">
				<td width="100" bgcolor="yellow">번호</td>
				<td width="100" bgcolor="pink"><input type="text" name="no"
					value="<%= vo.getNo() %>"></td>
					<%--<input type="hidden" name="id" value="<%= vo.getNo() %>>--%>
			</tr>

			<tr align="center">
				<td width="100" bgcolor="yellow">제목</td>
				<td width="100" bgcolor="pink"><input type="text" name="title"
					value="<%= vo.getTitle() %>"></td>
			</tr>

			<tr align="center">
				<td width="100" bgcolor="yellow">내용</td>
				<td width="100" bgcolor="pink"><input type="text" name="content"
					value="<%= vo.getContent() %>"></td>
			</tr>

			<tr align="center">
				<td width="100" bgcolor="yellow">작성자</td>
				<td width="100" bgcolor="pink"><input type="text" name="writer"
					value="<%=vo.getWriter()%>"></td>
			</tr>

			<tr align="center">
				<td colspan="2">
					<button type="submit">수정처리 요청</button>
				</td>
			</tr>
		</table>

	</form>

<hr color="green">


[<a href="index.html">
<button style = background:green>처음페이지로</button>
</a>]
<!-- 수정 -->
[<a href="one2.jsp?no=<%= vo.getNo() %>">
<button style = background:lightgreen>수정</button>
</a>]
[<a href="delete2.jsp?id=<%= vo.getNo() %>">삭제</a>]
</body>
</html>