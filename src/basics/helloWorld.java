package basics;

/**
 * Mein erstes JavaDoc und Hallo World
 * @author ich
 * @since 30.01.2021
 */
class helloWorld {
	
	String satz;
	
	public void setSatz(String satz) {
		this.satz = satz;
	}
	
	public String getSatz() {
		return satz;
	}

	

	public static void main(String[] args) {
		
		helloWorld gruß = new helloWorld();
		gruß.setSatz("Guten Morgen lieber Frank");
		gruß.getSatz();
		
	}

	}
