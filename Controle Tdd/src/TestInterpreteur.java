import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestInterpreteur {
	
	private Interpreteur interpreteur;

	@Before
	public void setUp() throws Exception {
		this.interpreteur = new Interpreteur();
	}

	@After
	public void tearDown() throws Exception {
		this.interpreteur = null;
	}

	@Test 
	public void testPromptInterpreteurAfterCreate() {
		assertEquals("$ ",this.interpreteur.promptQuestion());
		
	}
	
	@Test
	public void testStateInterpreteurAfterCreate() {
		assertTrue(this.interpreteur.isOff());
		assertFalse(this.interpreteur.isIn());
	}
	
	@Test 
	public void testCommandOhcePedroBetween20and6hours() {
		this.interpreteur.setTime(20,5,1);
		this.interpreteur.sendCommand("ohce Pedro");
		assertEquals("> |Buenos noches Pedro!\n",this.interpreteur.getResponse());
		assertTrue(this.interpreteur.isIn());
		assertFalse(this.interpreteur.isOff());
	}
	
	@Test
	public void testCommandOhcePedroBetween6and12hours() {
		this.interpreteur.setTime(11,59,59);
		this.interpreteur.sendCommand("ohce Pedro");
		assertEquals("> |Buenos dias Pedro!\n",this.interpreteur.getResponse());
		assertTrue(this.interpreteur.isIn());
		assertFalse(this.interpreteur.isOff());
	}
	
	@Test
	public void testCommandOhcePedroBetween12and20hours() {
		this.interpreteur.setTime(12,0,0);
		this.interpreteur.sendCommand("ohce Pedro");
		assertEquals("> |Buenos tardes Pedro!\n",this.interpreteur.getResponse());
		assertTrue(this.interpreteur.isIn());
		assertFalse(this.interpreteur.isOff());
	}

	@Test
	public void testCommandOhceSansPrenom() {
		this.interpreteur.setTime(12,0,0);
		this.interpreteur.sendCommand("ohce");
		assertEquals("> |and your name?\n",this.interpreteur.getResponse());
		assertFalse(this.interpreteur.isIn());
		assertTrue(this.interpreteur.isOff());
	}
	
	@Test
	public void testCommandOhceWhenTheSessionIsInProgress() {
		this.interpreteur.sendCommand("ohce Pedro");
		this.interpreteur.getResponse();
		assertTrue(this.interpreteur.isIn());
		this.interpreteur.sendCommand("ohce Brian");
		assertEquals("> |you must stop the session Pedro\n",this.interpreteur.getResponse());
	}
	
	@Test
	public void testCommandStop() {
		this.interpreteur.sendCommand("ohce Brian");
		this.interpreteur.getResponse();
		this.interpreteur.sendCommand("Stop!");
		assertEquals("> Adios Brian\n",this.interpreteur.getResponse());
	}
	
	@Test
	public void testCommandStopWhenTheSessionIsOff() {
		assertTrue(this.interpreteur.isOff());
		this.interpreteur.sendCommand("Stop!");
		assertEquals("> |you must initialize a session with ohce <name> please\n",this.interpreteur.getResponse());
	}
	
	@Test
	public void testCommandsOhceAndStopAndOhce() {
		this.interpreteur.sendCommand("ohce Pedro");
		this.interpreteur.getResponse();
		assertTrue(this.interpreteur.isIn());
		this.interpreteur.sendCommand("Stop!");
		this.interpreteur.getResponse();
		assertTrue(this.interpreteur.isOff());
		this.interpreteur.sendCommand("ohce Brian");
		this.interpreteur.getResponse();
		assertTrue(this.interpreteur.isIn());
	}
	
	@Test
	public void testWordsToReverse() {
		this.interpreteur.sendCommand("ohce Pedro");
		this.interpreteur.getResponse();
		this.interpreteur.sendCommand("hola");
		assertEquals("> aloh\n",this.interpreteur.getResponse());
		this.interpreteur.sendCommand("stop");
		assertEquals("> pots\n",this.interpreteur.getResponse());
	}

	@Test
	public void testPalindrome() {
		this.interpreteur.sendCommand("ohce Pedro");
		this.interpreteur.getResponse();
		this.interpreteur.sendCommand("oto");
		assertEquals("> oto\n" + "> |Bonita palabra!\n",this.interpreteur.getResponse());
	}
	
	@Test
	public void testCommandToReverseWhenTheSessionIsOff() {
		assertTrue(this.interpreteur.isOff());
		this.interpreteur.sendCommand("coucou");
		assertEquals("> |you must initialize a session with ohce <name> please\n",this.interpreteur.getResponse());
	}
}
