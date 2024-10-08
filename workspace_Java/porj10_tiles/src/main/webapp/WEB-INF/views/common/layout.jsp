<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
#side {
	display : inline-block;
}
</style>
</head>


<body>
	<!-- header -->
	<div>
	<%-- <%@ import %> --%>
	<%-- <jsp:include --%>
		<tiles:insertAttribute name = "header" />	
	</div>

	<!-- side -->
	<div>
	<tiles:insertAttribute name = "side" />
	</div>

	<!-- content -->
	<div>
	<tiles:insertAttribute name = "content" />
	</div>
	
	<!-- footer -->
	<div>
	<tiles:insertAttribute name = "footer" />
	</div>
	
	${servertime }
	
</body>
</html>