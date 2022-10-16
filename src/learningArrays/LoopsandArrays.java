package learningArrays;

public class LoopsandArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nameList = {"Neethu", "Jasmeet", "Sharukh", "Parul","Daman","Harinder","Lekshmi","Sahib","Rajbir","Shanthi","Jattan"};
		
//		System.out.println(nameList);
		
		//Print the list in the order
		for(int i =0;i<nameList.length;i++) {
			System.out.println(nameList[i]);
		}
		
		// Print the list in reverse order
		
		// Verify of "Parul" is Present in the Array nameList
		for(int i =0;i<nameList.length;i++) {
			if(nameList[i]=="Parul") {
				System.out.println("Parul is present in the list");
			}
		}
		
		//Print the index in which "Parul" is present
		for(int i =0;i<nameList.length;i++) {
			if(nameList[i]=="Parul") {
				System.out.println("Parul is present at: "+i+" index");
			}
		}
	}

}
