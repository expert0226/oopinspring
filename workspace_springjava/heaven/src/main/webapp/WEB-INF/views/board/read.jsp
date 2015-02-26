<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>제목</th>
			<td>${boardVO.title}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${boardVO.content}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${boardVO.writer}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${boardVO.regDate}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardVO.cnt}</td>
		</tr>
	</table>
	<div>
		<a href="<c:url 
    value="/board/edit/${boardVO.seq}" />">수정</a> <a
			href="<c:url 
    value="/board/delete/${boardVO.seq}" />">삭제</a> <a
			href="<c:url value="/board/list" />">목록</a>
	</div>
</body>
</html>
