package first;
import java.util.Scanner;

public class Dynamic2 {
public static void main(String[] args) {
		
		MyStack ms = new MyStack(); 
		MyQueue mq = new MyQueue();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("1.Stack  2.Queue  3.break");
			int num = sc.nextInt();
				
			if(num == 1) {  // stack  -> FILO
				while(true) {
					System.out.println("1.stack push  2.pop  3. break");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						ms.push(sc.nextInt());
					}else if(num1 == 2) {
						System.out.println(ms.pop());
					}else {
						 break;
					}
						 
				}
			}else if(num == 2) {  // Queue  -> FIFO
				while(true) {
					System.out.println("1.queue push  2.pop  3. break");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						mq.push(sc.nextInt());
					}else if(num1 == 2) {
						System.out.println(mq.pop());
					}else {
						 break;
					}
				}
			}else break;
			
			System.out.println("break");
		}
	}

}
