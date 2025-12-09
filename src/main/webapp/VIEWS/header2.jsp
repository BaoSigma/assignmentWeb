<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ABC NEWS</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/header2.css">
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
                    <a href="${pageContext.request.contextPath}/phongvien">Trang chủ</a>
                </li>

                <li class="News">
                    <a href="${pageContext.request.contextPath}/NEWSSERVLET">Tin tức</a>
                </li>

                <li class="Newstype">
                    <a href="${pageContext.request.contextPath}/TYPESERVLET">Loại tin</a>
                </li>

                <li class="User">
                    <a href="${pageContext.request.contextPath}/USERSERVLET">Người dùng</a>
                </li>

                <li class="Newsletter">
                    <a href="${pageContext.request.contextPath}/NEWSLETTERSERVLET">Newsletter</a>
                </li>

            </ul>
        </nav>
    </div>

</div>
</body>
</html>
