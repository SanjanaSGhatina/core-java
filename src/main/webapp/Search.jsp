<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="nav_bar.jsp" %>
</head>
<body>
<h3><span style="color:red;">${message} </span></h3>

	<form action="search" method="get">

		Search By Id <input type="text" name="id"><br> <input
			type="submit" value="search">

		<pre>
			Platform : ${dto.platform}
			Show : ${dto.show}
			Language : ${dto.language}
			Cost : ${dto.cost}
			Monthly-pack : ${dto.monthlypack}
			
			
			</pre>
	</form>
</body>
</html>