<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.removeAttribute("basket");
    session.removeAttribute("price");
    %>

    <jsp:forward page="add.jsp"></jsp:forward>