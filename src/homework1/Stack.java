package homework1;

import java.util.NoSuchElementException;

public class Stack<Item> {

	@SuppressWarnings("unchecked")
	private Item[] q = (Item[]) new Object[1];
	private int length = 0;

	@SuppressWarnings("unchecked")
	private void resize(int capacity) {
        assert capacity >= length;

        // textbook implementation
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < length; i++) {
            temp[i] = q[i];
        }
        q = temp;

    }
	/* Push an item onto the stack */
	public void push(Item item) {
		if (length == q.length) resize(2*q.length);    // double size of array if necessary
        q[length++] = item;   
	}
	
	/* Check if the stack is empty */
	public boolean isEmpty() {
		return length == 0;
	}
	
	/* Remove the top item from the stack, and return its data */
	public Item pop() {														
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = q[length-1];
        q[length-1] = null;                              // to avoid loitering
        length--;
        // shrink size of array if necessary
        if (length > 0 && length == q.length/4) resize(q.length/2);
        return item;													// 5
	}
	
	/* Return the current size of the stack */
	public int size() {
		return length;
	}
}
