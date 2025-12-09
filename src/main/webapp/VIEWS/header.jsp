<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ABC NEWS</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/header.css">
</head>
<body>
<div class="header">

    <div class="headertop">
        <label class="headername">ABC NEWS</label>
    </div>

    <div class="headerbottom">
        <nav class="navmenu">
            <ul class="menuheader">

                <!-- TRANG CHỦ -->
                <li class="Home">
    <a href="${pageContext.request.contextPath}/docgia">Trang chủ</a>
</li>

<li class="Culture">
    <a href="${pageContext.request.contextPath}/CULTURESERVLET">Văn Hóa</a>
</li>

<li class="young">
    <a href="${pageContext.request.contextPath}/YOUNGSERVLET">Giới trẻ</a>
</li>

<li class="traffic">
    <a href="${pageContext.request.contextPath}/TRAFFICSERVLET">Giao thông</a>
</li>

<li class="politics">
    <a href="${pageContext.request.contextPath}/POLITICSSERVLET">Chính trị</a>
</li>

<li class="life">
    <a href="${pageContext.request.contextPath}/LIFESERVLET">Đời sống</a>
</li>


            </ul>
        </nav>
    </div>

</div>
</body>
</html>
