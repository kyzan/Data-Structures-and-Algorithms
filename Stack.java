package labs;

public class Stack {
	Node top;
	int size;
	Stack(){
		top=null;
		size=0;
	}
	public void push(int val) {
		Node nptr = new Node(val);
		nptr.next = top;
		top = nptr;
		size++;
	}
	public int pop() {
		int d = top.num;
		top = top.next;
		size--;
		return d;
	}
	public int peek () {
		int d = top.num;
		return d;
	}
}
