package xxx_UebenBeispiele.Laufzeit_messen;

import date_u_time.Laufzeit_messen;

public class App {

	public static void main(String[] args) {
		Laufzeit_messen rtString = new Laufzeit_messen();
		rtString.setStartime();
		String_add str = new String_add();
		rtString.setEndTime();
		//System.out.println(rtString);
		
		Laufzeit_messen rtBuf = new Laufzeit_messen();
		rtBuf.setStartime();
		StringBuffer_add strBuf = new StringBuffer_add();
		rtBuf.setEndTime();
		//System.out.println(rtBuf);
		
		Result res = new Result(rtString.getRunTime(), rtBuf.getRunTime());

	}

}
