/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GradleAssign1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
	String message = "olleH";
	int fact=120;
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertEquals(message, classUnderTest.reverse());     
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        assertEquals(fact, classUnderTest.findFact());    
    }
}
