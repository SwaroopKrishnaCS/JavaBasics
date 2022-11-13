package learnAbstractionAbstractClass;

public class RBC extends BOC{

	@Override
	public void provideCreditCard(int creditLimit) {
		// TODO Auto-generated method stub
		if("User".equals("Citizen")||"User".equals("PR")) {
		System.out.println("CC Provided with "+creditLimit+" limit");
		}
		
	}

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		System.out.println("RBC provides Interest rate of 17% for CC");
		
	}

}
