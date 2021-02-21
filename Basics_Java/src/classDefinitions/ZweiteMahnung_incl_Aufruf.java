package classDefinitions;

public class ZweiteMahnung_incl_Aufruf {

	final static int  Mahngebühr = 5; // als unveränderlich definiert
	int sumMahngebühr; // wird ausgegeben und mit jedem neuen Aufruf erhöht
	int Mahnstufe; // dto.

	void getInfo() {
		System.out.printf("Sie befinden sich in Mahnstufe %d und haben an Mahngebühr zu zahlen %d ! %n", Mahnstufe, sumMahngebühr);
	}

	public void setPrices(/*int gebühr,*/ int stufe) {
		sumMahngebühr = Mahngebühr;
		Mahnstufe = stufe;
		getInfo();
	}
	
	public void setPrices(ZweiteMahnung_incl_Aufruf next) {
		sumMahngebühr = next.sumMahngebühr + Mahngebühr;
		Mahnstufe = next.Mahnstufe + 1;
		getInfo();
	}

	public static void main(String[] args) {
		ZweiteMahnung_incl_Aufruf first = new ZweiteMahnung_incl_Aufruf();
		//first.setPrices(5, 1);
		first.setPrices(1);
		ZweiteMahnung_incl_Aufruf second = new ZweiteMahnung_incl_Aufruf();
		second.setPrices(first);
		ZweiteMahnung_incl_Aufruf third = new ZweiteMahnung_incl_Aufruf();
		second.setPrices(second);

	}

}
