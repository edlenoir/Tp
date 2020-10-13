package Singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSingleton {

	@Test
	public void Objnotnull() {
		assertNotNull(Singleton.getInstance());
		
	}
	
	@Test
	public void ObjegaleaSingleton() {
		assertTrue(Singleton.getInstance() instanceof Singleton);
		
	}
	@Test
	public void Mêmetype() {
		Singleton s = Singleton.getInstance();
		assertSame(Singleton.getInstance() ,s);
		
	}

}
