<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="text" uri="http://rina.vsii.vn/text" %>
<%--
  Created by IntelliJ IDEA.
  User: toannh
  Date: 3/8/2016
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th colspan="2" >Danh mục loại sản phẩm</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>ID</td>
        <td>Name</td>
    </tr>
    <c:forEach var="item" items="${categories}" >
        <tr>
            <td>${item.id}</td>
            <td><a href="/san-pham/danh-muc/${item.id}/${text:createAlias(item.name)}.html" >${item.name}</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
