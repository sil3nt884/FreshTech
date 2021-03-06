<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:fragment="page">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<script src="jQuery.js"></script>
		<script src="bootstrap\js\bootstrap.js"></script>
		<link type="text/css" rel="stylesheet" href="bootstrap\css\bootstrap_cosmo.css" />
		<link type="text/css" rel="stylesheet" href="css/Template.css" />
    </head>
    
     <div th:include="this :: header"></div>
    
    <body>

	<div class="wrapper">
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		
		<div class="navbar-header" id="navbar-header">
			<a class="btn btn-default navbar-toggle collapsed" type="button"
				data-toggle="collapse" data-target="#navbar-collapse"
				id="collapse-top"> <span class="glyphicon glyphicon-th-list"></span>
			</a> <a class="navbar-brand" href="/"> <img id="logo"
				alt="NB Gardens" src="ImageFolder\NBGardensLogo.png" />
			</a>
			<div class="row search-row" id="top-search">
				<div>
					<div class="input-group">
						<span class="input-group-btn"> <a class="btn btn-default"
							type="button" id="search-button"> <span
								class="glyphicon glyphicon-search"></span>
						</a>
						</span> <input class="form-control" type="text" id="search-bar"/>
					</div>
				</div>
			</div>
		</div>
		

		<div class="collapse navbar-collapse" id="navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="/" id="home-button-top"> <span
						class="glyphicon glyphicon-home"></span> Home
				</a></li>
			</ul>
			<ul class="nav navbar-nav">
				<li><a href="ProductCatalogue" id="home-button-top"> <span
						class="glyphicon glyphicon-gift"></span> Products
				</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="button-top dropdown-toggle" id="basket-top" data-toggle="dropdown">
						<span class="glyphicon glyphicon-shopping-cart"></span> Basket <span class="caret"></span>
					</a>
					<ul class="dropdown-menu" id="basket-dropdown">
						<li><a href="Basket">View basket</a></li>
						<li><a href="AddPaymentDetails">Review Payment Methods</a></li>
						<li class="divider"></li>

						<li><a href="/">Cancel Basket</a></li>
					</ul>
				</li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" id="account-top">
						<span class="glyphicon glyphicon-user"></span> My Account <span class="caret"></span>
					</a>
					<ul class="dropdown-menu" id="account-dropdown">
						<li th:if="${session.sessionUser}"> <a th:text="'Hello ' + ${session.sessionUser}"></a></li>
						<li th:unless="${session.sessionUser}"><a href="Register">Log in/Register </a></li>
						<li><a href="OrderTracking">Track an Order</a></li>
						<li><a href="OutstandingOrders">Outstanding Orders</a></li>
						<li><a href="UpdateAccount">Update your Account</a></li>
						<li><a href="ViewCreditDetails">View Credit</a></li>
						<li class="divider"></li>

						<li><a href="Logout">Logout</a></li>
					</ul>
				</li>
				
				<li>
					<a href="EmailOrderForm" id="home-button-top"> <span
						class="glyphicon glyphicon-envelope"></span> E-mail Order
					</a>
				</li>
				
				<li>
					<a href="About" id="about-button-top">
						<span class="glyphicon glyphicon-question-sign"></span> About NB Gardens
					</a>
				</li>
			</ul>
		</div>        
		</div>
		</nav>
		
		
		<div th:include="this :: content"> </div>
    </div>
		<div class = "panel-footer">
		<div class = "footer">
			
			<p>39 Gnomestreet Way, Manchester, United Kingdom, MO6 OAR  Email: service@nbgardens.com
			</p>
			
			<p>
				Terms of service:
			</p>
			
			<p>
				Privacy policy:
			</p>
		</div>
		</div>

    </body>
</html>