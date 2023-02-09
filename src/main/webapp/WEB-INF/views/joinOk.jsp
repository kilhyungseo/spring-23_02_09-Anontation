<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료</title>
</head>
<body>
		<h2>가입된 회원정보</h2>
		<hr>
		아이디 : ${memberDto.mid }<br>
		비밀번호 : ${memberDto.mpw }<br>
		이름 : ${memberDto.mname }<br>
		전화번호 : ${memberDto.mphone }<br>
		
		
</body>
</html>