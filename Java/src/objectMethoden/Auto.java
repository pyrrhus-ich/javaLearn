package objectMethoden;

public class Auto {
	private String auto;
	private String farbe;
	Haendler haendler;
	
	// eigenen Konstruktor
	public Auto(String car, String color) {
		this.auto = car;
		this.farbe = color;
	}// Ende eigener KOnstruktor
	
	
	
	public Auto(String car, String farbe, Haendler h) {
		this.auto = car;
		this.farbe = farbe;
		haendler = h;
	}



	/**
	 * @return the auto
	 */
	public String getAuto() {
		return auto;
	}



	/**
	 * @param auto the auto to set
	 */
	public void setAuto(String auto) {
		this.auto = auto;
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



	// ToString() ueberschreiben
	@Override
	public String toString() {
		return "Ich bin ein " + farbe + "er " + auto + " und wurde verkauft von " + haendler.getName() + " aus " + haendler.getCity();
	}

	// hashCode ueberschreiben
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auto == null) ? 0 : auto.hashCode());
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
		Auto other = (Auto) obj;
		if (auto == null) {
			if (other.auto != null)
				return false;
		} else if (!auto.equals(other.auto))
			return false;
		if (farbe == null) {
			if (other.farbe != null)
				return false;
		} else if (!farbe.equals(other.farbe))
			return false;
		return true;
	}
	
	
	

}
