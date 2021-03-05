package objectMethoden;

public class Haendler_deepCopy {
		private String name;
		private String city;
		
		Haendler_deepCopy(String haendlername, String stadtDesHaendlers){
			this.name = haendlername;
			this.city = stadtDesHaendlers;
		}
		/**
		 * Ueberschreibt Object.clone(). Wichtig damit eine deepCopy erstellt<br>
		 * werden kann.
		 */
		@Override
		public Object clone() {
		    try {
		        return (Haendler_deepCopy) super.clone();
		    } catch (CloneNotSupportedException e) {
		        return new Haendler_deepCopy(this.getName(), this.getCity());
		    }
		} // ende Object clone
		
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Haendler [name=" + name + ", city=" + city + "]";
		}
		
		
}
