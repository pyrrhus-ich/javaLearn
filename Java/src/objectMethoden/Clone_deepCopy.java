package objectMethoden;
/**
 * Zugehörige Klassen<br>
 * - Auto_deepCopy<br>
 * - Haendler_deepCopy<br>
 *In beiden Klassen wurde die clone() Methode von Object so umgeschrieben<br>
 *das tiefe Kopien erstellt werden. Das heist die Aenderung am Haender findet bei<br>
 *der Kopie nur noch in der Kopie statt<br>
 *Zu beachten, Aenderungen am Original (myCar) Haendler aendern auch das Original Haendler<br>
 *Object. Zeile 27. In Zeilen 29 u 30 sieht man das die Haendler unterschiedliche HashCodes<br>
 *haben.
 * 03.03.2021
 */
public class Clone_deepCopy {

	public static void main(String[] args) {
		Haendler_deepCopy carDealer = new Haendler_deepCopy("Seriöser Haendler", "Hamburg");
		Auto_deepCopy myCar = new Auto_deepCopy("VW", "silber", carDealer);
		System.out.println(myCar);
		Auto_deepCopy copiedCar = (Auto_deepCopy) myCar.clone();
		System.out.println(copiedCar);
		
		myCar.haendler.setName("Verbrecher");
		copiedCar.haendler.setCity("dem bösen Westen");
		System.out.println(myCar);
		System.out.println(copiedCar);
		
		System.out.println(carDealer);
		
		System.out.println(myCar.haendler.hashCode());
		System.out.println(copiedCar.haendler.hashCode());
		
		
	}

}
