<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Create Contact</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp"/>
		
		<div class="main">
			<h2>Contact Addition </h2>
			<form method="post" action="ContactCreationController">
				<table>
					<tr>
						<td>Name</td>
						<td>
							<input type="text" name="name"></input>
						</td>
					</tr>
					<tr>
						<td>Contact</td>
						<td>
							<input type="text" name="contact"></input>
						</td>
					</tr>
					<tr>
						<td>Address</td>
						<td>
							<input type="text" name="address"></input>
						</td>
					</tr>
					<tr>
						<td>Email</td>
						<td>
							<input type="text" name="email"></input>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" value="Create Contact"></input>
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		<jsp:include page="./includes/footer.jsp"/>
	</div>
</body>
</html>