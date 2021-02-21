package prüfungen;

// Insel S. 430
public class Object_darf_nicht_Null_sein {
	
	public void setWeekday( Weekday day ) { 
		// legt fest das die Variable nicht NULL sein darf.
		this.day = Objects.requireNonNull( day, "Weekday day darf nicht null sein" );

		}

	

}
