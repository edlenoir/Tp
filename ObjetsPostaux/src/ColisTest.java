import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColisTest {
	
	private Colis c;
	private Lettre j;
	@Before
	public void setUp() throws Exception {
		this.c = new Colis("Toulouse","Carcasonne",31000,1.5F,2F,0);
	}
	
	@After
	public void tearDown() throws Exception {
		this.c = null;
	}

	@Test
	public void testAffranchissementTauxRecommandation0() {
		assertEquals(2F,c.tarifAffranchissement(),0F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation1() {
		this.c = new Colis ("Toulouse","Carcasonne",31000,1.5F,2F,1);
		assertEquals(4.5F,c.tarifAffranchissement(),0F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2() {
		this.c = new Colis ("Toulouse","Carcasonne",31000,1.5F,2F,2);
		assertEquals(5.5F,c.tarifAffranchissement(),0F);
	}

}
