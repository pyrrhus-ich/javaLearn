package objectMethoden;

/**
 * die Standard equals() und hashCode() Methode wurde in der Class Auto überschrieben
 * zum Verständnis die equals() und hashCode() in Auto anschauen
 *
 *
 * 02.03.2021
 */

public class EqualsObjecteVergleichen {

	public static void main(String[] args) {
		Auto myCar = new Auto("Audi", "Rot");
		Auto youCar = new Auto("Audi", "Rot");
		Auto hisCar = new Auto("VW", "Gelb");
		
		System.out.println(myCar.equals(youCar)); //true
		System.out.println(myCar.equals(hisCar)); //false
		
		System.out.println(myCar.hashCode());
		System.out.println(youCar.hashCode());
		System.out.println(hisCar.hashCode());
		
		System.out.println(myCar.hashCode() == youCar.hashCode());
		System.out.println(myCar.hashCode() == hisCar.hashCode());
	}

}
