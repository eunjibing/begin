<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>에러 발생</title>
</head>
<body>

요청 처리 과정에서 에러가 발생했음.<br>
빠른 시간 내에 해결해드림<br>

<p>
에러 타입 :<%= exception.getClass().getName() %> <br>
에러 메시지 : <b> <%=exception.getMessage() %></b>
</body>
</html>