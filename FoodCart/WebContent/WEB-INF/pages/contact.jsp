<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="Header.jsp"></jsp:include>

<div class="content-container">
	<header>
		<h1 class="center-text">Contact</h1>
		<h2 class="center-text">Vivamus sollicitudin est id purus feugiat
			laoreet. Quisque sagittis viverra fringilla. Nullam ut ligula
			porttitor, rutrum ipsum quis, pretium massa. Aenean vulputate
			ultrices nisl a vulputate. Proin pellentesque, quam et facilisis
			lobortis, nibh elit consectetur turpis, nec lobortis metus erat sit
			amet nisi.</h2>
	</header>

	<div id="contact-content" class="content">
		<div class="templatemo_contactmap">
			<div id="templatemo_map"></div>
		</div>
		<form:form commandName="contact" method="post" action="submitContactDetails.htm">
			<div class="templatemo_form">
				<form:input path="contactName" class="form-control"
					id="fullname" placeholder="Your Name" maxlength="40"/>
			</div>
			<div class="templatemo_form">
				<form:input name="email" path="contactEmail" class="form-control" id="email"
					placeholder="Your Email" maxlength="40"/>
			</div>
			<div class="templatemo_form">
				<form:textarea path="contactMessage" rows="10" class="form-control" id="message"
					placeholder="Message"/>
			</div>
			<div class="templatemo_form">
				<form:button type="submit" class="btn btn-primary">Send Message</form:button>
			</div>
			<address class="content-description">
				<i class="fa fa-phone"></i> 010-010-0110<br> <i
					class="fa fa-map-marker"></i> 110 Proin eu erat vitae, mauris
				ullamcorper luctus 10110<br> <i class="fa fa-envelope"></i> <a
					href="#">info@company.com</a><br>
			</address>
		</form:form>
	</div>
</div>
<!-- /.content-container -->


<script type="text/javascript">
	loadScript();
	</script>
<jsp:include page="Footer.jsp"></jsp:include>