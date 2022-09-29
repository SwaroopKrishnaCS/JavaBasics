package assignmentWeek4;

//7.	Create a class Rectangle. Declare two variables length 
//and breadth and initialize values for it. Calculate the perimeter and area of rectangle using formula given below and print it
//Perimeter formula P=2(length+breadth)
//Area of Rectangle Area = length X breadth


public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 10;
		int breadth = 5;
		int perimeterRectangle = 2 * (length + breadth);
		int areaRectangle = length * breadth;
		System.out.println ("Perimeter of rectangle = " + perimeterRectangle);
		System.out.println ("Area of rectangle = " + areaRectangle);


	}

}
