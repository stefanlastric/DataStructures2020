package homework1;
import java.util.Iterator;

public class DoubleLinkedList<Item> implements Iterable<Item> {
	Node<Item> tail;
	Node<Item> head;
	int size = 0;
	
	/* Add an item to the beginning of the list */
	public void addToFront(Item item) {
		Node<Item> newNode = new Node<Item>();  // 1
		newNode.data = item; 					// 1
		newNode.next = head; 	
		newNode.previous=null;
		//ako je lista prazna, onda stavljamo tail da je ovaj novi node
		if(head==null)
		{	
			tail=newNode;
			//System.out.println("testest"+tail.data);
		}
		//ako nije prazna , onda head mora sa previous pokazivati na ovaj novi jer je ispred njega
		else {
			
			head.previous=newNode;}
		
		head = newNode; 						// 3
		size++;		
		// 4
	}
	
	/* Remove an item from the beginning of the list */
	public void removeFromFront() {
		if (head == null) {														// 1
			throw new IndexOutOfBoundsException("The linked list is empty.");	// 1
		}																		// 1
		head = head.next;
		head.previous=null;
		size--;																	// 3
	}
	
	/* Add a new item to the end of the list */
	public void addToRear(Item item) {
		Node<Item> newNode = new Node<Item>();		// 1
		newNode.data = item;						// 1
		
		newNode.previous=tail;
		newNode.next=null;
		
		if(tail==null) {
			head=newNode;}
		else 
		{ tail.next=newNode;}
		
		tail=newNode;
		size++;
		}
	
	/* Remove an item from the end of the list */
	public void removeFromRear() {
		if (head == null) {														// 1
			System.out.println("The linked list is empty.");	// 1
		}else if (size == 1) {													// 2
			head=null;		size--;
		}  else {																// 3
		tail=tail.previous;
		tail.next=null;
		size--;																// 6
	}	
		}
	
	public int count() {
		return size;
	}
	
	private class DoubleLinkedListIterator implements Iterator<Item> { 		// 1
		Node<Item> current = head;										// 2
		
		public boolean hasNext() {										// 3
			return current != null;										// 3
		}																// 3
			
		public Item next() {											// 4
			Item item = current.data;									// 4
			current = current.next;										// 4
			return item;												// 4
		}
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new DoubleLinkedListIterator();
	}
	
}
