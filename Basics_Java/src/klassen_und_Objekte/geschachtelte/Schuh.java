package klassen_und_Objekte.geschachtelte;

public class Schuh {
	
	void wasBinIch() { 
		System.out.println( "Ich bin der Schuh des Manitu" ); 
		} 
	
	class Fuss extends Schuh { 
		void spannung1() { 
			Schuh.this.wasBinIch(); 
			} 
		void spannung2() { 
			((Schuh)this).wasBinIch(); 
			} 
		void wasBinIch() { 
			System.out.println( "Ich bin ein Schuh.Fuss" ); 
			} 
		} 
	
	public static void manitu() { 
		new Schuh().new Fuss().spannung1(); 
		new Schuh().new Fuss().spannung2(); 
		Schuh so = new Schuh().new Fuss(); 
		so.wasBinIch(); 
		} 
	} 

	


