package exercises;


public class Ueben_1_5_7_1_Größte_und_kleinst_Zahl_finden_LÖSUNG {

	public static void main( String[] args ) {
	    //tag::solution[]
	    final long n = 30;

	    long largest  = 0;
	    long smallest = n == 0 ? 0 : 9;

	    for ( long value = Math.abs( n ); value != 0; value /= 10 ) {
	      long remainder = value % 10;
	      largest  = Math.max( remainder, largest );
	      smallest = Math.min( remainder, smallest );
	    }

	    System.out.println( smallest + ", "+ largest );
	    //end::solution[]
	  }
}
