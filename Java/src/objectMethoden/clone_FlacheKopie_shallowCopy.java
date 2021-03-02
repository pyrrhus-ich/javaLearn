package objectMethoden;
/**
 * flache Copy klappt solange wie eine Klasse zu Ihrer erzeugung nicht auf eine andere Klasse zugreifen muss<br>
 *Im Beispiel erstellen wir ein Auto unter zuhilfenahme der Klasse Haendler. So lange sich am Haendler nichts<br>
 *aendert ist alles gut. Sobald ich aber das Haendler Objekt aendere , aendert sich dieses für alle Objekte<br>
 *unabhängig davon ob sie Original oder Kopie sind Siehe dazu ab Zeile 23<br>
 * 02.03.2021
 */
public class clone_FlacheKopie_shallowCopy {

	public static void main(String[] args) {
		Haendler skoda = new Haendler("Skodahaedler", "Hamburg");
		Auto myCar = new Auto("Skoda", "grün", skoda);
		Auto herCar = new Auto(myCar.getAuto(), myCar.getFarbe(), myCar.haendler);
		System.out.println(myCar);
		System.out.println(herCar);
		System.out.println();
		herCar.setFarbe("knallgelb");
		myCar.setFarbe("silbermetallic");
		System.out.println(myCar);
		System.out.println(herCar);
		System.out.println();
		herCar.haendler.setCity("Hintertupfingen");
		myCar.haendler.setName("einem Verbrecher");
		System.out.println(myCar);
		System.out.println(herCar);
	}

}
