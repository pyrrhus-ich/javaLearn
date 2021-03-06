package streamAPI;

import java.util.Stack;

// die Arbeit mit dem Stream hat keine Auswirkungen auf das gestreamte Objekt

public class StreamGenerateFrom_List_u_Set {

	public static void main(String[] args) {
		Stack<Integer> ns = new Stack<>();
		ns.push(5); ns.push(89);ns.push(135);ns.push(1);
		// gibt den sortierten stream aus
		ns.stream().sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		// hier die alte Variante unsortiert
		for (int i : ns)System.out.print(i + " ");
		

	}

}
