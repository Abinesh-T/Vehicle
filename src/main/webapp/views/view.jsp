<%@page import="com.model.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="com.model.VehicleDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%VehicleDAO vd=new VehicleDAO(); 
List<Vehicle> vl =vd.getProducts();
for (Vehicle element : vl)
{
	element.getvID();
}
%>
<% %>
</body>
</html>