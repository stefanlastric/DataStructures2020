package homework1;

public class Queue<Item> {	
	@SuppressWarnings("unchecked")
	
	int length = 0;
	Node<Item> tail;
	Node<Item> head;
	
	
	/* Add a new item to the back of the queue */
	public void enqueue(Item item) {
		Node<Item> newNode = new Node<Item>();
		newNode.data=item;
		newNode.next=null;
		
		if(head==null) {
			head=tail=newNode;
			head.previous=null;
		}else
		{
		tail.next=newNode;
		newNode.previous=tail;
		tail=newNode;
		
	}length++;
	}
	
	public Item dequeue() {
		if(head==null) {
			return null;
		}
		Node<Item>newNode=new Node<Item>();
		newNode=head;
		head=head.next;
		
		if(head==null)tail=null;
		
		if(length>0)length--;
		
		return newNode.data;
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
