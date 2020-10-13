import static org.junit.Assert.*;
import org.junit.Test;

public class TestBilletTrain {

	@Test (expected=IllegalArgumentException.class)
	public void testDistanceParcourueAuMoins2km() {
	BilletTrain sncf = new BilletTrain(2F);
	}
	
	@Test
	public void testTarifBarêmeBordPlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(10 , sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void testTarifBarêmeContrôlePlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(50 ,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde25kms() {
		BilletTrain sncf = new BilletTrain(25.5F);
		assertEquals(15,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde50kms() {
		BilletTrain sncf = new BilletTrain(50.5F);
		assertEquals(50,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBarêmeContrôlePlusde50kms() {
		BilletTrain sncf = new BilletTrain(50.5F);
		assertEquals(50,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde100kms() {
		BilletTrain sncf = new BilletTrain(100.5F);
		assertEquals(35,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void  testTarifBarêmeContrôlePlusde100kms() {
		BilletTrain sncf = new BilletTrain(100.5F);
		assertEquals(50,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde150kms() {
		BilletTrain sncf = new BilletTrain(150.5F);
		assertEquals(60,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void  testTarifBarêmeContrôlePlusde150kms() {
		BilletTrain sncf = new BilletTrain(150.5F);
		assertEquals(90,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void  testTarifBarêmeBordPlusde300kms() {
		BilletTrain sncf = new BilletTrain(300.5F);
		assertEquals(90,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void   testTarifBarêmeContrôlePlusde300kms() {
		BilletTrain sncf = new BilletTrain(300.5F);
		assertEquals(120,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
}
