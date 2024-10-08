<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>제품 목록</title>

</head>
<body>
	<h2>제품 목록</h2>
	<table border="1px solid black" >
		<tr>
			<th>제품 ID</th>
			<th>제품 이름</th>
			<th>가격</th>
			<th>상세보기</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td><a
					href="${pageContext.request.contextPath}/products/${product.id}">상세보기</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="${pageContext.request.contextPath}/products/new">새 제품 추가</a>
</body>
</html>
