package ELIVATE_CJ_QSN;

public class Test implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getId() + " Values : " + i);
		}

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Test());
		t1.start();
		Thread t2 = new Thread(new Test());
		t2.start();
	}
}
