import static org.junit.Assert.*;

import org.junit.Test;


public class VectorTest {

	@Test
	public void testMinVector() {
				
		assertEquals(4,Vector.minVector(new int[]{4,7,9,12,45,56}));
		assertEquals(3,Vector.minVector(new int[]{4,7,9,45,56,3}));
		assertEquals(2,Vector.minVector(new int[]{4,7,9,2,56,99}));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testMinEmpty(){
		Vector.minVector(new int[]{});
	}

}
