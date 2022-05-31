<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<base href="${pageContext.servletContext.contextPath }/">
<body>
	<!--HEADER -->
	<header>
		<!--Top Header-->z
		<nav class="navbar navbar-expand-lg bg-dark">
			<div class="collapse navbar-collapse">
			</div>
			<div class="col-md-3"></div>
			<a href="index.html" class="navbar-brand">WINE<span
				style="color: #0099ff;">SHOP</span></a>
			<!-- Collapse button -->
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target=".navbarMenu" aria-controls="navbarMenu"
				aria-expanded="false" aria-label="Toggle Navigation">
				<span class="navbar-toggle-icon"><i class="fas fa-bars fa-1x"></i></span>
			</button>
			<!--End Collapse button-->
			<div class="col-md-3 ml-3"></div>
			<div class="collapse navbar-collapse navbarMenu">
				<a class="btn shopping-cart" href="shopping-cart.html"><i
					class="fas fa-shopping-cart fa-x text-white"></i><span
					class="cart-number">${sessionScope.myCartNum!=null?sessionScope.myCartNum:0}</span></a>
				<c:if test="${sessionScope.usersession==null}">
					<a class="btn menu-right-btn text-white" href="sign-in.html"><i
						class="fas fa-user fa-x fa-fw"></i></a>
				</c:if>
				<c:if test="${sessionScope.usersession!=null}">
					<a class="btn menu-right-btn text-white" href="account-info.html"><i
						class="fas fa-user fa-x fa-fw"></i></a>
					<a class="btn menu-right-btn text-white" href="logout.html"><i
						class="fas fa-sign-out-alt fa-x fa-fw"></i></a>
				</c:if>
			</div>
		</nav>
		<!--End top header-->

		<!--Bottom Header-->
		<nav
			class="navbar navbar-expand-lg navbar-light bg-dark navbar-inverse">
			<div class="collapse navbar-collapse"></div>
			<div class="collapse navbar-collapse navbarMenu">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a href="index.html" class="nav-link">Trang chủ</a></li>
					<li class="nav-item"><a href="about.html" class="nav-link">Giới thiệu</a></li>
					<li class="nav-item"><a href="product.html" class="nav-link">Sản phẩm</a>
					<li class="dropdown nav-item"><a href="shop.html" class="nav-link">Cửa hàng</a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
							<c:forEach var="l" items="${listCategory}">
								<a class="dropdown-item" href="/shopDetail/${l.id}.html" />${l.name}</a>
							</c:forEach>
						</div>
					</li>
					<li class="nav-item"><a href="contact.html" class="nav-link">Liên hệ</a></li>
				</ul>
			</div>
		</nav>
		<!--End Bottom Header-->
	</header>
	<!--END HEADER-->
</body>
</html>