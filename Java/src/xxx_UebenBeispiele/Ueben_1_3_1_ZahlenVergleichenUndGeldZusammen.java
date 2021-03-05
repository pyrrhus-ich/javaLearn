package xxx_UebenBeispiele;

public class Ueben_1_3_1_ZahlenVergleichenUndGeldZusammen {
	
	public static void main(String[] args) {
		
		//1.3.1 Zahlen vergleichen und Geld zusammen
		double cosimo, lucia, slick;
		System.out.println("Wieviel Geld hat cosimo ?\n");
		cosimo = new java.util.Scanner(System.in).nextDouble();
		System.out.println("Wieviel Geld hat lucia ?\n");
		lucia = new java.util.Scanner(System.in).nextDouble();
		System.out.println("Wieviel Geld hat slick ?\n");
		slick = new java.util.Scanner(System.in).nextDouble();
		
		boolean sum = (cosimo + lucia + slick) >= 1_000_000 ? true : false;
		System.out.println(sum);
		
		
	    //Solution
		double monetaryAmountCosimo    = new java.util.Scanner( System.in ).nextDouble();
		double monetaryAmountLucia     = new java.util.Scanner( System.in ).nextDouble();
		double monetaryAmountSlickFoot = new java.util.Scanner( System.in ).nextDouble();

		double summ = monetaryAmountCosimo + monetaryAmountLucia + monetaryAmountSlickFoot;
		boolean canPay = summ > 1_000_000;
		System.out.println( canPay );

		}
	}
	
