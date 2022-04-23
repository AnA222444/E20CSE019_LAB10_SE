package JunitTest_lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		junitfunctions junit=new junitfunctions();
		String res=junit.addStrings("LAB10_TV ANISH,","E20CSE019");
		assertEquals("LAB10_TV ANISH,E20CSE019",res);
	}

}
