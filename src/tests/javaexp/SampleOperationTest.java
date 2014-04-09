package javaexp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleOperationTest {

	public SampleOperation instance;
	
	@Before
	public void setUp() throws Exception {
		instance = new SampleOperation();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void testAddOne() {
		int res = instance.addOne(1);
		assertEquals(2, res);
	}

}
