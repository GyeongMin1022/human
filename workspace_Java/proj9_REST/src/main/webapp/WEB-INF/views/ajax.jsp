<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	//window.onload = function(){}
	window.addEventListener("load", function() {
		const btn = document.querySelector("#btn");
		btn.addEventListener("click", function() {
			console.log("클릭")

			const xhr = new XMLHttpRequest();
			/* 			const url = "ajax"; */

			/* 			const url = "ajax/string"; */
/* 			const url = "ajax/dto"; */
			const url = "ajax/list";

			const data = {
				"ename" : "이름",
				sal : 3200

			}

			xhr.open("post", url)
			xhr.setRequestHeader("Content-Type", "application/json");
			const strData = JSON.stringify(data);
			console.log(data); // 객체 그 자체
			// 네트워크는 객체를 전달 할 수 없다.
			console.log('' + data); // 그래서 스트링으로 변형 
			console.log(strData);
			console.log(data, strData);

			xhr.send(strData)

			xhr.onload = function() {

				console.log(xhr.responseText);
			}

			try {
				let result = JSON.parse(xhr.responseText);
				console.log(result);
				
				console.log( result.ename)
				console.log( result["ename"] )
			} catch (e) {
				console.log("json 님아")

			}

		})
	})
</script>
</head>
<body>


	<button id="btn">ajax 실행</button>
</body>
</html>