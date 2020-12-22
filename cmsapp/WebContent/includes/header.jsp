<%String name=(String)session.getAttribute("name");
	if(name==null){
%>
<div class="header">
		<div id="logo">
			<h2>CMS APP</h2>
		</div>
		<div class="navigation" >
			<ul>
				<li>
					<a href="index.jsp">Home</a> |
				</li>
				<li>
					<a href="signIn.jsp">Sign In</a> |
				</li>
				<li>
					<a href="signUp.jsp">Sign Up</a>
				</li>
			</ul>
		</div>
	</div>
	<%} else {
		
	%>
	
	<div class="header">
		<div id="logo">
			<h2>CMS APP</h2>
		</div>
		<div class="navigation" >
			<ul>
				<li>
					<a href="logout.jsp">Logout</a> 
				</li>
			</ul>
		</div>
	</div>
	<%}%>