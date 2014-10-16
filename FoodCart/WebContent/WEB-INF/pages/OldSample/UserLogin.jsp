<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="../../Header.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function(){
	 $("#userLoginForm").validate(); 
});
</script>


<form:form id="userLoginForm" action="userLoginSubmit.htm" commandName="user">
	<table>
		<tr><td>EmailId:</td>
		<td><form:input path="emailId" id="emailId" class="required"/></td></tr>
		
		<tr><td>Password:</td>
		<td><form:password path="password" id="password" class="required"/></td></tr>
		
		<tr><td></td><td align="center"><input type="submit" value="Login"/></td></tr>
	</table>
</form:form>

<jsp:include page="../../Footer.jsp"></jsp:include>