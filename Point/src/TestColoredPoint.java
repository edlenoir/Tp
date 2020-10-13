import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestColoredPoint extends TestPoint{

	private IColoredPoint pc;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		this.pc = new ColoredPoint(1.0F,2.0F,1,2,3);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		this.pc = null;
	}

	@Test
	public void testComposanteRougeConstructeur() {
		assertEquals(1,this.pc.getRed());
	}

	@Test
	public void testComposanteVerteConstructeur() {
		assertEquals(2,this.pc.getGreen());
	}
	
	@Test
	public void testComposanteBleuConstructeur() {
		assertEquals(3,this.pc.getBlue());
	}
	
	@Test
	public void testComposanteRougeSetter() {
		this.pc.setRed(255);
		assertEquals(255,this.pc.getRed());
	}

	@Test
	public void testComposanteVerteSetter() {
		this.pc.setGreen(255);
		assertEquals(255,this.pc.getGreen());
	}
	
	@Test
	public void testComposanteBleuSetter() {
		this.pc.setBlue(255);
		assertEquals(255,this.pc.getBlue());
	}
	
	@Test
	public void testPointColoréOrigine() {
		assertEquals(0.0F,ColoredPoint.POINT_ORIGINE.getAbscisse(),0.0F);
		assertEquals(0.0F,ColoredPoint.POINT_ORIGINE.getOrdinate(),0.0F);
		assertEquals(0,ColoredPoint.POINT_ORIGINE.getRed());
		assertEquals(0,ColoredPoint.POINT_ORIGINE.getGreen());
		assertEquals(0,ColoredPoint.POINT_ORIGINE.getBlue());
	}
}
