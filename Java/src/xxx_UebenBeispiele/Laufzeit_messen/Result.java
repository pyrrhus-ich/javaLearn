package xxx_UebenBeispiele.Laufzeit_messen;

public class Result {
	
	public Result(Long str, Long buf) {
		System.out.println("String " + str + " Millisec. " + "StringBuffer " + buf + " Millisec.");
		Long res = str - buf;
		if (res < 0) {
			System.out.println("String ist schneller als StringBuffer");
		}else if (res > 0) {
			System.out.println("Stringbuffer ist schneller als String");
		}else {
			System.out.println("String und Stringbuffer sind gleich schnell");
		}
	}

}
