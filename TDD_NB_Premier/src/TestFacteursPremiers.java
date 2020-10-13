import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestFacteursPremiers {
	private DecompositionEnFacteursPremiers d;
	
	
	@Before
	public void setUp() throws Exception {
		this.d = new DecompositionEnFacteursPremiers();
		}
	
	
	@After
	public void tearDown() throws Exception {
			this.d = null;
		}
	
	
	@Test
	public void UnNapasDeFacteursPremiers() {
		assertEquals(Arrays.asList(), d.computeRe(1));
	}
	
	@Test
	public void DeuxAUnFacteurPremierDeux() {
		assertEquals(Arrays.asList(2), d.computeRe(2));
	}
	
	@Test
	public void TroisAUnFacteurPremierTrois() {
		assertEquals(Arrays.asList(3), d.computeRe(3));
	}
	@Test
	public void QuatreAUnFacteurPremierDeuxDeux() {
		assertEquals(Arrays.asList(2,2), d.computeRe(4));
	}
	
	@Test
	public void QuatreAUnFacteurPremierCinq() {
		assertEquals(Arrays.asList(5), d.computeRe(5));
	}
	
	@Test
	public void QuatreAUnFacteurPremierSix() {
		assertEquals(Arrays.asList(2,3), d.computeRe(6));
	}
	
	@Test
	public void QuatreAUnFacteurPremierHuit() {
		assertEquals(Arrays.asList(2,2,2), d.computeRe(8));
	}
	
	@Test
	public void QuatreAUnFacteurPremierNeuf() {
		assertEquals(Arrays.asList(3,3), d.computeRe(9));
	}
	
	@Test
	public void QuatreAUnFacteurPremierDix() {
		assertEquals(Arrays.asList(2,5), d.computeRe(10));
	}
	
	@Test
	public void QuatreAUnFacteurPremier42() {
		assertEquals(Arrays.asList(2,3,7), d.computeRe(42));
	}
	
}