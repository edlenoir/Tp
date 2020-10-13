import static org.junit.Assert.*;
import org.junit.Test;

public class TestBilletTrain {

	@Test (expected=IllegalArgumentException.class)
	public void testDistanceParcourueAuMoins2km() {
	BilletTrain sncf = new BilletTrain(2F);
	}
	
	@Test
	public void testTarifBar�meBordPlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(10 , sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(50 ,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBar�meBordPlusde25kms() {
		BilletTrain sncf = new BilletTrain(25.5F);
		assertEquals(15,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void testTarifBar�meBordPlusde50kms() {
		BilletTrain sncf = new BilletTrain(50.5F);
		assertEquals(50,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde50kms() {
		BilletTrain sncf = new BilletTrain(50.5F);
		assertEquals(50,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBar�meBordPlusde100kms() {
		BilletTrain sncf = new BilletTrain(100.5F);
		assertEquals(35,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void  testTarifBar�meContr�lePlusde100kms() {
		BilletTrain sncf = new BilletTrain(100.5F);
		assertEquals(50,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void testTarifBar�meBordPlusde150kms() {
		BilletTrain sncf = new BilletTrain(150.5F);
		assertEquals(60,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void  testTarifBar�meContr�lePlusde150kms() {
		BilletTrain sncf = new BilletTrain(150.5F);
		assertEquals(90,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
	
	@Test
	public void  testTarifBar�meBordPlusde300kms() {
		BilletTrain sncf = new BilletTrain(300.5F);
		assertEquals(90,sncf.getTarifAvecTable(BilletTrain.BAREMEBORD));
	}
	
	@Test
	public void   testTarifBar�meContr�lePlusde300kms() {
		BilletTrain sncf = new BilletTrain(300.5F);
		assertEquals(120,sncf.getTarifAvecTable(BilletTrain.BAREMECONTROLE));
	}
}
