<!-- Author: Sam Raspin -->

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
		<link  type="text/css" rel="stylesheet" href="css/Register.css" />
		<link  type="text/css" rel="stylesheet" href="css/CustomerAccountPage.css" />
		
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">


	
		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Thank you for your payment!</b> </h2>
				
				
						
			
			</div>		

		</div>
 
			
			
			<h3>You will recieve an e-mail shortly confirming your payment. Happy Gardening!</h3>
		
	<div class="push"></div>
</div>
		
</body>
</html>