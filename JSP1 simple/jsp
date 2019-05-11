<%@page import="JSP1.DBconnection"%>
<%@page import="JSP1.Post"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is post table</title>
</head>
<body>
	<h1>Posts</h1>
	<%
    	DBconnection db = new DBconnection();
		ArrayList<Post> posts = db.getPosts();
     %>


<table border='1'>
	<tr>
	<th>id</th>
	<th>title</th>
	<th>body</th>
	</tr>
	<%
		for(Post post:posts)
		{
	%>
	<tr>
		<td><%= post.getId()%></td>
		<td><%= post.getTitle() %></td>
		<td><%= post.getBody() %></td>
	</tr>
	
	<%} %>
	
	</table>

</body>
</html>
