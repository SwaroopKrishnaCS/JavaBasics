package product;

public class ProductDetails {
	private String productName;
	private double productPrice;
	public String promoCode;
	String abc;
	
	public ProductDetails(String prodName, double prodPrice) {
		productName = prodName;
		productPrice = prodPrice;
		// TODO Auto-generated constructor stub
	}
	
	double calculatePriceAfterTaxes(String promoCode) {
		switch (promoCode) {
		case "Promo5":
			productPrice = productPrice-5;
			break;
		case "Promo10":
			productPrice = productPrice-10;
			break;
		case "Promo15":
			productPrice = productPrice-15;
			break;
			
		default:
			System.out.println("Please enter a correct Promo Code");
			break;
		}
		
		double finalPrice = productPrice+(productPrice*0.14);
		return finalPrice;
	}
	
	//Price of the product cannot be below $10
	
	void setProductPrice(double newPrice) {
		if(newPrice>10) {
			productPrice=newPrice;
		}
		else {
			System.out.println("Cannot be set below $10");
		}
	}
	
	void getProductPrice() {
		System.out.println("Product Price: "+productPrice); 
		
	}

}
