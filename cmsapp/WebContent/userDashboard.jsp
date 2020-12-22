<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Dashboard</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp"/>
		<div class="main">
			<h2>User Dashboard : <%=session.getAttribute("name")%></h2>
			<h3> Services :</h3> 
			<div class="service" >
			<ul>
				<li>
					<a href="createContact.jsp">Create Contact</a> 
				</li>
				<li>
					<a href="editContact.jsp">Edit Contact</a> 
				</li>
				<li>
					<a href="deleteContact.jsp">Delete Contact</a>
				</li>
				<li>
					<a href="searchContact.jsp">Search Contact</a>
				</li>
				<li>
					<a href="seeAllContact.jsp">See All Contact</a>
				</li>
			</ul>
		</div>
		</div>
		<jsp:include page="./includes/footer.jsp"/>
	</div>
</body>
</html>