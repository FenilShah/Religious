<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="../../Header.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function(){
	$('#createAccountButton').click(function(){
		alert("Tested Successfully");
	});
});
</script>

<h1>Create Account</h1>

<form:form method="post" commandName="user" action="userRegistrationSubmit.htm">
	<table>
			<tr>
				<td>Enter Email Address :</td>
				<td><form:input path="emailId"/></td>
			</tr>
			<tr>
				<td>Enter Display Name :</td>
				<td><form:input path="displayName"/></td>
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