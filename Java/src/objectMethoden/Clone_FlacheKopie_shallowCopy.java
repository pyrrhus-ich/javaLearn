package objectMethoden;
/**
 * flache Copy klappt solange wie eine Klasse zu Ihrer erzeugung nicht auf eine andere Klasse zugreifen muss<br>
 *Im Beispiel erstellen wir ein Auto unter zuhilfenahme der Klasse Haendler. So lange sich am Haendler nichts<br>
 *aendert ist alles gut. Sobald ich aber das Haendler Objekt aendere , aendert sich dieses für alle Objekte<br>
 *unabhängig davon ob sie Original oder Kopie sind Siehe dazu ab Zeile 27<br>
 * 02.03.2021
 */
public class Clone_FlacheKopie_shallowCopy {

	public static void main(String[] args) {
		Haendler skoda = new Haendler("Skodahaedler", "Hamburg");
		Auto myCar = new Auto("Skoda", "grün", skoda);
		Auto herCar = new Auto(myCar.getAuto(), myCar.getFarbe(), myCar.haendler); //shallow Copy
		
		System.out.println(myCar);
		System.out.println(herCar);
		System.out.println();
		
		herCar.setFarbe("knallgelb"); // änderung am Objekt Auto gilt nur für das jeweilige Objekt
		myCar.setFarbe("silbermetallic"); // änderung am Objekt Auto gilt nur für das jeweilige Objekt
		
		System.out.println(myCar);
		System.out.println(herCar);
		System.out.println();
		
		herCar.haendler.setCity("Hintertupfingen");  // haendler wird geändert von Kopie
		myCar.haendler.setName("einem Verbrecher");  // haendler wird geändert von Original
		
		System.out.println(myCar);
		System.out.println(herCar);
	}

}
