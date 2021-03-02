package objectMethoden;

public class Haendler {
		private String name;
		private String city;
		
		Haendler(String haendlername, String stadtDesHaendlers){
			this.name = haendlername;
			this.city = stadtDesHaendlers;
		}

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
