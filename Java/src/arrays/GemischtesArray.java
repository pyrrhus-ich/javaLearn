package arrays;

public class GemischtesArray {

	public static void main(String[] args) {
		Object[] myArr = {"Ich", 24, "Du"};
		myArr[2] = 23.5f;
		
		for (Object el : myArr) {
			System.out.println(el + " ");
			if (el instanceof String) {
				System.out.println("Es ist ein String Objekt");
			}else if (el instanceof Integer){
				System.out.println("Es kann nur ein Integer sein");
			}else if (el instanceof Float) {
				System.out.println("Es ist ein Float Objekt");
			}
		}
		
		
	}

}
