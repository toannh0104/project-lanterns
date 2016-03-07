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
    <link rel="stylesheet" href="/static/css/wrapper.css" />
</head>
<body class="ng-scope">
<!-- CONTAINER -->
<div class="container-wrap search_category-page">
    <%@include file="menu.jsp" %>
    <div id="content">
        <div class="container cls products-listing">
            <div class="col-left">
                <%--product list --%>
                <div class="box-listing cls">
                    <c:forEach var="item" items="${lstProduct}" >
                    <div class="box_product">
                        <div class="content_item content_item_hover">
                            <div class="overflow_box">
                                <div class="img_product productPreview">
                                    <a href="#" title="${item.name}">
                                        <img class="imgtodrag detail" width="250" height="250" src="${item.images}" style="display: inline;">
                                        <span class="discout-ele">-${item.discount}%</span>
                                    </a>
                                </div>
                                <div class="price-box">
                                    <span class="current_price">${item.price} đ</span>
                                    <span class="old_price">${item.oldPrice} đ</span>
                                </div>

                                <a class="name_product fullname" href="#" title="${item.name}">${item.name}</a>
                            </div>
                        </div>
                    </div>
                    </c:forEach>


                </div>
                <%--pagging--%>
                <div class="pagination-block bot pagination-block-bot">
                    <div class="pagination ">
                        <ol>
                            <li>Trang :</li>
                            <li><a class="current">1</a></li>
                            <li><a class="paging" href="http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/"
                                   onclick="loadingFilter();viewCategory('http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/?category_id=14&amp;sortType=vasup_desc&amp;p=2&amp;ajax=1', true); return false;">2</a>
                            </li>
                            <li><a class="paging" href="http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/"
                                   onclick="loadingFilter();viewCategory('http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/?category_id=14&amp;sortType=vasup_desc&amp;p=3&amp;ajax=1', true); return false;">3</a>
                            </li>
                            <li><a class="paging" href="http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/"
                                   onclick="loadingFilter();viewCategory('http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/?category_id=14&amp;sortType=vasup_desc&amp;p=4&amp;ajax=1', true); return false;">4</a>
                            </li>
                            <li><a class="paging" href="http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/"
                                   onclick="loadingFilter();viewCategory('http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/?category_id=14&amp;sortType=vasup_desc&amp;p=5&amp;ajax=1', true); return false;">5</a>
                            </li>
                            <li><a href="http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/"
                                   class="next paging" title="Next"
                                   onclick="loadingFilter();viewCategory('http://localhost:8080/thoi-trang-nu/ao-nu/ao-hai-day-ao-quay/?category_id=14&amp;sortType=vasup_desc&amp;p=2&amp;ajax=1', true); return false;">
                                <svg class="icon icon-a_next">
                                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-a_next"></use>
                                </svg>
                            </a></li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>