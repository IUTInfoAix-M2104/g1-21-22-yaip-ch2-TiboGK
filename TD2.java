import java.util.Scanner;
/**
 * Mes debuts sur Java
 */
public class TD2 {  // Save as "TD2.java"

	public static void Exo12(int mark) {
      System.out.println("The mark is " + mark);
      // if-else statement
      if ( mark > 50 ) {
         System.out.println( "PASS" );
      } else {
         System.out.println( "FAIL" );
      }
      System.out.println( "DONE" );
	  System.out.println();
   }
   
   public static void Exo13(int number) {
      System.out.println("The number is " + number);
      if ((number%2) == 0 ) {
         System.out.println( "Odd Number" );   // even number
      } else {
         System.out.println( "Even Number" );   // odd number
      }
      System.out.println( "bye" );
	  System.out.println();
   }
   
   public static void Exo14(int number) {
      if (number == 1) {
         System.out.println( "One" );
      } else if ( number == 2 ) {
         System.out.println( "Two" );
      } else if ( number == 3 ) {
         System.out.println( "Three" );
	  } else if ( number == 4 ) {
         System.out.println( "Four" );
	  } else if ( number == 5 ) {
         System.out.println( "Five" );
	  } else if ( number == 6 ) {
         System.out.println( "Six" );
	  } else if ( number == 7 ) {
         System.out.println( "Seven" );
	  } else if ( number == 8 ) {
         System.out.println( "Eight" );
	  } else if ( number == 9 ) {
         System.out.println( "Nine" );
	  } else if ( number == 0 ) {
         System.out.println( "Zero" );
	  }
  
      switch(number) {
         case 1: 
            System.out.println( "One" ); break;
         case 2: 
            System.out.println( "Two" ); break;
		 case 3: 
            System.out.println( "Three" ); break;
		 case 4: 
            System.out.println( "Four" ); break;
		 case 5: 
            System.out.println( "Five" ); break;
		 case 6: 
            System.out.println( "Six" ); break;
		 case 7: 
            System.out.println( "Seven" ); break;
		 case 8: 
            System.out.println( "Eight" ); break;
		 case 9: 
            System.out.println( "Nine" ); break;
			
         default: System.out.println( "Zero" ); 
      }
	  System.out.println();
   }
   public static void Exo15(int DayNumber) {
      switch(DayNumber) {
         case 1: 
            System.out.println( "Sunday" ); break;
         case 2: 
            System.out.println( "Monday" ); break;
		 case 3: 
            System.out.println( "Tuesday" ); break;
		 case 4: 
            System.out.println( "Wednesday" ); break;
		 case 5: 
            System.out.println( "Thursday" ); break;
		 case 6: 
            System.out.println( "Friday" ); break;
		 case 7: 
            System.out.println( "Saturday" ); break;
			
         default: System.out.println( "Error" ); 
      }
	  System.out.println();
   }
   
   public static void Exo41() { 
	  //for loop
      int sum = 0;         
      double average;
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
         sum += number;     
      }
      average = (double)sum / (double)(UPPERBOUND+1-LOWERBOUND);
      System.out.println( "La somme de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + sum);
	  System.out.println( "La moyenne de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + average);
   }
   
   public static void Exo412() { 
	  //while-do loop
      int sum = 0;
	  double average;
	  final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         sum += number;
         ++number;       
      }
      average = (double)sum / (double)(UPPERBOUND+1-LOWERBOUND);
      System.out.println( "La somme de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + sum);
	  System.out.println( "La moyenne de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + average);
   }
   
   public static void Exo413() { 
	  //do-while loop    
      double average;
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      int sum = 0;
      int number = LOWERBOUND;        
      do {
         sum += number;
         ++number;                 
      } while (number <= UPPERBOUND);
	 
      average = (double)sum / (double)(UPPERBOUND+1-LOWERBOUND);
      System.out.println( "La somme de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + sum);
	  System.out.println( "La moyenne de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + average);
   }
   
   public static void Exo414() { 
	  //do-while loop    
      double average;
      int sum = 0;        
      int count = 0;   
      for ( int i = 111; i<8899; i+=1 ) {
         sum += i;
         count+=1;
      }
	  	  
      average = (double)sum / (double)(8899+1-111);
      System.out.println( "La somme de 111 a 8899 vaut " + sum);
	  System.out.println( "La moyenne de 111 a 8899 vaut " + average);
   }
   
   public static void Exo415() { 
	  //do-while loop    
      double average;
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      int sum = 0;
      int number = LOWERBOUND;        
      do {
         sum += number*number;
         ++number;                 
      } while (number <= UPPERBOUND);
	  
      average = (double)sum / (double)(UPPERBOUND+1-LOWERBOUND);
      System.out.println( "La somme des carres " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + sum);
	  System.out.println( "La moyenne des carres de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + average);
   }
   
   public static void Exo416() { 
	  int sumOdd  = 0;   
      int sumEven = 0;   
      int absDiff;   
      // Compute sums
      for (int number = 1; number < 100; ++number) {
         if (number%2 == 0) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = sumOdd-sumEven;
      } else {
         absDiff = sumEven-sumOdd;
      }
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? sumOdd-sumEven : sumEven-sumOdd;
	  System.out.println("Somme des pairs de 1 a 100 : " + sumOdd);
	  System.out.println("Somme des pairs de 1 a 100 : " + sumEven);
   }
   
   public static void Exo42(final int UPPERBOUND) { 
	  int product = 1;
	  final int LOWERBOUND = 1;
	  for (int i = LOWERBOUND; i<UPPERBOUND; ++i ) {
         product *= i;
		 //System.out.println(product);
      }
	  System.out.println("La multiplication de " + LOWERBOUND + " a " + UPPERBOUND + " vaut " + product);
   }
   
   public static void Exo43(final int MAX_DENOMINATOR) { 
      double sumL2R = 0.0;
      double sumR2L = 0.0; 
      double absDiff;
   
      // for-loop
      for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
		  sumL2R += (1/denominator);
      }
      System.out.println("The sum from left-to-right is: " + sumL2R);

      // for-loop for summing from right-to-left
      for (int denominator = MAX_DENOMINATOR; denominator > 0; --denominator) {
		  sumR2L += (1/denominator);
      }

	  System.out.println("The sum from right-to-left is: " + sumR2L);
	  
      // Find the absolute difference and display
      if (sumL2R > sumR2L) absDiff = sumL2R-sumR2L;
      else absDiff = sumR2L-sumL2R;
	  System.out.println("absDiff = " +absDiff);
   }
   
   public static void Exo44(final int MAX_DENOMINATOR) { 
      double sum = 0.0;
      for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
         if (denominator % 4 == 1) {
            sum += (double)1/denominator;
         } else if (denominator % 4 == 3) {
            sum -= (double)1/denominator;
         } else {
            System.out.println("Impossible!!!");
         }
      }
      sum *= 4;
	  System.out.println(sum);
	  System.out.println("Precision en % : " + (sum/Math.PI)*100);
   }
   
   
   /* Algo 4.4.1 donné faux 
   
   public static void Exo441(final int MAX_TERM) {
      int sum = 0;
      for (int term = 1; term <= MAX_TERM; term+=2) {
         if (term % 4 == 1) {
            sum += (double) 1.0 / (term * 2 - 1);
			
         } else if (term % 4 == 3) {
            sum -= (double) 1.0 / term;
         }
      }
	  sum *= 4;
	  System.out.println(sum);
   }
  */
  
  public static void Exo51() {
      int number1, number2, sum;

      Scanner in = new Scanner(System.in);
      System.out.print("Enter first integer: ");  
      number1 = in.nextInt();
	  
      System.out.print("Enter first integer: ");  
      number2 = in.nextInt();
      in.close();

      sum = number1+number2;

      System.out.println("The sum is: " + sum); 
   }
   
   public static void Exo52() {
      int number1, number2, number3; 
      int sum, product, min, max; 
	  
      Scanner in = new Scanner(System.in);
      System.out.print("Enter first integer: ");  
      number1 = in.nextInt();
	  
      System.out.print("Enter first integer: ");  
      number2 = in.nextInt();
	  
	  System.out.print("Enter first integer: ");  
      number3 = in.nextInt();
      in.close();
	  
      // Compute sum and product
      sum = number1+number2+number3;
      product = number1*number2*number3;

      min = number1;        
      if (number2 < min) {  
         min = number2;    
      }
      if (number3 < min) {
         min = number3;
      }
      
	  max = number1;        
      if (number2 > min) {  
         max = number2;    
      }
      if (number3 > min) {
         max = number3;
      }
            
     System.out.println("The sum is: " + sum);
	 System.out.println("The product is: " + product);
	 System.out.println("The min is: " + min);
	 System.out.println("The max is: " + max);
      
   }
   
   public static void Exo53() {
      double radius, diameter, circumference, area;  // inputs and results - all in double
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();
	  in.close();

      diameter = 2.0 * radius;
	  area = Math.PI * radius * radius;
      circumference = 2.0 * Math.PI * radius;
      System.out.printf("Diameter is: %.2f%n", diameter);
      System.out.printf("area is: %.2f%n", area);
	  System.out.printf("circumference is: %.2f%n", circumference);
   }
   
   public static void Exo531() {
      double radius, surfaceArea, volume;  // inputs and results - all in double
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();
	  in.close();

      surfaceArea = 4 * Math.PI * radius * radius;
	  volume = 4 /3 * Math.PI * radius * radius * radius;
      System.out.printf("volume is: %.2f%n", volume);
	  System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
   }
   
   public static void Exo532() {
      double radius, surfaceArea, volume, baseArea, height;  // inputs and results - all in double
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();
	  
	  System.out.print("Enter the height: ");
      height = in.nextDouble();
	  in.close();

      baseArea = Math.PI * radius * radius;
	  surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
	  volume = baseArea * height;
      System.out.printf("volume is: %.2f%n", volume);
	  System.out.printf("baseArea is: %.2f%n", baseArea);
	  System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
   }
  
   public static void Exo54() {
	  Scanner in = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int number1 = in.nextInt();
	  System.out.print("Enter the second number: ");
      int number2 = in.nextInt();
	  in.close();
	  
	  int swap = number1;
	  number1 = number2;
	  number2 = swap;
	  System.out.println("Number 1 is: "+ number1);
	  System.out.println("Number 2 is: "+ number2);
   }
  
   public static void main(String[] args) {
	   
	//Test avec plusieurs valeurs de l'exo 1.2
	  System.out.println( "Exo 1.2" );
      Exo12(0);
	  Exo12(49);
	  Exo12(50);
	  Exo12(51);
	  Exo12(100);
	 
	//Test avec plusieurs valeurs de l'exo 1.3
	  System.out.println( "Exo 1.3" );
      Exo13(0);
	  Exo13(1);
	  Exo13(88);
	  Exo13(99);
	  Exo13(-1);
	  Exo13(-2);
	 
	//Test avec plusieurs valeurs de l'exo 1.4
	  System.out.println( "Exo 1.4" );
      Exo14(0);
	  Exo14(1);
	  Exo14(2);
	  Exo14(3);
	  Exo14(4);
	  Exo14(5);
	  Exo14(6);
	  Exo14(7);
	  Exo14(8);
	  Exo14(9);
	  
	  
	//Test avec plusieurs valeurs de l'exo 1.5
	  System.out.println( "Exo 1.5" );
      Exo15(0);
	  Exo15(1);
	  Exo15(2);
	  Exo15(3);
	  Exo15(4);
	  Exo15(5);
	  Exo15(6);
	  Exo15(7);
	  
	//Test avec plusieurs valeurs de l'exo 4.1
	  System.out.println( "Exo 4.1" );
      Exo41();  
	  Exo412();
	  Exo413();
	  Exo414();
	  Exo415();
	  Exo416();  
	  System.out.println();
	  
	//Test avec plusieurs valeurs de l'exo 4.2
	  System.out.println( "Exo 4.2" );
	  for (int number = 10; number < 21; ++number) {
		  Exo42(number);
	  }
	  System.out.println();
	  
	//Test avec plusieurs valeurs de l'exo 4.3
	  System.out.println( "Exo 4.3" );
      Exo43(50000); 
	  System.out.println();
	
	//Test avec plusieurs valeurs de l'exo 4.4
	  System.out.println( "Exo 4.4" );
      Exo44(10000); 
	  Exo44(100000); 
	  Exo44(1000000); 
	  Exo44(10000000);
	  System.out.println();
	  //Exo441(1000);
	
	//Test avec plusieurs valeurs de l'exo 5.1
	  System.out.println( "Exo 5.1" );
      //Exo51(); 
	  
	  System.out.println();
	
	//Test avec plusieurs valeurs de l'exo 5.2
	  System.out.println( "Exo 5.2" );
      //Exo52(); 
	  System.out.println();

	//Test avec plusieurs valeurs de l'exo 5.3
	  System.out.println( "Exo 5.3" );
      //Exo53(); 
	  System.out.println();
	  
	//Test avec plusieurs valeurs de l'exo 5.3.1
	  System.out.println( "Exo 5.3.1" );
      //Exo531(); 
	  System.out.println();
	  
	//Test avec plusieurs valeurs de l'exo 5.3.2
	  System.out.println( "Exo 5.3.2" );
      //Exo532(); 
	  System.out.println();
	 
	//Test avec plusieurs valeurs de l'exo 5.3.2
	  System.out.println( "Exo 5.4" );
      Exo54(); 
	  System.out.println();
   }
}