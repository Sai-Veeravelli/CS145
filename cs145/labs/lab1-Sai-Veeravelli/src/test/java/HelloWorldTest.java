/*
// this is the testing class
// DO NOT MODIFY THIS CLASS AND ITS METHODS
*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class HelloWorldTest {
    @Test public void testHelloWorldGreeting() {
    	// init an object of your helloworld class
        HelloWorld classUnderTest = new HelloWorld();
        // init an object of rightsolution
        RightSolution solution = new RightSolution();
        // compare the return results of the two objects' getGreeting method
        assertThat(classUnderTest.getGreeting(), is(solution.getGreeting()));
    }
}
