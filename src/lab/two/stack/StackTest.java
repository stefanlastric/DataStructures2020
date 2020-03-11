package lab.two.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {

	private Stack<Integer> stack;
	 
    @BeforeEach
    void setUp() throws Exception {
        stack = new Stack<Integer>();
    }
 
    @AfterEach
    void tearDown() throws Exception {
        stack = null;
    }
 
    @Test
    void testChecksEmptyStack() {
        assertTrue(stack.isEmpty());
    }
   
    @Test
    void testCorrectlyPushesToStack() {
        stack.push(1);
        stack.push(2);
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.size());
    }
   
    @Test
    void testCorrectlyPopsFromStack() {
        stack.push(3);
        stack.push(4);
        assertEquals(4, (int)stack.pop());
    }
   
    @Test
    void testCorrectlyPopsAndPushes() {
        stack.push(5);
        stack.push(3);
        stack.push(8);
        assertEquals(3, stack.size());
       
        assertEquals(8, (int)stack.pop());
        assertEquals(3, (int)stack.pop());
        assertEquals(5, (int)stack.pop());
        assertEquals(0, stack.size());
    }
   
    @Test
    void testDoesNotPopFromEmptyStack() {
        assertThrows(IndexOutOfBoundsException.class, () -> stack.pop());
    }

}
