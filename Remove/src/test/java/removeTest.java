import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class removeTest {

	@Test
	void test() {
		remove r=new remove();
		assertEquals("BCD",r.removeA("ABCD"));
		assertEquals("CD",r.removeA("AACD"));
		assertEquals("BCD",r.removeA("BACD"));
		assertEquals("BBAA",r.removeA("BBAA"));
		assertEquals("BAA",r.removeA("AABAA"));
		
	}

}
