<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Wall</title>
<link rel="stylesheet" href="./css/blog.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
</head>
<body>
<nav>
		<img src="./assets/logo.svg" alt = "">
		<ul>
			<li> <a href="${pageContext.request.contextPath}/myblogs">My Blogs</a></li>
			<li> <a href="${pageContext.request.contextPath}/allblogs">All Blogs</a></li>
			<li> <a href="${pageContext.request.contextPath}/login">Login</a></li>	
			<li> <a href="${pageContext.request.contextPath}/signup">SignUp</a></li>
		</ul>	
	</nav>
	<div class="body-div1">
	<div > Your Blogs Post</div>
	<a href="${pageContext.request.contextPath}/new"><button class= "button" id="addBlog">
	<i class="fas fa-plus-circle"></i>Add New Post</button></a>
	
	</div>
	

</body>
</html>