<%@page import="login.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="vo2" class="login.MemberVO2"></jsp:useBean>
    <<jsp:setProperty property="*" name="vo2"/>
    
<%  
MemberDAO2 dao2 = new MemberDAO2();
boolean result =dao2.create(vo2);
%><%=result%>