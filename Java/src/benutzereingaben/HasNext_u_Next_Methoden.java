package benutzereingaben;

import java.util.Scanner;

public class HasNext_u_Next_Methoden {

	public static void main(String[] args) {
		// erzeugt neues ScannerObjekt das auf der Standardeingabe lauscht
		Scanner eingabe = new Scanner(System.in);
		// speichert die eingegebenen werte in einer Datei
		String s = eingabe.next();
		System.out.println(s);
	}

}
