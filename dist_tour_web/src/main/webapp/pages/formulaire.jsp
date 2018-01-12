<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form method="post" action="addInternaute">
<s:textfield name="internaute.nom" label="FirstName"/>
<s:textfield name="internaute.prenom" label="LastName"/>
<s:textfield name="internaute.login" label="Login"/>
<s:password name="internaute.password" label="Mot de passe"/>

<s:submit value="Envoyer"/>
</s:form>
</body>
</html>