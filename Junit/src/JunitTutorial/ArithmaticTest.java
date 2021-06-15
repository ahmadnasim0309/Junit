package JunitTutorial;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmaticTest {
	
	private int firstno;
	private int secondno;
	private int expectedresult;
	private Arithmatic arithmatic;
	
	public ArithmaticTest(int firstno, int secondno, int expectedresult, Arithmatic arithmatic) {
		super();
		this.firstno = firstno;
		this.secondno = secondno;
		this.expectedresult = expectedresult;
		this.arithmatic = arithmatic;
	}
	
	@Before
	public void initialize(){
		arithmatic = new Arithmatic();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { {1,2,3},{11,22,33},{111,222,333},{10,9,19},{100,9,109} });
	}
	
	@Test
	public void testArithmaticTest() {
		System.out.println("sum of numbers = :" + expectedresult);
		assertEquals(expectedresult, arithmatic.sum(firstno, secondno));
	}
}
