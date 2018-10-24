//import com.codesjava.business.*;
import static org.junit.Assert.*;
import org.junit.Test;
 

public class DivisionTestCase {
	//DivisionTest class objects
	DivisionTest divisionTest1 = new DivisionTest(10, 2); 
	DivisionTest divisionTest2 = new DivisionTest(10, 0); 
 
	//Test case for division
	@Test
	public void test() {
		assertEquals(5, divisionTest1.division());
	}
 
	//Test case for expected ArithmeticException 
	@Test(expected = ArithmeticException.class)  
	public void testException() {
		assertEquals(5, divisionTest2.division());
	}
}