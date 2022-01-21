package first;

public class MyQueue extends Memory {

	private int front;
	
	public MyQueue() {
		front = 0;
	}
	
	@Override
	public int pop() {
		 
		return arr[front++];
	}

}