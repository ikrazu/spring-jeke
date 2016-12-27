<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
USERS!!
	<spring:url value="/logout" var="logoutUrl" />
	<sf:form action="${logoutUrl}" >
		<button type="submit" value="Log out" >Log out</button> 
	</sf:form>
	<spring:url value="/users/kaixo" var="kaixoUrl" />
	<a href="${kaixoUrl}">Kaixo</a>
</body>
</html>