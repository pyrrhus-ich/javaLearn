package classDefinitions;

public class CustWoman extends Customer{
	
	@Override
	public void getCustInfo() {
		System.out.printf("%s %s ist %d Jahre alt. Damit ist %s %s . %n",firstName, lastName, age, firstName, over18 ? "volljährig" : "leider noch nicht volljährig");
		System.out.println("und :");
		System.out.printf("%s %s ist eine Frau !!! %n", firstName, lastName);
	}

}
