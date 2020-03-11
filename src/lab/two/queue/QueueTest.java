package lab.two.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {private Queue<Integer> queue;

@BeforeEach
void setUp() throws Exception {
	queue = new Queue<Integer>();
}

@AfterEach
void tearDown() throws Exception {
	queue = null;
}

@Test
void testChecksEmptyQueue() {
	assertTrue(queue.isEmpty());
}

@Test
void testCorrectlyEnqueuesToQueue() {
	queue.enqueue(1);
	queue.enqueue(2);
	assertFalse(queue.isEmpty());
	assertEquals(2, queue.size());
}

@Test
void testCorrectlyDequeuesFromQueue() {
	queue.enqueue(3);
	queue.enqueue(4);
	assertEquals(3, (int)queue.dequeue());
}

@Test
void testCorrectlyEnqueuesAndDequeues() {
	queue.enqueue(5);
	queue.enqueue(3);
	queue.enqueue(8);
	assertEquals(3, queue.size());
	
	assertEquals(5, (int)queue.dequeue());
	assertEquals(3, (int)queue.dequeue());
	assertEquals(8, (int)queue.dequeue());
	assertEquals(0, queue.size());
}

}
