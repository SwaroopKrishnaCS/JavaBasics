package product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDetails shampoo = new ProductDetails("Head and Shoulder", 30);
		ProductDetails soap = new ProductDetails("Olay", 20);
		ProductDetails washingPowder = new ProductDetails("Nirma", 15);
//		System.out.println("Shampoo Name: "+shampoo.productName);
//		ProductDetails[] products = {shampoo,soap,washingPowder};
////		double shampooPrice = shampoo.calculatePriceAfterTaxes("Promo15");
//		double soapPrice = soap.calculatePriceAfterTaxes("Promo10");
//		double wPowderPrice = washingPowder.calculatePriceAfterTaxes("Promo5");
//		
//		System.out.println("Shampoo Price: "+shampoo.calculatePriceAfterTaxes("Promo15"));
//		System.out.println("SoapPrice: "+ soapPrice);
//		System.out.println("Washing Powder Price: "+wPowderPrice);
//		int i=0;
//		for (i=0; i < products.length; i++) {
//			
//		}
		
//		shampoo.productName = "Kuldeep";
//		shampoo.productPrice = 5;
		
//		System.out.println("Shampoo Name: "+shampoo.productName);
		
		shampoo.setProductPrice(15);
		shampoo.getProductPrice();

//		shampoo.promoCode;
		shampoo.abc="ABC";
		
		

	}

}
