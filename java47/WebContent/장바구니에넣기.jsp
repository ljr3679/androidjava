<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function check(){
	add = document.getElementById('add').value
	location.href="add.jsp"
}

</script>
</head>
<body>
<form action="add.jsp">
<h3>장바구니에 넣기</h3>
<hr color="red">
<select name="product">
	<option value="watch">시계</option>
	<option value="ballpen">볼펜</option>
	<option value="noteBook">노트북</option>
</select>
<br>
<select name="price">
	<option value="10000">10000원</option>
	<option value="20000">20000원</option>
	<option value="30000">30000원</option>
</select>
<hr color="green">
<a><input onclick="check()" type="submit" value="장바구니로 추가" name="add" id="add"></a>
</form>
</body>
</html>