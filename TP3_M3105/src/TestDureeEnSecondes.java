import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestDureeEnSecondes extends TestDuree {
	
	
	@Before
    public void setUp() throws Exception {
		this.fabrique = new FabriqueADureeEnSecondes();
    }
	
	
	@Test
	public void testCompareTo() {
		assertTrue(new DureeEnSecondes(1,2,4).compareTo(new DureeEnSecondes(1,0,0)) > 0);
		assertEquals(0,new DureeEnSecondes(1,2,4).compareTo(new DureeEnSecondes(1,2,4)));
		assertTrue(new DureeEnSecondes(1,0,0).compareTo(new DureeEnSecondes(1,2,4)) < 0);
	}
	


}
