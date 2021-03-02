package objectMethoden;

/**
 * wenn man ganze Objekte vergleicht kommt false zurück es sei denn man überschreibt equals() siehe dazu Class Auto<br>
 *vergleicht man aber einzelne Strings dann kommt true<br>
 *
 * 01.03.2021
 */

public class Equals {

	public static void main(String[] args) {
		Equals ich = new Equals();
		ich.setArg("Frank", "Menzel");
		
		Equals du = new Equals();
		du.setArg("Sabine", "Menzel");
		
		Equals ich2 = new Equals();
		ich2.setArg("Frank", "Menzel");
		
		boolean isEqual = ich.equals(du); // false
		System.out.println("Test 1 "+ isEqual);
		boolean isEqual2 = ich.equals(ich2); // false 
		System.out.println("Test 2 "+ isEqual2);
		boolean isEqual3 = ich.getNachname().equals(ich2.getNachname()); //true
		System.out.println("Test 3 "+ isEqual3);
		
	}// main
	

	
	   String vorname ;
	   String nachname;
	   
		public void setArg(String a, String b) {
		this.vorname = a;
		this.nachname = b;
		}

		public String getVorname() {
			return vorname;
		}

		public String getNachname() {
			return nachname;
		}
		
		
	
}
