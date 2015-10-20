<!-- Author: Sam Raspin -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"/>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/UpdateAccount.css"/>

		<title>NB Gardens Update User Details</title>
		
	</head>
	
	<body>
	
		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
		
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="Landing">
      				<img id = "logo" alt = "NB Gardens" src = "ImageFolder\NBGardensLogo.png"/>
      			</a>

	    		<div class="row search-row" id = "top-search">
	  				<div>
	    				<div class="input-group">
	    					<span class="input-group-btn">
	    						<a class="btn btn-default" type="button" id="search-button">
	      							<span class="glyphicon glyphicon-search"></span>
	      						</a>
	      					</span>
	     					

	     					<input class="form-control" type="text" id="search-bar"/>
	     					
	    				</div>
					</div>
				</div>
				
			</div> 
			
    		
			<div class="collapse navbar-collapse" id="navbar-collapse">
		      
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="Landing" id = "home-button-top">
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
				            <li><a href="Basket">View basket</a></li>
				            <li><a href="PaymentAgreement">Checkout</a></li>
				            <li class="divider"></li>
				            <li><a href="Landing">Cancel Basket</a></li>
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
						  <li><a href="OrderHistory">Order History</a></li>
						  <li><a href="OrderTracking">Track an Order</a></li>
						  <li><a href="UpdateAccount">Update your Account</a></li>
						  <li><a href="ViewCreditDetails">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="/">Logout</a></li>
						</ul>
		        	
		        	</li>
		        
		        
		        	<li>
		        		<a href="About.html" id = "about-button-top">
		        		<span class="glyphicon glyphicon-question-sign"></span>
		        		About NB Gardens
		        		</a>
		        	</li>
	        
				</ul>
    
			</div>
    
		</div>
		
		</nav>
	
		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Update Details </b> </h2>			
			
			</div>		

		</div>
	

		<div class = "panel-body">
		
			<div id="container">
			
				<div align="center">
					<p class="subtitle"><strong>Current Details:</strong></p>
					
					<p id="writing"><strong>Contact Details:</strong><br/>
					Joe Bloggs<br/>
					Home telephone: (024) 76 555 555<br/>
					Mob telephone: 077 221 379 50<br/>
					E-mail: joseph.bloggs@gmail.com</p>
					
					<p id="writing"><strong>Default Delivery Address:</strong><br/>
					51 Bloggs' Road<br/>
					Blogg City<br/>
					BLG 001<br/>
					West Midlands</p>
					
					<p id="writing"><strong>Default Payment Details:</strong><br/>
					Visa Debit Card<br/>
					Card Number: 3456-9012-5678-1234<br/>
					Sort Code: 012345678<br/>
					Cardholder Name: MR G NOME</p>
					
				</div>
			
				<div id="fixit"><hr/></div>
				
				
				
				
				<div id="dropmenus">
		 			<div class="dropdown">
   		 				<button class="btn btn-success dropdown-toggle" type="button" id="dropdown menu 1" data-toggle="dropdown">Select Default Delivery Address
    					<span class="caret"></span></button>
						<ul class="dropdown-menu">
						<li><a href="#">Various</a></li>
						<li><a href="#">saved</a></li>
						<li><a href="#">addresses</a></li>
						<li><a href="#">belong</a></li>
						<li><a href="#">here</a></li>
						</ul><p></p>
					</div>
					<div><a href="#"><button type="submit"><strong>Edit Address Details</strong></button></a></div>
				</div>
				
				<div id="dropmenus">
					<div class="dropdown">
   		 				<button class="btn btn-success dropdown-toggle" type="button" id="dropdown menu 2" data-toggle="dropdown">Select Default Payment Details
    					<span class="caret"></span></button>
						<ul class="dropdown-menu">
						<li><a href="#">Various</a></li>
						<li><a href="#">saved</a></li>
						<li><a href="#">payment</a></li>
						<li><a href="#">methods</a></li>
						<li><a href="#">belong</a></li>
						<li><a href="#">here</a></li>
						</ul><p></p>
					</div>
					<div><a href="#"><button type="submit"><strong>Edit Payment Details</strong></button></a></div>
				</div>
				
				
				<div id="fixit"><hr/></div>
				
				<div id="writing">
  					<strong>Alternatively, please enter a<br/>new address below:</strong><br/><br/>
  					
					Address Line 1 :<br/>
					<input type = "text" name = "addressline1"/>
					<br/>
					<br/>
					Address Line 2 :<br/>
					<input type = "text" name = "addressline2"/>
					<br/>
					<br/>
					City :<br/>
					<input type = "text" name = "city"/>
					<br/>
					<br/>
					County :<br/>
					<input type = "text" name = "county"/>
					<br/>
					<br/>
					Postcode :<br/>
					<input type = "text" name = "postcode"/>
					<br/>
					<br/>
					
       				<button type="submit"><strong>Submit</strong></button>
       			</div>
			
				<div id="column2">
  					<strong>Alternatively, please enter a<br/>new payment method below:</strong><br/><br/>
  					
        			<div class="dropdown">
						
   		 				<button class="btn btn-success dropdown-toggle" type="button" id="dropdown menu 2" data-toggle="dropdown">Select Card Type
    					<span class="caret"></span></button>
						<ul class="dropdown-menu">
						<li><a>Mastercard</a></li>
						<li><a>Visa</a></li>
						<li><a>Visa Electron</a></li>
						<li><a>American Express</a></li>
						</ul><p></p>
					</div>
					Card Number :<br/>
					<input type = "text" name = "CardNumber"/>
					<br/>
					<br/>
					Sort Code :<br/>
					<input type = "text" name = "SortCode"/>
					<br/>
					<br/>
					CVV :<br/>
					<input type = "text" name = "CVV"/>
					<br/>
					<br/>
					Name on Card :<br/>
					<input type = "text" name = "NameonCard"/>
					<br/>
					<br/>
					Billing Address :<br/>
					<input type = "text" name = "BillAdd"/>
					<br/>
					<br/>
					Billing Postcode :<br/>
					<input type = "text" name = "BillPost"/>
					<br/>
					<br/>
					
       				<button type="submit"><strong>Submit</strong></button>
       			</div>
       			
       			<div id="column2">
  					<strong>Update contact details<br/>if neccessary:</strong><br/><br/>
  					
					First Name :<br/>
					<input type = "text" name = "FirstName"/>
					<br/>
					<br/>
					Surname Name :<br/>
					<input type = "text" name = "SurnameName"/>
					<br/>
					<br/>
					Home Telephone :<br/>
					<input type = "text" name = "HomePhone"/>
					<br/>
					<br/>
					Mobile Telephone :<br/>
					<input type = "text" name = "MobilePhone"/>
					<br/>
					<br/>
					Email Address :<br/>
					<input type = "text" name = "Email"/>
					<br/>
					<br/>
					
       				<button type="submit"><strong>Submit</strong></button>
       			</div>
       		</div>
		</div>

		<div id = "footer" class = "panel-footer">
	
			<p> Credit to Bootstrap <i>(http://getbootstrap.com)</i> for the overall website design, 
				as well as Glyphicons <i>(http://glyphicons.com)</i> for the Halfling icon set.
			</p>
			<p>
				Using the Cosmo theme <i>(https://bootswatch.com/cosmo)</i> with our own modifications.
			</p>
		
		</div>	
		
	</body>
	
</html>