import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestDureeEnHeuresMinutesSecondes extends TestDuree{
	

	@Before
    public void setUp() throws Exception {
        this.fabrique = new FabriqueADureeEnHeuresMinutesSecondes();
    }
		
	@Test
	public void testCompareTo() {
		assertTrue(new DureeEnHeuresMinutesSecondes(1,2,4).compareTo(new DureeEnHeuresMinutesSecondes(1,0,0)) > 0);
		assertEquals(0,new DureeEnHeuresMinutesSecondes(1,2,4).compareTo(new DureeEnHeuresMinutesSecondes(1,2,4)));
		assertTrue(new DureeEnHeuresMinutesSecondes(1,0,0).compareTo(new DureeEnHeuresMinutesSecondes(1,2,4)) < 0);
	}
	

}
