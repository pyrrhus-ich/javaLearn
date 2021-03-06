package listen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Liste_rueckwaertsDurchlaufen {

	public static void main(String[] args) {
		// Liste rueckwaerts durchlaufen
				List<String> list1 = new ArrayList<String>();
				Collections.addAll(list1 , "1", "2", "3", "4", "5", "6");
				System.out.println(list1);
				
				for (ListIterator<String> it = list1.listIterator(list1.size());
						it.hasPrevious(); )
				System.out.print(it.previous() + " ");

	}

}
