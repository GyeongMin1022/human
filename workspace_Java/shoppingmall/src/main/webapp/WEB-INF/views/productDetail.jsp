<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>제품 상세</title>
</head>
<body>
<h2>${product.name}</h2>
<p><strong>가격:</strong> ${product.price} 원</p>
<p><strong>설명:</strong> ${product.description}</p>
<a href="${pageContext.request.contextPath}/products">목록으로 돌아가기</a>
</body>
</html>
