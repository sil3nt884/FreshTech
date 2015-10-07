package com.netbuilder.entities;
/**
 * 
 * @author sraspin
 *
 */
public class Product {
	
	private boolean discontinued = false;
	private boolean porusware = false;
	private int productId = 0;
	private int stockLevel = 0;
	private int rating = 0;
	private float price = 0F;
	private String category = null;
	private String productDescription = null;
	private String image = null;
	private String productName = null;
	
	/**
	 * The Product class contains 2 constructors.
	 * Product(productId, stockLevel, price, category, productName) only requires the essential attributes to be a product.
	 * Product(discontinued, porusware, productId, stockLevel, rating, price, category, productDescription, image, productName) requires all attributes associated with a product.
	 * 
	 * There are 2 methods in this class (excluding getters and setters). One which prints out the list of all products
	 * and the other which sends out an alert when the stock level of a product increases.
	 *
	 */
	
	Product(int Id, int level, float Price, String Category, String name){
		productName = name;
		productId = Id;
		stockLevel = level;
		category = Category;
		price = Price;
	}
	
	Product(boolean Dis, boolean Por, int PId, int SLv, int Rat, float Price, String Cat, String PDs, String Image, String PNm){
		discontinued = Dis;
		porusware = Por;
		productId = PId;
		stockLevel = SLv;
		rating = Rat;
		price = Price;
		category = Cat;
		productDescription = PDs;
		image = Image;
		productName = PNm;
	}
	
	public void setDiscontinued(boolean value){
		this.discontinued = value;
	}
	public boolean getDiscontinued(){
		return this.discontinued;
	}

	public void setPorusware(boolean value){
		this.porusware = value;
	}
	public boolean getPorusware(){
		return this.porusware;
	}
	
	public void setProductId(int value){
		this.productId = value;
	}
	public int getProductId(){
		return this.productId;
	}
	
	public void setStockLevel(int value){
		this.stockLevel = value;
	}
	public int getStockLevel(){
		return this.stockLevel;
	}
	
	public void setRating(int value){
		this.rating = value;
	}
	public int getRating(){
		return this.rating;
	}
	
	public void setPrice(float value){
		this.price = value;
	}
	public float getPrice(){
		return this.price;
	}
	
	public void setCategory(String value){
		this.category = value;
	}
	public String getCategory(){
		return this.category;
	}
	
	public void setProductDescription(String value){
		this.productDescription = value;
	}
	public String getProductDescription(){
		return this.productDescription;
	}
	
	public void setImage(String value){
		this.image = value;
	}
	public String getImage(){
		return this.image;
	}
	
	
	public void setProductName(String value){
		this.productName = value;
	}
	public String getProductName(){
		return this.productName;
	}
	
	/**
	 * 
	 */
	public void viewProductList(){
		/*connect to database
		 * String[] prodList = new String[#products]
		 * 
		 * while(ResultSet.next()){
		 * 		for(int i = 0; i < #products; i++){
		 * 			prodList[i] = ResultSet.nextLine();
		 * 		}
		 * }
		 * System.out.println(prodList);
		 */ 
	}
	
	
	public void alertStockIncrease(){
		/*connect to database
		 *setStockLevel(stockLevel + newDeliveryLevel)
		 * System.out.println(Product + " stock level is: " + stockLevel);
		 */
	}
}