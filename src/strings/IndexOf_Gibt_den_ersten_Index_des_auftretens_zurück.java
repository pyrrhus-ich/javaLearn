package strings;

// gibt nur den index des ersten auftretens zurück
// ist caseSensitiv
// indexOf()
// lastIndexOf()

public class IndexOf_Gibt_den_ersten_Index_des_auftretens_zurück {

	public static void main(String[] args) {
		String text = "Wo ist der Hund oder sein Frauchen?";
		int indexH = text.indexOf("e");
		System.out.println("Erstes Auftreten von \"e\" Index : " + indexH);
		int indexIst = text.indexOf("ist");
		System.out.println(indexIst);
		int indexLh = text.lastIndexOf("e");
		System.out.println("Letztes Auftreten von \"e\" Index : " + indexLh);

	}

}
