package org.openjfx;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class SampleBOTest {

	
	@Test
	void CreateNewTest() {
		SampleBO testobj = SampleBO.createNewBO ("Mike", "23");
		assertEquals (testobj.getAName(), "Mike");
		assertNotNull (testobj);
		assertThat (testobj, instanceOf (SampleBO.class));
		//fail("Not yet implemented");
	}

}

