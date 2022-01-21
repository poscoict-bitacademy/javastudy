package first;

public abstract class Memory {

	// data => int 5개
	protected int []arr;
	protected int top; // 데이터삽입 마지막위치.
	
	public Memory() {
		arr = new int[5];
		top = 0;
	}
	
	public void push(int data) {
		arr[top] = data; 
		top++;
	}
	
	public abstract int pop();
}