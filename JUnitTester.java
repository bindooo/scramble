import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTester {

	@Test
	public void checkResult() {

			   // MyClass is tested
			   HW_sentence tester = new HW_sentence();

			   // Tests
			   assertEquals("empty string -> ", "0", tester.mix(""));
			   assertEquals("a -> ", "a ", tester.mix("a"));
			   assertEquals("ab -> ", "ab ", tester.mix("ab"));
			   assertEquals("abc -> ", "abc ", tester.mix("abc"));
			   assertEquals("abcd -> ", "acbd ", tester.mix("abcd"));
			   assertEquals("this is a sentence -> ", "tihs is a scnetnee ", tester.mix("this is a sentence"));
			   assertEquals("An apple a day, keeps the doctor away! -> ", "An alppe a day kpees the dotcor aawy ", tester.mix("An apple a day, keeps the doctor away!"));
			   
	}

}
