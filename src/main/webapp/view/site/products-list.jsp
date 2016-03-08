<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="product-home">
    <div class="wrapper clearfix">

        <div class="title-block">
            <h3>${catalog}</h3>
        </div>
        <div class="wrapper-pro clearfix">
            <c:forEach var="product" items="${lstProduct}" varStatus="status">

                <div class="pro-item">
                    <div class="pro-img">
                        <a href="/product/${product.id}">
                            <img src="http://maihoang.com.vn/uploads/GT72_2QE_DOMINATOR_PRO2.jpg" >
                        </a>
                    </div>
                    <div class="light-bottom"></div>
                    <h2><a href="/product/${product.id}" title="${product.name}" rel="bookmark">${product.name}</a></h2>
                    <p class="pro-price">${product.price} USD</p>
                    <div class="act-pro">
                        <a>
                            <i class="iconcart"></i>
                            <span class="fake-buy" data-id="85">Add to cart</span>
                        </a>
                    </div>
                    <!-- tooltip -->
                    <div class="info-tooltippro tooltip">
                        <div class="headertooltip">
                            <p class="titles">${product.name}</p>
                            <p class="prices">${product.price} USD </p>
                        </div>
                        <div class="bodytooltip">
                            <p><strong>Description</strong></p>
                            <p>
                                ${product.name} ${product.detail}
                            </p>
                            <p>&nbsp;</p>
                        </div>
                        <div class="footertooltip">
                        </div>
                    </div>
                    <!-- tooltip -->
                </div>

            </c:forEach>
        </div>

    </div>
</div>