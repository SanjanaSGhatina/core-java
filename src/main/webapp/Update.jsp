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

<h1> OTT UPDATE</h1>
	
	<c:forEach items="${err}" var="e">
	<p > <span style="color:red">  ${e.message	} </span> </p>
	</c:forEach>
	
	
	<c:forEach items="${cv}" var="e">
	<p > <span style="color:red">  ${e.message	} </span> </p>
	</c:forEach>
	
		<c:forEach  items="${messages}" var="m">
			</c:forEach>	<h5> <span style="color:green">${messages} </span></h5>

	<form action="update" method="post">
		<pre>
		 ID : <input type="text" name="id" value="${dto.id}" readonly />
		 
		  platform : <select name="platform">
         <option value="${dto.platform}">${dto.platform}</option>
			<c:forEach items="${platform}" var="a">
				<option value="${a}">${a}</option>
			</c:forEach>
		</select> 
		
		Show : <input type="text" name="show" value="${dto.show}"/>
		
	
		
		 Language : <select name="language">
			<option value="${dto.language}">${dto.language}</option>
			<c:forEach items="${language}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
		</select> 
		

	   
		Cost : <input type="number" name="cost" value="${dto.cost}" /><br>
		
		Monthly-Pack : <input type="text" name="monthlypack" value="${dto.monthlypack}" />
		
		<input type="submit" value="update" />
		</pre>
	</form>

</body>
</html>