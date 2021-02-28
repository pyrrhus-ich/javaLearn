package lambda;
/*
 * 
 */
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressionInEinerVariableUsingConsumerFunctionalInterface {

	public static void main(String[] args) {
		// Definiert Array List aus Integers
		ArrayList<Integer> myArrLi = new ArrayList<>();
		// Fügt elemente zur ArrayList hinzu
		myArrLi.add(45);
		myArrLi.add(8);
		myArrLi.add(35);
		// Nutzt den Consumer aus java.util.function um die Lambda function zu definieren
		// Consumer ist ein functional Interface das für Lambda verwendet werden muss
		Consumer<Integer> ichBinDieVariable = (n) -> System.out.println(n * 150);
		// führt Operatin aus der Lambda function für jedes Element der ArrayList aus
		myArrLi.forEach(ichBinDieVariable);
		
		

	}

}
