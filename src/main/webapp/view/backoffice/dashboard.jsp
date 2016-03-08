<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html prefix="og: http://ogp.me/ns#" lang="vi">
<head>
    <title>Admin Dashboard</title>
    <meta name="description" content="Mai Hoang Company"/>
    <link rel="shortcut icon" href="http://maihoang.com.vn/theme/maihoang/favicon.png">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-16" />
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maihoang.com.vn/theme/maihoang/themes/css/style.css">
    <link rel="stylesheet" href="/static/css/app.css">

    <script src="http://maihoang.com.vn/theme/maihoang/themes/js/jquery-1.10.2.min.js"></script>
    <script src="http://maihoang.com.vn/theme/maihoang/themes/js/jquery.lazyload.js"></script>
    <script>
        $(document).ready(function(){
            $("img.lazy").lazyload({

            });
        });
    </script>
    <script src="http://maihoang.com.vn/theme/maihoang/themes/plugin/nivo/jquery.nivo.slider.pack.js"></script>
    <script src="http://maihoang.com.vn/theme/maihoang/themes/js/jquery.bxslider.js"></script>
    <script src="http://maihoang.com.vn/theme/maihoang/themes/js/content.js"></script>

</head>
<body>

<tiles:insertAttribute name="header" />

<tiles:insertAttribute name="body" />

<tiles:insertAttribute name="footer" />

</body>

<!-- popup plugin -->
<style>
    #plugin_popup_modal{
        display: none;
    }
    .custombox-modal-container {
        margin-top: 200px !important;
    }
</style>

<!-- end popup plugin -->

<div class="popupbg"></div>
<div class="popupcontent">

</div>



</html>