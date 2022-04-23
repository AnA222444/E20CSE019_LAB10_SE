
package JunitTest_lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		junitfunctions junit=new junitfunctions();
		int res=junit.addnum(1,400);
		assertEquals(500,res);
	}

}
