<jsp:include page="Header.jsp"></jsp:include>

<div class="content-container">
	<iframe src="details.htm?id=${derasar.derasarId}"
		style="width: 100%; height: 600px; border: 0px none transparent;"></iframe>
</div>


<div class="content-container content">
	<div class="templatemo_contactmap">
		<div id="templatemo_map"></div>
	</div>

	<div id="templatemo_timeline" class="content">
		<div class="container-fluid">
			<div class="time_line_wap left_timeline">
				<div class="time_line_paragraph">
					<div class="time_line_caption left">Details</div>
					<div class="time_line_icon right">
						<i class="fa fa-chain"></i>
					</div>
					<h1>Doloremque laudantium</h1>
					<p>Pellentesque vitae dictum ipsum, sit amet pretium dolor.
						Nullam at eleifend dolor, ut suscipit erat. Nunc dignissim, libero
						nec tincidunt lobortis, lectus purus tristique lacus, et
						consectetur leo libero in erat. Pellentesque ac sapien ut tellus
						porta malesuada. Nulla eget diam elit. Ut et arcu malesuada,
						facilisis nisl ut, commodo ligula.</p>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="Footer.jsp"></jsp:include>

<script type="text/javascript">
	loadScript(); 
</script>