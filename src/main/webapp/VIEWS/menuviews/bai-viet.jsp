<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="article-container">

    <h1>${newsDetail.title}</h1>

    <p><i>${newsDetail.author} - ${newsDetail.postedDate}</i></p>

    <img class="article-img" src="${newsDetail.image}" alt="${newsDetail.title}">

    <div class="article-content">
        ${newsDetail.content}
    </div>

</div>
