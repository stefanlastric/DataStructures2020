package lab.two.queue;

public class Queue<Item> {	
	@SuppressWarnings("unchecked")
	private Item[] q = (Item[]) new Object[1];
	
	private int head = 0;
	private int tail = 0;
	private int length = 0;
	
	
	/* Add a new item to the back of the queue */
	public void enqueue(Item item) {
		if (q.length == length) {		// 1
			resize(2 * q.length);		// 1
		}								// 1
		
		q[tail] = item;					// 2
		tail = (tail + 1) % q.length;	// 3
		length++;						// 4
	}
	
	/* Removes an item from the front of the queue, and returns its data */
	
	public Item dequeue() {
		Item item = q[head];							// 1
		q[head] = null;									// 2
		head = (head + 1) % q.length;					// 3
		
		if (length > 0 && length == q.length / 4) {		// 4
			resize(q.length / 2);						// 4
		}												// 4
		
		length--;										// 5
		return item;									// 6
	}
	
	/* Create a new internal array with a given capacity */
	@SuppressWarnings("unchecked")
	public void resize(int capacity) {
		Item[] copy = (Item[]) new Object[capacity];	// 1
		for (int i = 0; i < length; i++) {				// 2
			copy[i] = q[(i + head) % q.length];			// 2
		}												// 2
		head = 0;										// 3
		tail = length;									// 3
		q = copy;										// 4
	}
	
	/* Check if the queue is empty */
	public boolean isEmpty() {
		return length == 0;
	}
	
	/* Return the current size of the queue */
	public int size() {
		return length;
	}
}
