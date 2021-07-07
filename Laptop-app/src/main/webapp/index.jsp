<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>landing page</title>
</head>
<body>
<h1>Welcome to spring mvc</h1>
<form action="laptop.do" method="post">
<pre>
<label>Name</label><input type="text" name="laptopName">
<label>Brand</label><input type="text" name="laptopBrand">
<label>Ram</label><input type="number" name="ram">
<label>Cost</label><input type="number" name="cost">
<pre>
<input type="submit" value="submit the form">
</form>
<h2>${ResponseMessage}</h2>
<h3>${display}</h3>
<a href="abc.do">clickhere</a>
</body>
</html>