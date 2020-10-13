import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PileBorneeTest {
	private PileBornee p;

	@Before
	public void setUp() throws Exception {
		this.p = new PileBornee(5);
	}

	@After
	public void tearDown() throws Exception {
		this.p = null;
	}

	@Test
	public void test() {
		
	}

}
