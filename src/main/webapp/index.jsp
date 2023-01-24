<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>	ログイン画面</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		if(request.getParameter("error") != null){	
	%>
		<p style="color:red">ログイン失敗</p>
	<form action="LoginServlet" method="post">
		 <div class="login_form_top">
    		<h1>ログイン画面</h1>
    		<p>ユーーザID、パスワードをご入力の上、「ログイン」ボタンをクリックしてください。</p>
  		</div>
  		<div class="login_form_btm">
		<input type="text" name="mail" placeholder="ログインIDを入力してください" value="<%request.getParameter("mail"); %>>"><br>
		<input type="password" name="pw" placeholder="パスワードを入力してください"><br>
		</div>
		<input type="submit" value="ログイン"><br>
		<a href="RegisterFormServlet">新規登録はこちら</a>
	</form>
	
	<%
		} else {
	%>
	<form action="LoginServlet" method="post">
		 <div class="login_form_top">
    		<h1>ログイン画面</h1>
    		<p>ユーーザID、パスワードをご入力の上、「ログイン」ボタンをクリックしてください。</p>
  		</div>
  		<div class="login_form_btm">
		<input type="text" name="mail" placeholder="ログインIDを入力してください"><br>
		<input type="password" name="pw" placeholder="パスワードを入力してください"><br>
		</div>
		<input type="submit" value="ログイン"><br>
		<a href="RegisterFormServlet">新規登録はこちら</a>
	</form>
	
	<%
		}
	%>
</body>
</html>