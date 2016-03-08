<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="wrapper clearfix">
    <div>
        <h2>List of products</h2>
    </div>
    <div>
        <div class="table-responsive">
            <table class="table">
                <thead>
                <tr style="font-weight: bold;">
                    <td>ID</td>
                    <td>Name</td>
                    <td>Quantity</td>
                    <td>Price</td>
                    <td>Creator</td>
                    <td></td>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="item" items="${lstProduct}" varStatus="status">
                    <tr <c:if test="${item.price == -1}">class="sales"</c:if>>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.quantity}</td>
                        <td>${item.price}</td>
                        <td>${item.user}</td>
                        <td><a href="#" title="Edit"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
</div>