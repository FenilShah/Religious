<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="../../Header.jsp"></jsp:include>
<link type="text/css" rel="stylesheet" href="CSS/jquery-te-1.4.0.css">

<script type="text/javascript" src="JS/jquery-te-1.4.0.js"></script>
<script type="text/javascript">
//$('#questionDetail').jqte();
$(document).ready(function(){
	$('#questionDetail').jqte({color: false});

});
</script>

<h1>Create Account</h1>

<form:form method="post" commandName="user" action="userRegistrationSubmit.htm">
	<table>
			<tr>
				<td>Title :</td>
				<td><form:input path="emailId"/></td>
			</tr>
			<tr>
				<td>Ask question :</td>
				<td><form:textarea path="displayName" id="questionDetail"/></td>
			</tr>
			<tr>
				<td>Enter Your Password :</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td>Retype Password :</td>
				<td><input type="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Create Account"/></td>
			</tr>
	</table>
</form:form>

<jsp:include page="../../Footer.jsp"></jsp:include>