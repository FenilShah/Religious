<jsp:include page="../../Header.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function(){
	$('#test').click(function(){
		alert("Tested Successfully");
	});
});
</script>

<form>
${msg}
<input type="button" id="test" value="TestMe"/>
</form>
<jsp:include page="../../Footer.jsp"></jsp:include>