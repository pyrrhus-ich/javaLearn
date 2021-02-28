package schleifen_;
/**
 * <div>Die While Schleife pr�ft for dem ersten Durchlauf die Bedingung.
 * Ist die Bedingung false f�ngt die while Schleife gar nicht erst an zu laufen
 * <div>Wenn im folgenden Beispiel der cnt = 0 w�re, w�rde nicht gez�hlt werden 
 * <div>und nur der Satz "Schleife erfolgreich durchlaufen ..." angezeigt werden.</div>
 */
public class WHILE {

	public static void main(String[] args) {
		int cnt = 100;
		
		while (cnt > 0) {
			System.out.println("cnt betr�gt jetzt" + cnt);
			cnt -= 10;
		}
		System.out.println("Schleife erfolgreich durchlaufen. cnt steht jetzt bei " + cnt);
	}

}
