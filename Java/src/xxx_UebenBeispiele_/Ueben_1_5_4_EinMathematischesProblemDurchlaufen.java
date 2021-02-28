package xxx_UebenBeispiele_;

public class Ueben_1_5_4_EinMathematischesProblemDurchlaufen {

	public static void main(String[] args) {
		
		double t = Math.random() * 10;
		
		while (t > 0) {
			System.out.println(t);
			if (t >= 1) 
				t --;	
			else 
				t *= 2;	
		}
				

	}

}
