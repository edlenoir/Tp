import static org.junit.Assert.*;

import org.junit.Test;

public class MyStringTest {
	
	@Test
	public void testConstructeurArrayRecopie() {
		String str = "abc";
		char[] value = str.toCharArray();
		MyString test = new MyString(value);
		assertArrayEquals(value,test.value);
	}
	
	@Test
	public void testlength() {
		String str = "abc";
		char[] value = str.toCharArray();
		MyString test = new MyString(value);
		assertArrayEquals(value.length(),test.length());
	}


}
