import java.util.Scanner;
/**
 * Mes debuts sur Java
 */
public class TD3 {  // Save as "TD3.java"

	public static void Exo61() {	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = in.nextInt();
		in.close();
		
		for (int row = 1; row <= size; row++) {  
			for (int col = 1; col <= size; col++) {  
				System.out.print( "#" );
			}
			System.out.println();
		}
   }
   
   public static void Exo63(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = in.nextInt();
		in.close();
		System.out.printf("   *|");
		for (int firstRow = 1; firstRow <= size; firstRow++) {
			System.out.printf("%4d",firstRow);
		}
		System.out.println();
		
		for (int firstRow = 1; firstRow <= size; firstRow++) {
			System.out.printf("-----");
		}
		System.out.println();
	
		for (int row = 1; row <= size; row++) {
			System.out.printf("%4d",row);
			System.out.printf("|");
			for (int col = 1; col <= size; col++) {  
				System.out.printf("%4d",row*col);
			}
			System.out.println();
		}
   }
   
   public static void Exo71(){
		int n = 20;
		long factorial = 1;

		for (int i = 1; i <= n; i++) {  
			factorial = factorial * (long)i;   
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
   }
   
   public static void Exo81(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = in.nextLine();
		in.close();
		
		for (int i = name.length(); i > 0; i--){
			System.out.print(name.charAt(i-1));
		}
   }
   
   public static void Exo88(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a binary string : ");
		String inStr = in.nextLine();
		in.close();
	     
		int inStrLen = inStr.length();
		char inChar;
		boolean isValid ; 
		
		isValid = true ; 
		for (int i=0 ; i < inStrLen ; i++ ) { 
			inChar = inStr.charAt(i); 
			if (!(inChar == '0' || inChar == '1')) { 
				isValid = false; 
				break;  
			} 
		} 
		if (isValid) { 
			System.out.println(inStr + " is a binary string"); 
		} else { 
			System.out.println(inStr + " is NOT a binary string");
		} 
	}
	
	public static void Exo89(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a hex string : ");
		String inStr = in.nextLine();
		in.close();
	     
		int inStrLen = inStr.length();
		char inChar;
		boolean isValid ; 
		
		isValid = true ; 
		for (int i=0 ; i < inStrLen ; i++ ) { 
			inChar = inStr.charAt(i); 
			if (!((inChar >= '0' && inChar <= '9')|| (inChar >= 'A' && inChar <= 'F')|| (inChar >= 'a' && inChar <= 'f'))) { 
				isValid = false; 
				break;  
			} 
		} 
		if (isValid) { 
			System.out.println(inStr + " is a hex string"); 
		} else { 
			System.out.println(inStr + " is NOT a hex string");
		} 
	}
	
	public static void Exo93(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int number = in.nextInt();
		
		int[] students;
		students = new int[number];
		for (int i=0 ; i < number ; i++ ) { 
			System.out.print("Enter the grade for students "+ (i+1) + " : ");
			students[i]= in.nextInt();
		}
		in.close();
		
		int average = 0;
		
		for (int j=0 ; j < number ; j++ ) { 
			average+=students[j];
		}
		
		int min = students[0];
		int max = students[0];
		
		for (int k=1 ; k < number ; k++ ){ 
			if (students[k] < min){
				min = students[k];
			}
			if (students[k] > max){
				max = students[k];
			}
		}
		
		average=average/number;
		System.out.println("Average is "+average);
		System.out.println("Max is "+ max);
		System.out.println("Min is "+ min);	
	}
	
	public static void Exo101(){
		int exp; 
		int base; 
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the base : ");
		base = in.nextInt();
		
		System.out.print("Enter the exp : ");
		exp = in.nextInt();
		in.close();
		System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
	}

	public static int exponent(int base, int exp) {
		int product = 1;

		for (int i=0 ; i < exp ; i++ ) {
			product *= base;
		}

		return product;
	}
	
	public static void Exo102(int number){
		
		if (number%2 == 0){
			System.out.println(number + " is an even number");
		} else{
			System.out.println(number + " is an odd number");
		}
	}
	
	public static void Exo91(){
		final int NUM_ITEMS;
		  int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known
		  String s;
		  int cpt=0;

		  Scanner in = new Scanner(System.in);
		  System.out.print("Enter the number of item: ");
		  NUM_ITEMS = in.nextInt();   // use next() to read a String

		  // Allocate the array
		  items = new int[NUM_ITEMS];

		  // Prompt and read the items into the "int" array, if array length > 0
		  if (items.length > 0) {
			 System.out.print("Enter the value of all items (separated by space): ");
			 for (int i = 0; i < items.length; ++i) {  // Read all items
					items[i]= in.nextInt();
			 }
		  }
		  System.out.print("The values are : ");
		  // Print array contents, need to handle first item and subsequent items differently
		  for (int i = 0; i < items.length; ++i) {
			 if (i == 0) {
				// Print the first item without a leading commas
				System.out.print(items[i]);
			 } else {
				// Print the subsequent items with a leading commas
				System.out.print(", "+items[i]);
			 }
			 // or, using a one liner
			// System.out.print((i == 0) ? (items[i]) : (", "+items[i]));
		  }
		}
   
   
   public static void main(String[] args) {
	//Test avec plusieurs valeurs de l'exo 6.1
		/*
		System.out.println( "Exo 6.1" );
		Exo61();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 6.3
		/*
		System.out.println( "Exo 6.3" );
		Exo63();
		System.out.println();
		*/
		
		
	//Test avec plusieurs valeurs de l'exo 7.1
		/*
		System.out.println( "Exo 7.1" );
		Exo71();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 8.1
		/*
		System.out.println( "Exo 8.1" );
		Exo81();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 8.8
		/*
		System.out.println( "Exo 8.8" );
		Exo88();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 8.9
		/*
		System.out.println( "Exo 8.9" );
		Exo89();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 9.1
		/*
		System.out.println( "Exo 9.1" );
		Exo91();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 9.3
		/*
		System.out.println( "Exo 9.3" );
		Exo93();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 10.1
		/*
		System.out.println( "Exo 10.1" );
		Exo101();
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 10.2
		/*
		System.out.println( "Exo 10.2" );
		Exo102(9);
		Exo102(8);
		Exo102(-5);
		System.out.println();
		*/
		
	//Test avec plusieurs valeurs de l'exo 9.1
		
		System.out.println( "Exo 9.1" );
		Exo91();
		System.out.println();
		
		
	}
}