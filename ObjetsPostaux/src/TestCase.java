import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase {
	private Lettre l;
	private Lettre j;
	
	@Before
	public void setUp() throws Exception {
		this.l = new Lettre("Toulouse","Carcasonne",31000,1.5F,2F,0,false);
	}

	@After
	public void tearDown() throws Exception {
		this.l = null;
	}

	@Test
	public void testAffranchissementTauxRecommandation0NonUrgente() {
		assertEquals(0.50F,l.tarifAffranchissement(),0F);
	}
	@Test
	public void testAffranchissementTauxRecommandation0Urgente() {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,0,true);
		assertEquals(0.80F,j.tarifAffranchissement(),0F);
	}
	@Test
	public void testAffranchissementTauxRecommandation1NonUrgente () {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,1,false);
		assertEquals(1F,j.tarifAffranchissement(),0F);
	}
	@Test
	public void testAffranchissementTauxRecommandation1Urgente () {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,1,true);
		assertEquals(1.3F,j.tarifAffranchissement(),0F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2NonUrgente () {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,2,false);
		assertEquals(2F,j.tarifAffranchissement(),0F);
	}
	@Test
	public void testAffranchissementTauxRecommandation2Urgente () {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,2,true);
		assertEquals(2.3F,j.tarifAffranchissement(),0F);
	}
	@Test
	public void testToString() {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,2,false);
		assertEquals("Lettre [31000/Carcasonne/2/ordinaire]",j.toString());
	}
	@Test
	public void testToStringurgent() {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,2,true);
		assertEquals("Lettre [31000/Carcasonne/2/urgent]",j.toString());
	}
	@Test
	public void tarifRemboursement0() {
		assertEquals(0F,l.tarifRemboursement(),0F);
	}
	
	public void tarifRemboursement1() {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,1,true);
		assertEquals(1.5F,j.tarifRemboursement(),0F);
	}
	
	public void tarifRemboursement2() {
		this.j = new Lettre ("Toulouse","Carcasonne",31000,1.5F,2F,2,true);
		assertEquals(15F,j.tarifRemboursement(),0F);
	}
}
