<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<%@ include file="nav_bar.jsp" %>
</head>
<body>
	<h1>Display Content</h1>
	<form method="get" action="email">
		<h3>Display Email : ${email}</h3>
		<input type="submit" value="email" />
	</form>

	<form method="get" action="mobile">
		<h3>Display MobileNo : ${mobile}</h3>
		<input type="submit" value="Mobile" />
	</form>

	<form method="get" action="aadhar">
		<h3>Display Aadhar Number : ${aadhar}</h3>
		<input type="submit" value="Aadhar" />
	</form>

	<form method="get" action="age">
		<h3>Display Age : ${age}</h3>
		<input type="submit" value="Age" />
	</form>

	<form method="get" action="date">
		<h3>Display Date with Time : ${date}</h3>
		<input type="submit" value="Date with Time" />
	</form>

	<form method="get" action="salary">
		<h3>Display Salary : ${salary}</h3>
		<input type="submit" value="Salary" />
	</form>

	<form action="frnds">
		<h3>Display Friends Name :</h3>
		<input type="submit" value="Show Friends Name" />
		<ul>
			<c:forEach items="${abc}" var="name">
				<li>${name}</li>
			</c:forEach>
		</ul>
	</form>
	
	<form action="place">
		<h3>Display Visited Places :</h3>
		<input type="submit" value="Show Visited Places" />
		<ul>
			<c:forEach items="${place}" var="name">
				<li>${name}</li>
			</c:forEach>
		</ul>
	</form>
	
	<form action="skill">
		<h3>Display Skills :</h3>
		<input type="submit" value="Show Skills" />
		<ul>
			<c:forEach items="${skill}" var="educa">
				<li>${educa}</li>
			</c:forEach>
		</ul>
	</form>
	
	<form action="dto" method="get">
	<h3>Display Education DTO : ${eduDto}</h3>
	<label>MCA College Name : ${eduDto.MCA}</label><br>
	<label>MCA Subject-1 : </label><br>
	<label>MCA Subject-2 : ${eduDto.Sub2}</label><br>
	<label>MCA Subject-3 : ${eduDto.Sub3}</label><br>
	<label>MCA Subject-4 : ${eduDto.Sub4}</label><br>
	<label>MCA Subject-5 : ${eduDto.Sub5}</label><br>
	
	<input type="submit" value="Education"/>
	</form>
	
	
	
	<form class="fm" action="mob" method="get">
    <h3>Display Mobile : </h3> <br>
          <label>Name  : ${mobi.name} </label> <br>
          <label>Model  :${mobi.model} </label> <br>
          <label>Price :${mobi.price} </label> <br>
          <label>Ram : ${mobi.ram}</label> <br>
  		<input type="submit" value="Get Mobile Deatils" /><br>

	</form>
	
	
	
	
	
	
	<form class="fm" action="chat" method="get">
    <h3>Display Chat List : </h3> <br>
          <label>Name  : ${chat.name} </label> <br>     
          <label>Location  : ${chat.location} </label> <br>
          <label>Price  : ${chat.price} </label> <br>
          <label>Chat 1  : ${chat.chat1} </label> <br>
          <label>Chat 2 : ${chat.chat2} </label> <br>
          <label>Chat 3  : ${chat.chat3} </label> <br>
          <label>Chat 4  : ${chat.chat4} </label> <br>
          <label>Chat 5  : ${chat.chat5} </label> <br>
          <label>Chat 6  : ${chat.chat6} </label> <br>
  		<input type="submit" value="Get Chat Deatils" />

	</form>

</body>
</html>