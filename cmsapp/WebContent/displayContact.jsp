<%@page import="com.yash.cmsapp.domain.Contact"%>
<%! Contact contact=new Contact();%>
<%contact =(Contact)session.getAttribute("contact"); %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Contact</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp" />
		<div class="main">
			<h2>
				User Dashboard :
				<%=session.getAttribute("name")%></h2>
			<h3>Matched Contact :</h3>
			<form method="post" action="userDashboard.jsp">
				<table>
					<tr>
						<td>Id : </td>
						<td><lable id="formDB"><%=contact.getId()%></lable></td>
					</tr>
					<tr>
						<td>User Id : </td>
						<td><lable id="formDB"><%=contact.getUserId()%></lable></td>
					</tr>
					<tr>
						<td>Name : </td>
						<td><lable id="formDB"><%=contact.getName()%></lable></td>
					</tr>
					<tr>
						<td>Contact : </td>
						<td><lable id="formDB"><%=contact.getContact()%></lable></td>
					</tr>
					<tr>
						<td>Address : </td>
						<td><lable id="formDB"><%=contact.getAddress()%></lable></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><lable id="formDB"><%=contact.getEmail()%></lable></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit"
							value="Exit"></input></td>
					</tr>

				</table>
			</form>

		</div>
		<jsp:include page="./includes/footer.jsp" />
	</div>
</body>
</html>