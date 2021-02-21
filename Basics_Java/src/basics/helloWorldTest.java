package basics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

class helloWorldTest {
	
	@Test
	public void test() {
		helloWorld mySatz = new helloWorld();
		mySatz.setSatz("Go");
		assertSame("GO", mySatz.getSatz());
		assertTrue("GO" == mySatz.getSatz());
	}

}
