package zzz_Spielwiese;

public class Object_class extends Object {

	public static void main(String[] args) {
		Object_class test = new Object_class();
		test.play();
		
		
	}//main
	
	Object_class(){
		System.out.println("2. Konstruktor");
	}
	
	void play(){
		System.out.println("Play wurde aufgerufen");
	}
	

}// Object_class
