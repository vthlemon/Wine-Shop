<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/resources/fragments/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách hóa đơn</title>
</head>
<body>

	<div class="page-container">

		<div class="left-content">

			<div class="mother-grid-inner">

				<jsp:include page="header.jsp"></jsp:include>

				<div class="inner-block">
					<div class="inbox">
						<h2>Danh Sách Liên Hệ Của Khách Hàng</h2>
						<div class="col-md-12 mailbox-content  tab-content tab-content-in">
								<div class="mailbox-border">
									<div class="mail-toolbar clearfix">
										<div class="float-left">
											<div class="btn btn_1 btn-default mrg5R">
												<i class="fa fa-refresh"> </i>
											</div>
											<div class="clearfix"></div>
										</div>
									</div>
									<table class="table tab-border">
										<tbody>
											<tr class="unread checked">
												<td class="hidden-xs">Họ và tên</td>
												<td class="hidden-xs">Email</td>
												<td>Tiêu Đề</td>
												<td></td>
											</tr>
											<c:forEach var="item" items="${listContact}">
												<tr class="unread checked">
													<td class="hidden-xs">${item.name}</td>
													<td class="hidden-xs">${item.email}</td>
													<td>${item.title}</td>
													<td style="text-align: center; width: 150px;"><a
														class="btn btn-default"
														href="admin/contact/detail/${item.id}.html"><i
															class="fa fa-eye"></i></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
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
