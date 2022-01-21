package first;
class ATM implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
			
				// notify() : wait()에서 대기중인 쓰레드 대기 해제
				this.notify();

				// wait() : 점유 해제 및 notify() 호출 대기
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}	
	}
	public void withDraw(long howMuch) {
		System.out.print(Thread.currentThread().getName() + ", ");
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.printf("잔액 : %,d원 %n", getDepositeMoney());
		} else {
			System.out.printf("잔액이 부족합니다.");
		}
	}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class SyncroniazedEx {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread trd_mom = new Thread(atm, "mom");
		Thread trd_son = new Thread(atm, "son");
		trd_mom.start();
		trd_son.start();
	}
}




