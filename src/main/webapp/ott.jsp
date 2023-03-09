<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<%@ include file="nav_bar.jsp" %>
</head>
<body>



	<c:forEach items="${cv}" var="e">
		<p>
			<span style="color: red"> ${e.message	} </span>
		</p>
	</c:forEach>

	<c:forEach items="${suc}" var="e">
		<p>
			<span style="color: red"> ${e.message	} </span>
		</p>
	</c:forEach><br>




<form action="otttv" method="post">
	<pre>
		
	   platform : <select name="platform">
			<option value="">SELECT</option>
			<c:forEach items="${platform}" var="a">
				<option value="${a}">${a}</option>
			</c:forEach>
		</select> 
		
		Show : <input type="text" name="show" />
		
	
		
		 Language : <select name="language">
			<option value="">SELECT</option>
			<c:forEach items="${language}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
		</select> 
		

	   
		Cost : <input type="number" name="cost" /><br>
		
		Monthly-Pack : <input type="text" name="monthlypack" />
		
		
		
		<input type="submit" value="send" />
		</pre>

	</form>


</body>
</html>