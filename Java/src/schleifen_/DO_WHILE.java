package schleifen_;
/**
 * <p>Die do While Schleife wird mindestens einmal durchlaufen. Auch wenn die Bedingung<br>
 * falsch ist. Kann man gut sehen wenn man den cnt erst auf 100 und dann aucf 0 oder <br>
 * einen negativen Wert setzt.
 * </p>
 */
public class DO_WHILE {

	public static void main(String[] args) {
		int cnt = 100;
		do {
			System.out.println("cnt = " + cnt);
			cnt -= 10;
		}
		while (cnt > 0); 		
	}

}
