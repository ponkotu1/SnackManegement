<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Snack" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>お菓子商品削除画面</h1>
	<p>削除する商品のコードを入力してください。</p>
	<form action="deleteSelect" method="get">
	コード：<input type="text" name= "id">
	<input type="submit" value="削除">
	<a href="./">ひとつ前の画面に戻る</a>
	</form>
</body>
</html>