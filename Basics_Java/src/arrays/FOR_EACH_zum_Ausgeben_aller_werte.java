package arrays;

public class FOR_EACH_zum_Ausgeben_aller_werte {

	public static void main(String[] args) {
		int[] zahlen = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		// für jeden Wert im array zahlen drucke den Wert + |
		for(int el : zahlen) {
		   System.out.print(el +"|");
		}

	}

}
