<%@page import="login.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
	String id = request.getParameter("id");
    MemberDAO dao = new MemberDAO();
    int result = dao.read(id);
    
%><%= result %>