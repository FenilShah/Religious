<jsp:include page="Header.jsp"></jsp:include>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="content-container">
	<header>
		<h1 class="center-text">Image Gallery</h1>
		<h2 class="center-text">
			Flip Turn is free HTML5 responsive <a rel="nofollow"
				href="http://www.templatemo.com">website template</a> by templatemo.
			Credit goes to <a rel="nofollow" href="http://www.unsplash.com">Unsplash</a>
			for images used in this template. Morbi hendrerit lacinia magna et
			tempus. Integer placerat sed nulla non tincidunt.
		</h2>
	</header>
	<div id="portfolio-content" class="center-text">
		<div class="portfolio-page" id="page-1">
		<c:set var="paginationCounter" value="1" />
		<c:forEach items="${city.derasarList}" var="derasar" varStatus="counter">
			<c:choose>
				<c:when test="${(counter.index+1)/8 eq 1}">
							<div class="portfolio-group">
								<a class="portfolio-item" href="#"> 
									<img src="images/${derasar.imagePath}" alt="image 1">
									<div class="detail">
										<h3>${derasar.derasarName}</h3>
										<p>Duis ac laoreet mi. Maecenas non lorem sed elit molestie
											tincidunt. Vestibulum tincidunt libero urna, ut dignissim purus
											accumsan nec.</p>
										<span class="btn">View</span>
									</div>
								</a>
							</div>
						<c:set var="paginationCounter" value="${paginationCounter+1}" />
						</div>
						<div class="portfolio-page" id="page-${paginationCounter}" style="display: none;">	
				</c:when>
				<c:otherwise>
							<div class="portfolio-group">
								<a class="portfolio-item" href="#"> 
									<img src="images/${derasar.imagePath}" alt="image 1">
									<div class="detail">
										<h3>${derasar.derasarName}</h3>
										<p>Duis ac laoreet mi. Maecenas non lorem sed elit molestie
											tincidunt. Vestibulum tincidunt libero urna, ut dignissim purus
											accumsan nec.</p>
										<span class="btn">View</span>
									</div>
								</a>
							</div>
				</c:otherwise>
			</c:choose>
			
		</c:forEach>
		</div>
		
		<!-- page 3 -->
		<div class="pagination">
			<ul class="nav">
				<li class="active">1</li>
				<li>2</li>
				<li>3</li>
			</ul>
		</div>
	</div>
</div>
<!-- /.content-container -->



<script type="text/javascript">
		$(function () {
			$('.pagination li').click(changePage);
			/* $('.portfolio-item').magnificPopup({ 
				type: 'image',
				gallery:{
					enabled:true
				}
			}); */
			$('.portfolio-item').click(function(){
				window.location.href = "detailsFrame.htm";
			});
			/* $.ajax({ 
				  url: '//freegeoip.net/json/', 
				  type: 'POST', 
				  dataType: 'jsonp',
				  success: function(location){
				    //example where I update content on the page.
				    //alert(JSON.stringify(location));
				    alert(location.city);
				    
				    /* jQuery('#city').html(location.city);
				    jQuery('#region-code').html(location.region_code);
				    jQuery('#region-name').html(location.region_name);
				    jQuery('#areacode').html(location.areacode);
				    jQuery('#ip').html(location.ip);
				    jQuery('#zipcode').html(location.zipcode);
				    jQuery('#longitude').html(location.longitude);
				    jQuery('#latitude').html(location.latitude);
				    jQuery('#country-name').html(location.country_name);
				    jQuery('#country-code').html(location.country_code);
 				  }
				}); */

		});
	</script>
<jsp:include page="Footer.jsp"></jsp:include>