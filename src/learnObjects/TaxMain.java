package learnObjects;

import product.ProductDetails;

public class TaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaxCalculation taxCalculation = new TaxCalculation();
		taxCalculation.isPersonHavingRRSP();
		taxCalculation.utilityRebate(false);
		taxCalculation.hasKids(19);
		taxCalculation.finalTaxCalculated();
		
		ProductDetails handSoap = new ProductDetails("Lifebuoy", 15);
		handSoap.promoCode = "Promo15";
		
	}

}
