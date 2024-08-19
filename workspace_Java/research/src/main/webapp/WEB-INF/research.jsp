<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>설문조사</title>
</head>
<body>
<h1>설문조사</h1>
<c:forEach var="research" items="${researches}">
    ${research.question}
</c:forEach>
</body>
</html>