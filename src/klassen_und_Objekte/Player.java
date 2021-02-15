package klassen_und_Objekte;

public class Player {
		
		String name = "";
		String item = "";
		
		void carry( String newItem ) {
			// wenn newItem != Null und nicht leer ist(nachdem alle leerstellen weggetrimmt sind ist er nicht leer)
			if ( newItem != null && !newItem.trim().isEmpty() )
				// dann hänge newItem an Item an und schliesse mit einem ';'
				item += newItem + ';';
		}
		
		// gib true oder false zurück wenn der Spieler nichts trägt
		boolean doesCarryAnything() {
			// wenn item nicht leer ist gib true zurück
			return !item.isEmpty();
		}
		
		// setzt Item zurück auf ""
		void dropAll() {
			item = "";
		}

}
