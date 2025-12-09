<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Right Panel</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/docgiacss/right.css">
</head>
<body>

<h6>Top 5 News Hot</h6>
<div class="top5hot">
    <c:forEach var="news" items="${top5HotNews}">
        <div class="news-item">

            <div class="news-img">
                <img src="${news.image}" alt="${news.title}">
            </div>

            <div class="news-title">
                <a href="${pageContext.request.contextPath}/news?id=${news.id}">


                <h6>Tác giả</h6>
                <p>${news.author}</p>
            </div>

            <div><p>${news.postedDate}</p></div>
            <div><p>${news.viewCount}</p></div>

        </div>
        <hr>
    </c:forEach>
</div>

<br><hr>

<h6>Top 5 Mới Nhất</h6>
<div class="top5news">
    <c:forEach var="news" items="${top5Newsnew}">
        <div class="news-item">

            <div class="news-img">
                <img src="${news.image}" alt="${news.title}">
            </div>

            <div class="news-title">
               <a href="${pageContext.request.contextPath}/news?id=${news.id}">


                <h6>Tác giả</h6>
                <p>${news.author}</p>
            </div>

            <div><p>${news.postedDate}</p></div>
            <div><p>${news.viewCount}</p></div>

        </div>
        <hr>
    </c:forEach>
</div>

<hr>

<h6>Top 5 You Viewed</h6>

<c:forEach var="news" items="${top5YourNews}">
    <div class="news-item">

        <div class="news-img">
            <img src="${news.image}" alt="${news.title}">
        </div>

        <div class="news-title">
            <a href="${pageContext.request.contextPath}/news?id=${news.id}">


            <h6>Tác giả</h6>
            <p>${news.author}</p>
        </div>

        <div><p>${news.postedDate}</p></div>
        <div><p>${news.viewCount}</p></div>

    </div>
    <hr>
</c:forEach>

</body>
</html>
