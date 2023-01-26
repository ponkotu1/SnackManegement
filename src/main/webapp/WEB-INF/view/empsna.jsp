<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="syoregi" method="get">
	<h3>商品登録</h3>
	商品名<input type="text" name="name"><br>
	値段<input type = "text" name="nedan"><br>
	商品詳細：<br>
		<textarea name="note" rows="10" cols="50" placeholder="詳細を入力"></textarea><br>
	<input type="submit" value="登録">
	</form>
</body>
</html>