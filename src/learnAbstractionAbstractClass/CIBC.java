package learnAbstractionAbstractClass;

public class CIBC extends BOC{

	@Override
	public void provideCreditCard(int creditLimit) {
		// TODO Auto-generated method stub
		if("User".equals("Citizen")) {
		System.out.println("CC Provided with "+creditLimit+" limit");
		}
	}

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		
		System.out.println("RBC provides Interest rate of 19% for CC");
		
	}

}
