<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Sign In</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp"/>
		
		<div class="main">
			<h2>Registration</h2>
			<form method="post" action="UserRegistrationController">
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
						<td>Login Name</td>
						<td>
							<input type="text" name="loginName"></input>
						</td>
					</tr>
					<tr>
						<td>Password</td>
						<td>
							<input type="password" name="password"></input>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" value="Register"></input>
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		<jsp:include page="./includes/footer.jsp"/>
	</div>
</body>
</html>