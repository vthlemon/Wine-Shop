<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/resources/fragments/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>product form</title>
</head>
<body>

<div class="page-container">

	<div class="left-content">

		<div class="mother-grid-inner">

			<jsp:include page="header.jsp"></jsp:include>

			<div class="inner-block">
				<div class="inbox">
					<h2>Add Product</h2>
					<div class="col-md-12 compose-right">
						<div class="inbox-details-default">
							<div class="inbox-details-heading">Compose New Message</div>
							<div class="inbox-details-body">
								<div class="alert alert-info">${message }</div>
								<form:form class="com-mail" modelAttribute="product" action="admin/product/insert.html" method="POST" enctype="multipart/form-data">
									<label>Code</label>
									<form:input type="text" placeholder="VY001" path="code"/>
									<form:errors cssClass="alert-danger" path="code"></form:errors><br>
									<label>Tên sản phẩm</label>
									<form:input type="text" placeholder="ABC" path="name"/>
									<form:errors cssClass="alert-danger" path="name"></form:errors><br>
									<label>Giá</label>
									<form:input type="number" placeholder="123,000 VNĐ" path="price"/>
									<form:errors cssClass="alert-danger" path="price"></form:errors>
									<label>Số lượng</label>
									<form:input type="number" placeholder="200" path="quantity"/>
									<form:errors cssClass="alert-danger" path="quantity"></form:errors>
									<label>Độ cồn</label>
									<form:input type="number" placeholder="12.5%" path="alcohol"/>
									<form:errors cssClass="alert-danger" path="alcohol"></form:errors>
									<br>
									<label>Nguồn gốc</label>
									<form:input type="text" placeholder="..." path="madein"/>
									<form:errors cssClass="alert-danger" path="madein"></form:errors><br>
									<label>Hình ảnh</label>
									<input type="file" placeholder="..." name="photo"/>
									<label>Description</label>
									<form:textarea rows="6" placeholder="description..." path="description"/>
									<label>Loại sản phẩm</label>
									<!-- Combobox -->
									<form:select path="category.id" items="${categories}" itemValue="id" itemLabel="name" />

									<label>Show room</label>
									<!-- Combobox -->
									<form:select path="supplier.id" items="${showroom}" itemValue="id" itemLabel="name" />
									<label>Tình trạng</label>
									<!-- Combobox -->
									<form:select path="productstatus.id" items="${productStatus}" itemValue="id" itemLabel="name" />
									<br>
									<button type="submit">Save</button>
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
