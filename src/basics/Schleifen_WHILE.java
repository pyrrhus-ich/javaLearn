package basics;
/**
 * <div>Die While Schleife prüft for dem ersten Durchlauf die Bedingung.
 * Ist die Bedingung false fängt die while Schleife gar nicht erst an zu laufen
 * <div>Wenn im folgenden Beispiel der cnt = 0 wäre, würde nicht gezählt werden 
 * <div>und nur der Satz "Schleife erfolgreich durchlaufen ..." angezeigt werden.</div>
 */
public class Schleifen_WHILE {

	public static void main(String[] args) {
		int cnt = 100;
		
		while (cnt > 0) {
			System.out.println("cnt beträgt jetzt" + cnt);
			cnt -= 10;
		}
		System.out.println("Schleife erfolgreich durchlaufen. cnt steht jetzt bei " + cnt);
	}

}
