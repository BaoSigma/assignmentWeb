<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Right Panel</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/docgiacss/right.css">
</head>
<body>

<h6>Top 5 news hot</h6>
<div class="top5hot">
    <c:forEach var="news" items="${top5HotNews}">
        <div class="news-item">

            <!-- Ảnh -->
            <div class="news-img">
                <img src="${news.Image}" alt="${news.Title}">
            </div>

            <!-- Tiêu đề + link đọc -->
            <div class="news-title">
                <a href="${pageContext.request.contextPath}/NEWSREADERSERVLET?action=view&id=${news.ID}">
                    ${news.Title}
                </a>

                <h6>Tác giả</h6>
                <p>${news.Author}</p>
            </div>

            <div><p>${news.PostedDate}</p></div>
            <div><p>${news.ViewCount}</p></div>

        </div>
        <hr>
    </c:forEach>
</div>


<br><hr>
<h6>Top 5 news</h6>
<div class="top5news">

    <c:forEach var="news" items="${top5Newsnew}">
        <div class="news-item">

            <!-- Ảnh -->
            <div class="news-img">
                <img src="${news.Image}" alt="${news.Title}">
            </div>

            <div class="news-title">
                <a href="${pageContext.request.contextPath}/NEWSREADERSERVLET?action=view&id=${news.ID}">
                    ${news.Title}
                </a>

                <h6>Tác giả</h6>
                <p>${news.Author}</p>
            </div>

            <div><p>${news.PostedDate}</p></div>
            <div><p>${news.ViewCount}</p></div>

        </div>
        <hr>
    </c:forEach>

</div>


<hr>
<h6>Top 5 views</h6>

<c:forEach var="news" items="${top5YourNews}">
    <div class="news-item">

        <!-- Ảnh -->
        <div class="news-img">
            <img src="${news.Image}" alt="${news.Title}">
        </div>

        <div class="news-title">
            <a href="${pageContext.request.contextPath}/NEWSREADERSERVLET?action=view&id=${news.ID}">
                ${news.Title}
            </a>

            <h6>Tác giả</h6>
            <p>${news.Author}</p>
        </div>

        <div><p>${news.PostedDate}</p></div>
        <div><p>${news.ViewCount}</p></div>

    </div>
    <hr>
</c:forEach>

</body>
</html>
