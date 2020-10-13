import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestPoint {
	
	private IPoint p;
	
	@Before
	public void setUp() throws Exception {
		this.p = new Point(1.0F, 2.0F);
	}

	@After
	public void tearDown() throws Exception {
		this.p = null;
	}

	@Test
	public void testAbscisseConstructeur() {
		assertEquals(1.0F,this.p.getAbscisse(),0.0F);
	}
	
	@Test
	public void testOrdonnéeConstructeur() {
		assertEquals(2.0F,this.p.getOrdinate(),0.0F);
	}
	
	@Test
	public void testPointOrigine() {
		assertEquals(0.0F,Point.POINT_ORIGINE.getAbscisse(),0.0F);
		assertEquals(0.0F,Point.POINT_ORIGINE.getOrdinate(),0.0F);
	}
	
	@Test
	public void testTranslater() {
		float oldAbscisse = this.p.getAbscisse();
		float oldOrdonnée = this.p.getOrdinate();
		this.p.translate(1.1F, 2.2F);
		assertEquals(oldAbscisse + 1.1F, this.p.getAbscisse(),0.0F);
		assertEquals(oldOrdonnée + 2.2F, this.p.getOrdinate(),0.0F);
	}
	
	@Test
	public void testMettreAEchelle() {
		float oldAbscisse = this.p.getAbscisse();
		float oldOrdonnée = this.p.getOrdinate();
		this.p.toScale(1.5F);
		assertEquals(oldAbscisse * 1.5F, this.p.getAbscisse(),0.0F);
		assertEquals(oldOrdonnée * 1.5F, this.p.getOrdinate(),0.0F);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testMettreAEchelleValeurNégative() {
		this.p.toScale(-1.0F);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testMettreAEchelleValeurNulle() {
		this.p.toScale(0.0F);
	}
}
