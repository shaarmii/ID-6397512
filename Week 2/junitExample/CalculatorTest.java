package junitExample;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

// A simple Calculator class inside the test file
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
public class CalculatorTest {
	 private Calculator calc;

	    // Setup method - runs before each test
	    @Before
	    public void setUp() {
	        calc = new Calculator();  // Arrange
	        System.out.println("Setup: Calculator created");
	    }

	    // Teardown method - runs after each test
	    @After
	    public void tearDown() {
	        calc = null;
	        System.out.println("Teardown: Calculator cleared");
	    }

	    @Test
	    public void testAddition() {
	        int result = calc.add(2, 3);      // Act
	        assertEquals(5, result);          // Assert
	    }
	    
	    @Test
	    public void testSubtraction() {
	        int result = calc.subtract(5, 2); // Act
	        assertEquals(3, result);          // Assert
	    }


}
