<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/resources/fragments/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>category form</title>
</head>
<body>
<div class="page-container">

	<div class="left-content">

		<div class="mother-grid-inner">

			<jsp:include page="header.jsp"></jsp:include>

			<div class="inner-block">
				<div class="inbox">
					<h2>Thêm loại sản phẩm</h2>
					<div class="col-md-12 compose-right">
						<div class="inbox-details-default">
							<div class="inbox-details-heading">Form thêm loại sản phẩm</div>
							<div class="inbox-details-body">
								<div class="alert alert-info">${message}</div>
								<form:form class="com-mail" modelAttribute="category" action="admin/category/update/${category.id}.html" method="post">
									<label>Id</label>
									<input type="text" placeholder="name..." name="id" value="${category.id}" readonly/>
									<label>Name</label>
									<input type="text" placeholder="name..." name="name" value="${category.name}"/>
									<form:errors cssClass="alert-danger" path="name"></form:errors><br>
									<button type="submit">Cập nhật</button>
								</form:form>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>
				</div>
			</div>

			<jsp:include page="footer.jsp"></jsp:include>

		</div>

	</div>

	<jsp:include page="navigation.jsp"></jsp:include>

</div>
</body>
</html>
