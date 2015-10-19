<!-- Author: Sam Raspin -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "Product.css"/>

		<title>NB Gardens Product</title>
		
	</head>
	
	<body>
	
<!----------------------------------------------------------------------------------->
<!------ Top navbar. Contains logo, search bar and dropdown for mobile--------------->
<!----------------------------------------------------------------------------------->		
				
		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			<!-- Brand and toggle get grouped for better mobile display -->
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="Landing.html">
      				<img id = "logo" alt = "NB Gardens" src = "bootstrap\NBGardensLogo.png"/>
      			</a>

	    		<div class="row search-row" id = "top-search">
	  				<div>
	    				<div class="input-group">
	    					<span class="input-group-btn">
	    						<a class="btn btn-default" type="button" id="search-button">
	      							<span class="glyphicon glyphicon-search"></span>
	      						</a>
	      					</span>
	     					

	     					<input class="form-control" type="text" id="search-bar">
	     					
	    				</div>
					</div>
				</div>
				
			</div> <!-- /.navbar-header -->
			
    		
<!------------------------------------------------------------------------------->
<!---------- Collect the nav links, forms, and other content for toggling ------->
<!------------------------------------------------------------------------------->

			<div class="collapse navbar-collapse" id="navbar-collapse">
		      
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="Landing.html" id = "home-button-top">
		        		<span class= "glyphicon glyphicon-home"></span>
		        		Home
		        		</a>
		        	</li>
		      	
		      	</ul>
		      	
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="ProductCatalogue.html" id = "home-button-top">
		        		<span class= "glyphicon glyphicon-gift"></span>
		        		Products
		        		</a>
		        	</li>
		      	
		      	</ul>
		      	
		      	
		      
		      	<ul class="nav navbar-nav navbar-right">
		        
		        	<li class="dropdown">
		        
		          		<a href="#" class="button-top dropdown-toggle" id = "basket-top" data-toggle="dropdown">	      
		          	
	  						<span class= "glyphicon glyphicon-shopping-cart"></span>
						          
			          		Basket
			          
			          		<span class="caret"></span>
		          
		          		</a>
		          
			          	<ul class="dropdown-menu" id="basket-dropdown">
				            <li><a href="Basket.html">View basket</a></li>
				            <li><a href="PaymentAgreement.html">Checkout</a></li>
				            <li class="divider"></li>
				            <li><a href="Landing.html">Cancel Basket</a></li>
			          	</ul>
		          
		        	</li>
		        
		        	<li class="dropdown">
		          		
		          		<a href="#" class="dropdown-toggle" data-toggle="dropdown" id="account-top">
		          			
		          			<span class="glyphicon glyphicon-user"></span>
		          		     
		          		    My Account
		    		     		
		     				<span class="caret"></span>
		     				
						</a>
		     		
		          
						<ul class="dropdown-menu" id="account-dropdown">
						  <li><a>Logged in as: ... </a></li>
					      <li><a href="OrderHistory.html">Order History</a></li>
						  <li><a href="OrderTracking.html">Track an Order</a></li>
						  <li><a href="UpdateAccount.html">Update your Account</a></li>
						  <li><a href="ViewCreditDetails.html">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="Landing.html">Logout</a></li>
						</ul>
		        	</li>
		        
		        
		        	<li>
		        		<a href="About.html" id = "about-button-top">
		        		<span class="glyphicon glyphicon-question-sign"></span>
		        		About NB Gardens
		        		</a>
		        	</li>
	        
				</ul>
    
			</div><!-- /.navbar-collapse -->
    
		</div><!-- /.container-fluid -->	
		
		</nav>

<!--------------------------------------------->
<!------Top banner (Jumbotron)------------------>		
<!--------------------------------------------->
	
		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Product </b> </h2>				
			
			</div>		

		</div>
	
<!--------------------------------------------->
<!------INSERT PAGE BODY HERE------------------>		
<!--------------------------------------------->
			
		<div class = "panel-body">
	
			<div>
				<img id="identify" class="img-thumbnail" alt="Go Away Gnome" src="ImageFolder/badGnome.png" height="180" width="180"/>
				<p class="subtitle"><br><strong>PISSED OFF GNOME<br><br>Description:</strong><br>This is a basic gnome with anger issues.</p>
			</div><hr>
			<div class="rating">
				<p><strong>Item price: &pound1,000,000.05</strong></p>
				<strong>RATING: </strong><span> &#9734 </span><span>&#9734 </span><span>&#9734 </span><span>&#9734 </span><span>&#9734
				</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="submit"><img class="img-thumbnail" alt="hi" src="ImageFolder/shopCart.png" height="28" width="28"><strong> Add to cart</strong></button>
				<p/>
			</div><hr>
			<div>
				<p id="others" ><strong>Other items you may be interested in:</strong></p>
			</div>
			
			<div id="myCarousel" class="carousel slide container" style="width: 600px; margin: auto;" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
					<li data-target="#myCarousel" data-slide-to="3"></li>
				</ol>
				
				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newmooney.jpg" alt="newmooney"></a>
					</div>
				
					<div class="item">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newsavage.jpg" alt="newsavage"></a>
					</div>
				
					<div class="item">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newlittleFriend.jpg" alt="newlittleFriend"></a>
					</div>
				
					<div class="item">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newfancy.jpg" alt="newfancy"></a>
					</div>
				</div>
	
				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
			
			<div>
				<p class="subtitle"><strong>User Reviews:</strong></p><hr>
				<p>This is a basic user review telling you that the gnome is pretty good, but this page is so well designed!!!</p><hr>
				<p>I agree with the first review. This page is soooooo well designed!!!</p><hr>
			</div>
		
		</div>

<!----------------------------->
<!------Footer----------------->		
<!----------------------------->
		
	<footer class="panel-footer">
      <div class="container">
        <p class="text-muted"></p>
      </div>
    </footer>
		
		
		
	</body>
	
</html>