<jsp:include page="Header.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function(){
	$('#schoolMasterRegistrationButton').click(function(){
		window.location.replace("SchoolMasterRegistrationPage.htm");
	});
	$('#userRegistrationButton').click(function(){
		window.location.href = "userRegistrationPage.htm";
	});
	$('#askQuestionButton').click(function(){
		window.location.replace("SchoolMasterRegistrationPage.htm");
	});
	$('#loginButton').click(function(){
		window.location.replace("login.htm");
	});
});
</script>

<!--  <h1>Welcome to the amazing world</h1> -->
<form name="test" action="HibernateTest">
	<input type="submit" value="Click Here For Testing Hibernate"/>
	<input type="button" id="schoolMasterRegistrationButton" value="Register School">
</form>

<input type="button" value="Register User" id="userRegistrationButton"/>
<input type="button" value="Ask Question" id="askQuestionButton"/>
<input type="button" value="login" id="loginButton"/>
<jsp:include page="Footer.jsp"></jsp:include>
