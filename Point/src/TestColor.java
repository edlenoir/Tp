import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestColor {
	
	private Color c;

	@Before
	public void setUp() throws Exception {
		this.c = new Color(1,2,3);
	}

	@After
	public void tearDown() throws Exception {
		this.c = null;
	}

	@Test
	public void testComposanteRougeConstructeur() {
		assertEquals(1,this.c.getRed());
	}

	@Test
	public void testComposanteVerteConstructeur() {
		assertEquals(2,this.c.getGreen());
	}
	
	@Test
	public void testComposanteBleuConstructeur() {
		assertEquals(3,this.c.getBlue());
	}
	
	@Test
	public void testComposanteRougeSetter() {
		this.c.setRed(255);
		assertEquals(255,this.c.getRed());
	}

	@Test
	public void testComposanteVerteSetter() {
		this.c.setGreen(255);
		assertEquals(255,this.c.getGreen());
	}
	
	@Test
	public void testComposanteBleuSetter() {
		this.c.setBlue(255);
		assertEquals(255,this.c.getBlue());
	}
	
	@Test
	public void testConstanteRouge() {
		assertEquals(255,Color.RED.getRed());
		assertEquals(0,Color.RED.getGreen());
		assertEquals(0,Color.RED.getBlue());
	}
	
	@Test
	public void testConstanteVert() {
		assertEquals(0,Color.GREEN.getRed());
		assertEquals(255,Color.GREEN.getGreen());
		assertEquals(0,Color.GREEN.getBlue());
	}
	
	@Test
	public void testConstanteBleu() {
		assertEquals(0,Color.BLUE.getRed());
		assertEquals(0,Color.BLUE.getGreen());
		assertEquals(255,Color.BLUE.getBlue());
	}
	
	@Test
	public void testValeurRVB() {
		assertEquals(256 * 256 + 2 * 256 + 3,this.c.getRVB());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValeurNégativeComposanteRouge() {
		this.c.setRed(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValeurTropGrandeComposanteRouge() {
		this.c.setRed(256);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValeurNégativeComposanteVert() {
		this.c.setGreen(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValeurTropGrandeComposanteVert() {
		this.c.setGreen(256);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValeurNégativeComposanteBleu() {
		this.c.setBlue(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValeurTropGrandeComposanteBleu() {
		this.c.setBlue(256);
	}
}
