<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring and Struts Integration Demo</title>
<link type="text/css" href="styles/bootstrap.min.css"  rel="stylesheet" />

<sj:head jquerytheme="redmond" />

</head>
<body>
<jsp:include page="template/header.jsp"></jsp:include>

	<div align="center">
		<h1>Gestion des Internaute</h1>
		<h2>Ajout d'un Internaute</h2>

		<s:form action="comparaison" method="post">

			<div class="type-text">
				<s:textfield label="username " name="internaute.login" />
			</div>
			
			<div class="type-text">
			<s:password name="internaute.password" label="password"/>
			</div>
			<sj:submit value="Save" />

		</s:form>

	</div>
</body>
</html>