<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/resources/fragments/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chi tiết đơn hàng</title>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	line-height: 25px;
	border: 1px solid black;
	padding: 5px;
}

th {
	background-color: gray;
}
</style>
</head>
<body>
	<div class="page-container">

		<div class="left-content">

			<div class="mother-grid-inner">

				<jsp:include page="header.jsp"></jsp:include>

				<div class="inner-block">
					<div class="inbox">
						<h2>Chi tiết đơn hàng</h2>
						<div class="col-md-12 compose-right">
							<div class="inbox-details-default">
								<div class="inbox-details-heading">Liên hệ khách hàng</div>
								<div class="inbox-details-body">
									<table class="table table-hover">
										<tr>
											<th>Họ và tên</th>
											<th>Email</th>
											<th>Tiêu đề</th>
										</tr>
										<tr>
											<td>${contact.name}</td>
											<td>${contact.email}</td>
											<td>${contact.title}</td>
											<textarea>${contact.content}</textarea>
										</tr>
									</table>
								</div>
							</div>
							<br><a
								class="btn btn-primary btn-lg py-3 btn-block mt-3"
								href="${pageContext.request.contextPath}/admin/contact.html">Trở về</a>
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
