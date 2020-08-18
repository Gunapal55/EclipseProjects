package ELIVATE_CJ_QSN;

public class Demo12 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getId() + " Thread value : " + i);
		}
	}

	public static void main(String[] args) {
		Demo12 d1 = new Demo12();
		Demo12 d2 = new Demo12();
		Demo12 d3 = new Demo12();
		d1.start();
		d2.start();
		d3.start();
	}
}