package javaKurs;

public class Katze {

	double gewicht;
	
	void frisst() {
		this.gewicht -= 0.1;
	}
	
	// Ball ist der Rückgabewert
	static Ball spielt() {
		this.gewicht -= 0.1;
		Ball ball1 = new Ball();
		return ball1;
	}
	
	public static void main(String[] args) {
		spielt();
	}

}
