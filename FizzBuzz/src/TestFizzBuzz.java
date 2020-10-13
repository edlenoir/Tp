import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {
	
	private FizzBuzz f;

	@Before
	public void setUp() throws Exception {
		this.f = new FizzBuzz();
	}
	
	@After
	public void tearDown() throws Exception {
		this.f = null;
	}
	
	
	
	
	@Test
	public void testCasNominal() {
		assertEquals("1",this.f.convertion(1));
		assertEquals("2",this.f.convertion(2));
	}
	
	@Test
	public void testCasFizz() {
		assertEquals("Fizz",this.f.convertion(3));
		assertEquals("Fizz",this.f.convertion(6));
		assertEquals("Fizz",this.f.convertion(9));
	}
	
	
	@Test
	public void testCasBuzz() {
		assertEquals("Buzz",this.f.convertion(5));
		assertEquals("Buzz",this.f.convertion(10));
		assertEquals("Buzz",this.f.convertion(20));
	}
	
	@Test
	public void testCasFizzBuzz() {
		assertEquals("FizzBuzz",this.f.convertion(15));
		assertEquals("FizzBuzz",this.f.convertion(30));
		assertEquals("FizzBuzz",this.f.convertion(45));
	}

}
