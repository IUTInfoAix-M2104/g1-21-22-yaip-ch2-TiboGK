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
		
		System.out.println( "Exo 8.8" );
		Exo88();
		System.out.println();
		
		
	}
}