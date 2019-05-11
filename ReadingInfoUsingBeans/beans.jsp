<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> <h1> Reading information using beans</h1>


<jsp:useBean id = "user" class = "jjbean.JBean"  > </jsp:useBean>   <!-- here "user" is the object & bean.JBean is the class , created by java-jsp -->
<jsp:setProperty property="*" name="user"/>
Username= <jsp:getProperty property="username" name="user"/> <br>
password= <jsp:getProperty property="password" name="user"/> <br>



</body>
</html>
