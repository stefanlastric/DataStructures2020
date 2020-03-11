package homework1;

public class Queue<Item> {	
	@SuppressWarnings("unchecked")
	
	int length;
	Node<Item> tail;
	Node<Item> head;
	
	
	/* Add a new item to the back of the queue */
	public void enqueue(Item item) {
		Node<Item> newNode = new Node<Item>();
		if(this.tail==null) {
			this.head=this.tail=newNode;
			return;
		}
		this.tail.next=newNode;
		this.tail=newNode;
		length++;
	}
	
	
	public void dequeue() {
		if(this.head==null) {
			return;
		}
		Node<Item>newNode=new Node<Item>();
		
		newNode=this.head;
		this.head=this.head.next;
		if(this.head==null)this.tail=null;
		length--;
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
