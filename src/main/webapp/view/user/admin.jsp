<%--
  Created by IntelliJ IDEA.
  User: toannh
  Date: 3/2/2016
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Admin page</title>
</head>
<body>
Dear <strong>${user}</strong>, Welcome to Admin Page.
<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>