package classDefinitions;

public class Mahnung {

	double mahnGebühr;
	int mahnStufe;
	
	void info() {
		System.out.printf("Mahngebühr = %.2f , Mahnstufe = %d %n", mahnGebühr, mahnStufe);
		if (mahnStufe == 3) {
			System.out.println(">>>>Das ist die letzte Mahnung<<<<\n");
		}
	}
	
	public Mahnung() {
		this.mahnGebühr = 5.00;
		this.mahnStufe = 1;
		info();
		
	}
	
	public Mahnung(Mahnung before) {
		this.mahnGebühr = before.mahnGebühr + 5.00;
		this.mahnStufe = before.mahnStufe +1;
		info();
	}
	
	
//	public static void main(String[] args) {
//		Mahnung first = new Mahnung();
//		Mahnung second = new Mahnung(first);
//		Mahnung eins = new Mahnung();
//		Mahnung third = new Mahnung(second);
//
//	}

}
