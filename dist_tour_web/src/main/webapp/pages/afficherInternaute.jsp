<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
testtt
<h1>Holà</h1>
<h1>${internaute.getLogin()}</h1>
<s:url action="redirect.action" var="urlTag">
<s:param name="name">destination </s:param>
</s:url>
<a href="<s:property value="#urlTag" />"> URL Tag Action</a>
</body>
</html>