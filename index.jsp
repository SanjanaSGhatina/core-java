<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Send Details of Favourite Person</h1>
<form action="fav" method="post">
First Name :- <input type="text" name="fname"/><br>
Last Name :- <input type="text" name="lname"/><br>
Gender :-<input type="radio" name="gen" value="male"/>Male<br>
<input type="radio" name="gen" value="female"/>Female<br><br><br>

Reason :- <textarea rows="8" cols="4" name="reason"></textarea><br>
Address :- <textarea rows="8" cols="4" name="address"></textarea><br>
<input type="submit" value="send"/>


</form>
</body>
</html>