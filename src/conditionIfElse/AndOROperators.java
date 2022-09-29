package conditionIfElse;

public class AndOROperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean hasNavjotMoney = true;
		boolean hasKuldeepMoney = true;
		boolean hasDamanMoney = true;
		boolean hasSahibMoney = true;
		boolean hasJattanCar = false;
		
		//OR Operator   ||
		if((hasNavjotMoney||hasKuldeepMoney||hasDamanMoney||hasSahibMoney)&&hasJattanCar) {
			System.out.println("Let's have party");
		}
		else {
			System.out.println("Go home and sleep");
		}
		
		if(hasNavjotMoney&& hasJattanCar) {
			System.out.println("We can go party");
		}

	}

}
