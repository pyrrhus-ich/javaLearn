package date_u_time;

public class Laufzeit_messen {

		private long timeStart;
        private long timeEnd;
        
        
        public long setStartime() {
        	timeStart = System.currentTimeMillis();
        	return timeStart;
        }
        
        public long setEndTime() {
        	timeEnd = System.currentTimeMillis();
        	return timeEnd;
        }
        
        public long getRunTime() {
        	return timeEnd - timeStart;
        }

		@Override
		public String toString() {
			return "Laufzeit_messen [timeStart=" + timeStart + ", timeEnd=" + timeEnd + ", getRunTime()=" + getRunTime()
					+ "]";
		}
        
	}

