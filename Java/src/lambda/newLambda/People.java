package lambda.newLambda;

public class People implements StringFunction{

	public static void main(String[] args) {
		People ich = new People();
		System.out.println(ich.strFunc("Ich"));
		ich.strFunction("Ich bin die StrFunction");
		

	}// Main
	
	

	@Override
	public String strFunc(String str) {
		String ich = str;
		
		return ich;
	}


	@Override
	public String strFunction(String str) {
		System.out.println(str);
		return str;
	}

	
	
}
