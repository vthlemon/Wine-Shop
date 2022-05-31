<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/resources/fragments/taglib.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>

        <div class="page-container">	

            <div class="left-content">

                <div class="mother-grid-inner">

                    <jsp:include page="header.jsp"></jsp:include>

                    <jsp:include page="content.jsp"></jsp:include>

                    <jsp:include page="footer.jsp"></jsp:include>

                </div>

            </div>

            <jsp:include page="navigation.jsp"></jsp:include>

        </div>

    </body>
</html>
