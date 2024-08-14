<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일작성 -  할일관리</title>
</head>
<body>
 
<form method="post" action="">
	tno : <input type="text"><br>
	duedate : <input type="date" name="dueDate"> <br>
	finishied : <input type="radio" name="finishied" value="N" checked="checked">미완료
    <input type="radio" name="finishied" value="Y"> 완료<br>
    <input type="submit" value="등록">
</form>
</body>
</html>