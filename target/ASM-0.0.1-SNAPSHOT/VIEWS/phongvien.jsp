<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

body {
    background: #f4f4f4;
}

.header {
    background: #b30000;
    color: white;
    padding: 20px;
    text-align: center;
    font-size: 28px;
    font-weight: bold;
    letter-spacing: 2px;
}

/* MENU */
nav {
    background: #333;
}

nav ul {
    display: flex;
    list-style: none;
    padding: 10px;
}

nav ul li {
    margin-right: 20px;
}

nav ul li a {
    color: white;
    text-decoration: none;
    font-weight: bold;
    padding: 8px 12px;
    display: block;
    transition: 0.3s;
}

nav ul li a:hover {
    background: #b30000;
    border-radius: 4px;
}

/* LAYOUT CHÍNH */
.container {
    width: 1200px;
    margin: 20px auto;
    display: flex;
    gap: 20px;
  	padding-left: 515px;
}



/* FOOTER */
footer {
    margin-top: 30px;
    background: #222;
    color: white;
    text-align: center;
    padding: 20px;
    font-size: 14px;
}
	
</style>
<body>


<div class="header">
    <header>BÁO CHÍNH THỐNG</header>
</div>

<nav>
    <ul>
        <li><a href="#">Trang chủ</a></li>
        <li><a href="#">Văn Hóa</a></li>
        <li><a href="#">Giới trẻ</a></li>
        <li><a href="#">Giao thông</a></li>
        <li><a href="#">Chính trị</a></li>
        <li><a href="#">Đời sống</a></li>
    </ul>
</nav>

<div class="container">

 
		Trang sẽ thay đổi
</div>

<footer>footer here</footer>



</body>
</html>