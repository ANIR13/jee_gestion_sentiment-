<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="styles/bootstrap.min.css"  rel="stylesheet" />

<title>Create new user</title>
</head>
<body>
<jsp:include page="template/header.jsp"></jsp:include>

    <div align="center">
        <h2>Users Information</h2>
        <s:form action="addInternaute" method="post">
        		<s:textfield label="nom " name="internaute.nom" />
        				<s:textfield label="nom " name="internaute.prenom" />
            <s:textfield label="Username" name="internaute.login" />
            <s:password label="Password" name="internaute.password" />
            <s:submit value="Login" />
        </s:form>            
    </div>   
</body>
</html>