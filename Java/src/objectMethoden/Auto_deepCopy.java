package objectMethoden;

public class Auto_deepCopy {
	private String fabrikat;
	private String farbe;
	Haendler_deepCopy haendler;
	

	
	// eigener Konstruktor der den Haendler mit einbezieht
	public Auto_deepCopy(String hersteller, String farbe, Haendler_deepCopy h) {
		this.fabrikat = hersteller;
		this.farbe = farbe;
		haendler = h;
	}
	
	/**
	 * Ueberschreibt Object.clone(). Wichtig damit eine deepCopy erstellt<br>
	 * werden kann.
	 */
	@Override
	public Object clone() {
	    Auto_deepCopy newAuto = null;
	    try {
	        newAuto = (Auto_deepCopy) super.clone();
	    } catch (CloneNotSupportedException e) {
	        newAuto = new Auto_deepCopy(
	          this.getAuto(), this.getFarbe(), this.getHaendler());
	    }
	    newAuto.haendler = (Haendler_deepCopy) this.haendler.clone();
	    return newAuto;
	}

	/**
	 * @return the auto
	 */
	public String getAuto() {
		return fabrikat;
	}


	/**
	 * @param auto the auto to set
	 */
	public void setAuto(String auto) {
		this.fabrikat = auto;
	}



	/**
	 * @return the farbe
	 */
	public String getFarbe() {
		return farbe;
	}



	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}



	/**
	 * @return the haendler
	 */
	public Haendler_deepCopy getHaendler() {
		return haendler;
	}


	/**
	 * @param haendler the haendler to set
	 */
	public void setHaendler(Haendler_deepCopy haendler) {
		this.haendler = haendler;
	}

	

	// ToString() ueberschreiben
	@Override
	public String toString() {
		return "Ich bin ein " + farbe + "er " + fabrikat + " und wurde verkauft von " + haendler.getName() + " aus " + haendler.getCity();
	}

	// hashCode ueberschreiben
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fabrikat == null) ? 0 : fabrikat.hashCode());
		result = prime * result + ((farbe == null) ? 0 : farbe.hashCode());
		return result;
	}

	// equals ueberschreiben
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto_deepCopy other = (Auto_deepCopy) obj;
		if (fabrikat == null) {
			if (other.fabrikat != null)
				return false;
		} else if (!fabrikat.equals(other.fabrikat))
			return false;
		if (farbe == null) {
			if (other.farbe != null)
				return false;
		} else if (!farbe.equals(other.farbe))
			return false;
		return true;
	}
	
	
	

}
