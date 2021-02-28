package date_u_time;

/**
 * Jahr
 * Wir nutzen in unserer Zeitzone den gregorianischen Kalender
 */


import java.util.*;



public class Get_Date_Datums_Information {

public static void printCalendarInfo(GregorianCalendar cal)
{
	  //Datum
	  System.out.println(
	    "Datum......: " +
	    cal.get(Calendar.DATE) + "." +
	    (cal.get(Calendar.MONTH)+1) + "." +
	    cal.get(Calendar.YEAR)
	  );
	  //Zeit
	  System.out.println(
	    "Zeit.......: " +
	    cal.get(Calendar.HOUR_OF_DAY) + ":" +
	    cal.get(Calendar.MINUTE) + ":" +
	    cal.get(Calendar.SECOND) + " (+" +
	    cal.get(Calendar.MILLISECOND) + " ms)"
	  );
	//Tag
	  System.out.println(
	    "Tag........: " +
	    cal.get(Calendar.DAY_OF_YEAR) + ". im Jahr"
	  );
	  System.out.println(
	    "             " +
	    cal.get(Calendar.DAY_OF_MONTH) + ". im Monat"
	  );
	  //Woche
	  System.out.println(
	    "Woche......: " +
	    cal.get(Calendar.WEEK_OF_YEAR) + ". im Jahr"
	  );
	  System.out.println(
	    "             " +
	    cal.get(Calendar.WEEK_OF_MONTH) + ". im Monat"
	  );
	  //Wochentag
	  System.out.print(
	    "Wochentag..: " +
	    cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) +
	    ". "
	  );
	  
	  int value = cal.get(Calendar.DAY_OF_WEEK);
	  if (value == cal.SUNDAY) {
	    System.out.print("Sonntag");
	  } else if (value == cal.MONDAY) {
	    System.out.print("Montag");
	  } else if (value == cal.TUESDAY) {
	    System.out.print("Dienstag");
	  } else if (value == cal.WEDNESDAY) {
	    System.out.print("Mittwoch");
	  } else if (value == cal.THURSDAY) {
	    System.out.print("Donnerstag");
	  } else if (value == cal.FRIDAY) {
	    System.out.print("Freitag");
	  } else if (value == cal.SATURDAY) {
	    System.out.print("Samstag");
	  } else {
	    System.out.print("unbekannt");
	  }
	  System.out.println(" im Monat");
	  //Zeitzone
	  System.out.println(
	    "Zeitzone...: " +
	    cal.get(Calendar.ZONE_OFFSET)/3600000 +
	    " Stunden"
	  );
	  System.out.println(
	    "Sommerzeit.: " +
	    cal.get(Calendar.DST_OFFSET)/3600000 +
	    " Stunden"
	  );
}
	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		printCalendarInfo(cal);
		
	}

}
