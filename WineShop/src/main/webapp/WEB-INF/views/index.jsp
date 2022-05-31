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
	<!--Banner-->
	<%@include file="../../resources/fragments/banner.jsp"%>
	<div class="section-2">
		<div class="container-fluid p-0">
			<div class="d-flex justify-content">
				<div class="d-flex flex-column m-4">
					<h1 class="heading-1">Like & Share</h1>
					<p class="para">Lorem ipsum dolor sit amet consectetur,
						adipisicing elit.</p>
					<input type="button" href="#" class="btn btn-danger" value="Show">
				</div>
			</div>
		</div>
	</div>

	<div class="section-3">
		<div class="container">
			<div class="row">
				<div class="col-md-4 mt-3">
					<div class="d-flex flex-row">
						<i class="fas fa-phone-alt fa-3x m-2"></i>
						<div class="d-flex flex-column">
							<h3 class="m-2">Tư vấn tận tâm</h3>
							<p class="m-2">Gọi ngay: 0000000000</p>
						</div>
					</div>
				</div>

				<div class="col-md-4 mt-3">
					<div class="d-flex flex-row">
						<i class="fas fa-truck fa-3x m-2"></i>
						<div class="d-flex flex-column">
							<h3 class="m-2">Giao hàng tận nơi</h3>
							<p class="m-2">Giao hàng miễn phí giao hàng nội thành tại
								TPHCM</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 mt-3">
					<div class="d-flex flex-row">
						<i class="fas fa-thumbs-up fa-3x m-2"></i>
						<div class="d-flex flex-column">
							<h3 class="m-2">Sản phẩm</h3>
							<p class="m-2">Cam kết hàng chính hãng</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
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