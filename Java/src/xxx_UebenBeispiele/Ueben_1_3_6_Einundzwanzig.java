package xxx_UebenBeispiele;

import java.util.Random;

public class Ueben_1_3_6_Einundzwanzig {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		int  dealer = new java.util.Scanner(System.in).nextInt();
		@SuppressWarnings("resource")
		int player = new java.util.Scanner(System.in).nextInt();
		int compare = 0;
		
		if (dealer <= 21 && player <= 21) {
			compare = Math.max(player, dealer);
		}else if (dealer > 21 && player > 21) {
			compare = 0;
		}else if (dealer > 21 || player > 21) {
			compare = Math.min(player, dealer);
		};
		System.out.println(compare);
		
	}

}
