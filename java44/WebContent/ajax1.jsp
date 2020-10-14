<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	//�ݹ��Լ�(call-back�Լ�)
	//Ư���� �̺�Ʈ�� ��ٷȴٰ� �� �̺�Ʈ�� �߻��ϸ� 
	//�Լ��� ���� �Ǿ� �ִ� ������ ���ư� �ڵ� ȣ��Ǵ� �Լ�
	//body�� ���� ������Ʈ(�±�)�� ���� �������� dom-tree�� ������ ��
	//�ݹ��Լ��� ���� �ϰ� �Ǿ�����.
	//�������� ��ũ��Ʈ�� ���� �����ϰ� �ν��ϴ� ���� �ƴ϶�
	//body�κ��� ���� �о dom-tree�� ���鵵�� �ؾ���.
	$(function () {
		$("#b1").click(function () {//b1 buttonŬ���� �׼�
			$.ajax({//ajax
				url:"data/member.xml",//member.xml ����
				success: function (doc) { //���� ���� ���� 
					console.log('XML��û ����!!')//xml ������ ��û ���� Ȯ��
					console.log('XML��û ��� :' + doc)//xml ��û���(doc) Ȯ��
					list = $(doc).find('record')//list�� ��ü record Ȯ��
					console.log('���ڵ��� ���� :' + list.length)//���ڵ� ���� console���� Ȯ��
					if(list.length > 0){//���ڵ尡 0���� ũ��
						$(list).each(function () {//for-each��
							id = $(this).find('id').text()//��ü id�� ���� ��
							first_name = $(this).find('first_name').text()
							last_name = $(this).find('last_name').text()
							email = $(this).find('email').text()
							gender = $(this).find('gender').text()
							ip_address = $(this).find('ip_address').text()
							$("#d1").append(id + "<br>")//append�� ��ü id�� ���
							$("#d1").append(first_name + "<br>")
							$("#d1").append(last_name + "<br>")
							$("#d1").append(email + "<br>")
							$("#d1").append(gender + "<br>")
							$("#d1").append(ip_address + "<br>")	
						})
						$.ajax({
								url:"db1.jsp",//db1.jsp�� ����.
								data:{//db1.jsp���� �����͸� �ҷ���.
									id : id,//id
									first_name : first_name,
									last_name : last_name,
									email : email,
									gender : gender,
									ip_address : ip_address
								},
								success:function(result){//���� �������� Ȯ��
									alert("db1.jsp�� ���ؼ� db�� �ֱ�!-���������� ������.")//alert�� �������� �����
									alert("db1.jsp�� ��� : " + result)//alert�� db create��� �����	
								}
							})
							
					}					
				}
			})
		})
		
		
		
		$("#b2").click(function () {
			$.ajax({
				url:"data/member.json",
				success: function (doc) {
					console.log('JSON��û ����!!')
					console.log(doc)
					$(doc).each(function (index, item) {
						id = item.id,
						first_name = item.first_name,
						last_name = item.last_name,
						email = item.email,
						gender = item.gender,
						ip_address = item.ip_address
						$("#d1").append(id + "<br>")//append�� ��ü id�� ���
						$("#d1").append(first_name + "<br>")
						$("#d1").append(last_name + "<br>")
						$("#d1").append(email + "<br>")
						$("#d1").append(gender + "<br>")
						$("#d1").append(ip_address + "<br>")	
					})
					
				}
			})
			
		})
		
		
		
		
		$("#b3").click(function () {
			
		})
	})
	</script>
</head>
<body>
<button id="b1">XML�о����</button>
<button id="b2">JSON�о����</button>
<button id="b3">DB�� �ֱ�</button>
<div id="d1"></div>

</body>
</html>