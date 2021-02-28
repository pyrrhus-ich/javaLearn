package wrapperKlassen;

public class numbertypesKonvertieren {

	public static void main(String[] args) {
		Integer int1 = 12;
		Double doub = int1.doubleValue();
		System.out.println("Integer int1 ist jetzt double => "+ doub);
		
		Float float1 = int1.floatValue();
		System.out.println("Integer int1 ist jetzt float => "+float1);
		
		Integer int2 = float1.intValue();
		System.out.println("Float float1 ist jetzt int => "+int2);
		
		Byte byte1 = doub.byteValue();
		System.out.println(byte1);
	}

}
