package super_verwenden.AufloesenVonNamenskonfliktenInDerVererbungshierarchie.copy;

public class Sub extends Ober {

		public int x = 100;
		
		public void printAttributes() {
			System.out.println("Super x = " + super.x);
			System.out.println("This x = " + this.x);
		}
	
}// class
