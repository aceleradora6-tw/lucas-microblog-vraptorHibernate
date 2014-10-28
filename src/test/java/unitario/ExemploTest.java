package unitario;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class ExemploTest {

	@Test
	public void fakeTest() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void fakeTest2() throws Exception {
		assertEquals(1+1, 2);
	}
	
	@Test
	public void assertCoreMatcher() throws Exception {
		assertThat(1+1, is(2));
	}
	
	@Test
	public void testeRuim() throws Exception {
		String result = "Ola Mundo";
		
		assertThat(result, is(""));
	}
}
