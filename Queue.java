package labs;

public class Queue {
	Node front;
	Node rear;
	public int size;
	Queue(){
		rear = null;
		front = null;
		size = 0;
	}
	public void enqueue (int val) {
		Node nptr = new Node(val);
		if (rear == null)
		front = nptr;
		else
		rear.next=nptr;
		rear = nptr;
		size++;
	}
	public int dequeue () {
		int d = front.num;
		front = front.next;
		if (front == null)
		rear = null;
		size--;
		return d;

	}
}
