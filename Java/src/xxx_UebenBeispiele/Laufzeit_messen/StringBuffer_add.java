package xxx_UebenBeispiele.Laufzeit_messen;

public class StringBuffer_add {
	
	public StringBuffer_add() {	
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < 10000 ; i++) {
			strBuf.append('A');
		}
		System.out.println(strBuf.length());
		
	}
	

}
