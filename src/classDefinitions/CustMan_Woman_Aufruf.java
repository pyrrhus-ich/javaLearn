package classDefinitions;

public class CustMan_Woman_Aufruf {

	public static void main(String[] args) {
		CustWoman sabine = new CustWoman();
		sabine.setFirstName("Sabine");
		sabine.setLastName("Menzel");
		sabine.setbirthYear(1962);
		sabine.getCustInfo();
		
		CustMan frank = new CustMan();
		frank.setFirstName("Frank");
		frank.setLastName("Menzel");
		frank.setbirthYear(1963);
		frank.getCustInfo();

	}

}
