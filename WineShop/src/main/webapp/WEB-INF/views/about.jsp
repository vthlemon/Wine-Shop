<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/resources/fragments/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Home</title>
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">
	<!-- Bootstrap CSS -->
	<link rel="stylesheet"
		  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
	<!-- Icon -->
	<link
			href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css"
			rel="stylesheet">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/slideshow-product.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/slideshow-banner.css">
	<!--Carousel-->
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/vendor/owlcarousel/css/owl.carousel.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/vendor/owlcarousel/css/owl.theme.default.min.css">
</head>
<body>
<%@include file="../../resources/fragments/header.jsp"%>
<main>
	<div id="content" class="large-9 left col col-divided" role="main">
		<img src="https://i.imgur.com/r1RxhtB.jpg">
	</div>

	<!--Banner-->
	<%@include file="../../resources/fragments/banner.jsp"%>
</main>
<%@include file="../../resources/fragments/footer.jsp"%>

<!--Bootsrap 4 js-->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<!--Animation-->
<script src="https://unpkg.com/scrollreveal"></script>
<!--Carousel-->
<script defer
		src="${pageContext.request.contextPath}/resources/vendor/owlcarousel/js/owl.carousel.min.js"></script>
<script
		src="${pageContext.request.contextPath}/resources/vendor/owlcarousel/js/jquery.min.js"></script>
<script
		src="${pageContext.request.contextPath}/resources/js/animation.js"></script>
<script
		src="${pageContext.request.contextPath}/resources/js/slideshow-product.js"></script>
<script
		src="${pageContext.request.contextPath}/resources/js/slideshow-banner.js"></script>
</body>
</html>