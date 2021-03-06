<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ProductCatalogue.css" />
	<title>Product Catalogue</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> Products</h2>
				
				<h4>NBGardens offers the best Gnomes in the world.....we sell garden stuff too.<br/></h4>
			
			</div>		

		</div>
		
		<ul class="rig columns-3" >
						
			<li th:each="product : ${products}" id="testimages">
			
				<h3 th:text = "${product.productName}"></h3>
				<p class ="price" th:text = "'&pound;'+${product.price}+'0'"> </p> 
				
				<form th:action="@{/info}" method="post">			
				
				<input class="gnomeimage" th:name="${product.productId}" type="image" th:value="${product.productId}" 
						th:src="'ImageFolder/'+${product.image}" th:alt="${product.productName}"/>
				</form>
			

				<p id="clearrating">
				
				<strong>RATING: </strong>
				
				<span th:switch="${product.rating}">
					<span th:case="0">
						<span th:each="i : ${#numbers.sequence( 1, 5)}"> &#9734; </span>
					</span>
					<span th:case="5">
						<span th:each="i : ${#numbers.sequence( 1, 5)}"> &#9733; </span>
					</span>
					<span th:case="*">
						<span th:each="i : ${#numbers.sequence( 1, product.rating)}">
						&#9733; </span> 
						<span th:each="i : ${#numbers.sequence( 1, 5-product.rating)}">
						&#9734; </span> 
					</span>
				</span>
				
				</p>
				
			</li>
				
	<!-- 
	<li><a href="Product"><h3>Gnome</h3>
>>>>>>> ae8e06a1d5d42416d23f21976cf248e9540db346
<p class ="price">�20 </p> 
		<img src="ImageFolder/DinoGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">�20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">�20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">�20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">�20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>-->
</ul>
		<div class="push"></div>
		
		
		</div>
		
	</body>
	
</html>