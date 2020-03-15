package homework1;


public class Main {

	public static void main(String[] args) {
	System.out.println("DoubleLinkedListTest: ");
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.addToRear(4);
		list.addToFront(1);
		list.addToRear(2);
		list.removeFromRear();
		
		for (Integer i: list) {
			System.out.println(i);
		}
		
		System.out.println("list size: " + list.count());

		System.out.println("QueueTest:");
Queue<Integer> queue = new Queue<Integer>();
		
		queue.enqueue(1);
		queue.enqueue(3);
		queue.enqueue(2);
			
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(4);
			
		System.out.println("queue size: " + queue.size());
		
	System.out.println("StackTest:");
Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(2);
		stack.push(8);
		stack.push(5);
			
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
			
		stack.push(10);
		System.out.println("stack size: " + stack.size());

	}

}
