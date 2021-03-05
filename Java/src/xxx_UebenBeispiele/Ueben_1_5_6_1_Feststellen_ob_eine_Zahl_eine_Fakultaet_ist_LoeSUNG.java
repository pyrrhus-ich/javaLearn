package xxx_UebenBeispiele;

import java.util.Scanner;

	
		
		public class Ueben_1_5_6_1_Feststellen_ob_eine_Zahl_eine_Fakultaet_ist_LoeSUNG {

		  public static void main( String[] args ) {
		    //tag::solution[]
		    System.out.println( "Enter a number:" );
		    long n = new Scanner( System.in ).nextLong();

		    if ( n < 1 )
		      System.err.println( "Factorials are always >= 1" );
		    else {
		      long number  = n;
		      long divisor = 2;

		      while ( number % divisor == 0 ) {
		        number /= divisor;
		        System.out.println("Divisor = " + divisor);
		        System.out.println("Number = " + number);
		        divisor++;
		      }

		      if ( number == 1 )
		        System.out.printf( "%d = %d!%n", n, divisor - 1 );
		      else
		        System.out.printf( "%d is not a factorial%n", n );
		    }
		    //end::solution[]
		  }
		}

		


