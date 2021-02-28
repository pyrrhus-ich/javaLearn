package enum_Aufzählungen;



public class ENUM_AUFZAEHLUNGEN {

//Zugriff auf enums

public static void main(String[] args) {
//Ausgabe der Werte im Klartext mit toString()
	String a = WeekDays.MONTAG.toString();
			System.out.print(a);
	WeekDays b = WeekDays.DIENSTAG;
			System.out.print("\n" + b.toString()+"\n");
	WeekDays c = WeekDays.MITTWOCH;
	WeekDays d = WeekDays.DIENSTAG;
			
// Auslesen mit erweiterter for Schleife
			for (WeekDays i : WeekDays.values()) {
				System.out.println(i);
			}
			
// vergleichen mit equals
	boolean isEquals = b.equals(c);
			System.out.println(isEquals);

// Uebergabe an Methoden
	isWorkDay(WeekDays.MONTAG);
	isWorkDay(WeekDays.SONNTAG);


}

// Definition der Methode
	public static void isWorkDay(WeekDays el) {
		String isWork = "Dies ist ein Arbeitstag";
		String isWeekend = "Dieses ist ein Tag des Wochenendes";
		switch (el) {
		case MONTAG:
		case DIENSTAG:
		case MITTWOCH:
		case DONNERSTAG:
		case FREITAG:
			System.out.println(isWork);
			break;
		case SAMSTAG:
		case SONNTAG:
			System.out.println(isWeekend);
			break;
		default:
			System.out.println("Das scheint kein element der Enum WeekDays zu sein");
			break;
		}// switch

}//isWorkDay
	
	//definition ENUM
	// KONSTANTEN werden groß geschrieben
		public enum WeekDays {
			MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;
		}
}
