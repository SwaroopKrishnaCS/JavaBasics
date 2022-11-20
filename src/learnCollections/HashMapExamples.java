package learnCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> phoneNumberList = new HashMap<String, String>();
		
		//Adding key value pairs on the HashMap
		phoneNumberList.put("1234567890", "Daman");
		phoneNumberList.put("4567890123", "Navjot");
		phoneNumberList.put("7890123456", "Sahib");
		
//		System.out.println(phoneNumberList.get("7890123456"));
	
		phoneNumberList.put("7890123456", "Kuldeep");
		
//		System.out.println(phoneNumberList.get("7890123456"));
		
//		Employee parul = new Employee("Parul", "QA");
//		Employee neethu = new Employee("Neethu", "Developer");
//		Employee jasmeet = new Employee("Jasmeet", "BSA");
		
		HashMap<Integer, Employee> employeeList = new HashMap<Integer, Employee>();
		
		List<Employee> mechanical=new ArrayList<Employee>();
		List<Employee> electronic=new ArrayList<Employee>();
		
		mechanical.add(new Employee("Parul", "QA"));
		mechanical.add(new Employee("Neethu", "Developer"));
		electronic.add(new Employee("Jasmeet", "BSA"));
		
		employeeList.put(101, new Employee("Parul", "QA"));
		employeeList.put(102, new Employee("Neethu", "Developer"));
		employeeList.put(103, new Employee("Jasmeet", "BSA"));
		
//		System.out.println(employeeList.get(102).getEmployeeName());
		
		
		HashMap<String,List<Employee>> employeeMap = new HashMap<String, List<Employee>>();
		
		employeeMap.put("Mechanical", mechanical);
		
		employeeMap.put("Electronics", electronic);
		
//		System.out.println(employeeMap.get("Electronics").get(0).getEmployeeName());
		
		HashMap<String, Boolean> isPresent = new HashMap<String, Boolean>();
		
		isPresent.put("Lekshmi", true);
		isPresent.put("Kuldeep", true);
		isPresent.put("Jattan", false);
		
		ListIterator<Employee> iterator = mechanical.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getEmployeeName());
		}
		
		
	}

}
