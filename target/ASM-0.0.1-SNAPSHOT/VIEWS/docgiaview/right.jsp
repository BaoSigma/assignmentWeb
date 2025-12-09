<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/docgiacss/right.css">
</head>
<body>
	<h6>Top 5 news hot</h6>
<div class="top5hot">
    <c:forEach var="news" items="${top5News}">
        <div class="news-item">
            <!-- Ảnh -->
            <div class="news-img" >
                <img src="${news.imageUrl}" alt="${news.title}" >
            </div>

            <!-- Tiêu đề -->
            <div class="news-title">
                <a href="/news/detail/${news.id}">
                    ${news.title}
                </a>
                <p>
                    ${news.summary} <!-- nếu có summary -->
                </p>
            </div>
        </div>
        <hr>
    </c:forEach>
</div>

        <br>
        <hr>
        <h6>Top 5 news</h6>
        <div class="top5news">
        
          	<div class="top1">
        	 <img alt="" src="">
        	</div>
        	<hr>
        	<br>
        	<div class="top2">
        		<img alt="" src="">
        	</div>
        	<hr>
        	<br>
        	<div class="top3">
        		<img alt="" src="">
        	</div>
        	<hr>
        	<br>
        	<div class="top4">
        		<img alt="" src="">
        	</div>
        	<hr>
        	<br>
        	<div class="top5">
        		<img alt="" src="">
        	</div>
        	<hr>
        	<br>
        	
        </div>
</body>
</html>