package datentypen_;

public class InstanceOf {

	public static void main(String[] args) {
		Integer int1 = 45;
		String str1 = "Ich";
		boolean intRes = (int1 instanceof Integer) ? true : false;
		System.out.println(intRes);
		
		boolean strRes = (str1 instanceof String) ? true : false;
		System.out.println(strRes);
	}

}
