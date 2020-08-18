package ELIVATE_CJ_QSN;

public class Threadtest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 11; i++) {
					System.out.println(Thread.currentThread().getId() + " Thread value : " + i);
				}
			}
		});
		t1.start();

	}

}