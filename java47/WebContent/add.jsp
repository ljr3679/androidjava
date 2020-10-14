<%@page import="sun.swing.BakedArrayList"%>
<%@page import="login.BasketVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String product = request.getParameter("product");
    String price = request.getParameter("price");
    BasketVO vo = new BasketVO();
    vo.setProduct(product);
    vo.setPrice(price);
    ArrayList<BasketVO> list = null;
    if(session.getAttribute("basket") == null){
    	list = new ArrayList<>();
    }
    else{
    	list = (ArrayList<BasketVO>)session.getAttribute("basket");	
    }
    if(product != null){
    	list.add(vo);
    }
    session.setAttribute("basket", list);
   
 
    
    /* if(product!=null){

    if(session.getAttribute("basket") !=null){
    	//null이 아니라는 의미는 이미 장바구니가 만들어져 있다는 애기
    	//기존에 있던 세션으로 잡아둔 장바구니 목록을 가지고 와서
    	//거기에다가 새로운 장바구니 물건을 추가한다.
    	list = (ArrayList<String>)session.getAttribute("basket");
    	list.add(product);
    }else{
    	//null이라는 의미는 장바구니 목록이 안만들어져있다는 애기
    	list = new ArrayList<>();
    }
    list.add(product);
    session.setAttribute("basket", list);
	
} */
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>장바구니의 개수<%= list.size() %>개 들어 있음.</h3>
<h3>장바구니 목록</h3>
<%
for(int i = 0; i<list.size(); i++){
	BasketVO vo1 = list.get(i);
%>
	<%= vo1.getProduct() %>
	<%= vo1.getPrice() %><br>
<%
}
%>
<hr color="green">
<a href="장바구니에넣기.jsp"><input type="submit" value="장바구니"></a>
<a href="null.jsp"><input type="submit" value="장바구니  비우기"></a>
</body>
</html>