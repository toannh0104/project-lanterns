<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: toannh
  Date: 2/25/2016
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <style>
        .actived{
            background-color: darkcyan;
        }
        .head{
            background: darkgray;
        }
    </style>
</head>
<body>
<table>
    <thead>
        <tr>
            <th colspan="6"><span>Hi: </span> <b>${user} / <a href="/logout">Logout</a></b> </th>
        </tr>
        <tr>
            <th colspan="6" >List of Rina's Products</th>
        </tr>
        <tr class="head">
            <td>ID</td>
            <td>Name</td>
            <td>Quantity</td>
            <td>Time</td>
            <td>Detail</td>
            <td>User</td>
        </tr>
    </thead>

<c:forEach var="item" items="${lstProduct}" varStatus="status">
    <tr <c:if test="${status.index % 2==0}" >class="actived"</c:if> >
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.quantity}</td>
        <td><fmt:formatDate value="${item.createTime}" pattern="MM/dd/yyyy"/></td>
        <td>${item.detail}</td>
        <td>${item.user}</td>
    </tr>
</c:forEach>
</table>
hello product page
</body>
</html>
