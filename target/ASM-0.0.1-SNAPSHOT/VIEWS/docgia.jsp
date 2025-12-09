<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/docgia.css">
</head>
<body>
<form action="/CONTROLLER/docgiaServlet"></form>
	<header><jsp:include page="/VIEWS/header.jsp"></jsp:include></header>
<div class="container">
    <div class="left">
        
    </div>

    <div class="mid">
        <jsp:include page="/VIEWS/docgiaview/mid.jsp"></jsp:include>
    </div>

    <div class="right">
        <jsp:include page="/VIEWS/docgiaview/right.jsp"></jsp:include>
    </div>
</div>

<footer><jsp:include page="/VIEWS/footer.jsp"></jsp:include></footer>
</body>
</html>