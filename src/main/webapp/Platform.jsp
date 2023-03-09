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
	<form action="goShow" method="get">
		<h1>Search By Show Name</h1>

		Search Show Name : <input type="text" name="name" /><br>
		 <input type="submit" value="Search" />
	</form>
	
	<form action="goPlatformName"  method="get">
	<h1>Search By Show Name</h1>

		Search Platfrom Name : <input type="text" name="platform" /><br>
		 <input type="submit" value="Search" />
	
	
	</form>
	
	<c:forEach  items="${message}" var="m">	</c:forEach>	
	<h5> <span style="colour:green">${message} </span></h5>
	
	<div>
		<table class="table">
			<tr>
				<th>ID</th>
				<th>Platform</th>
				<th>Show</th>
				<th>Language</th>
				<th>Cost</th>
				<th>Monthly-Pack</th>
				<th>EDIT</th>
				<th> DELETE </th>
			</tr>
			
			<c:forEach items="${list}" var="k">
				<tr>
					<td>${k.id}</td>
					<td>${k.platform}</td>
					<td>${k.show}</td>
					<td>${k.language}</td>
					<td>${k.cost}</td>
					<td>${k.monthlypack}</td>
					<td><a href="update?id=${k.id}"> Edit </a></td>
					<td><a href="delete?id=${k.id}"> Delete </a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
			
</body>
</html>