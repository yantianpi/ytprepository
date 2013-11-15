<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>注册</h1>
<form action="register.action" method="post">
用户名<input type="text" name="name" value="" /><br />
年龄<input type="text" name="age" value="" /><br />
性别   男<input type="radio" name="sex" value="male" />女<input type="radio" name="sex" value="female" /><br />
时间<input type="text" name="time" value="输入一串数字" /><br />
<input type="submit" value="注册">
</form>
</body>
</html>