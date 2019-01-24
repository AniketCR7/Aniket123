<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



<style>


input{
padding:10px;
font-size:inherit;
margin-top:10px;
}

div{
background-color:#f9ccb1;
border-radius:100px;
width:500px;
margin-top:150px;
padding:10px;
}

body{
background-color:#ede3e3;
}

input[type="submit"]{
background:#f4c953;
}

input[type="reset"]{
background:#efcc6b;
}

h2{
font-size:25px;
font-style:italic;
color:#5b5959;
}

</style>
</head>
<body>


<center>
<div>
<h2>Sign Up</h2>
<form action="addDetails" method="post">
<input type="text" name="fname" placeholder="first name" required>  <br>
<input type="text" name="lname" placeholder="last name" required>  <br>
<input type="email" name="email"  placeholder="email" required>  <br>
<input type="password" name="pass" placeholder="password" required>  <br>
<input type="submit" value="Submit" name="submit" >  
</form>
</div>

</center>
</body>
</html>

 