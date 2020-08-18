

public class demo123 extends Thread{

	@Override
	public void run() {
		for(int i =1 ;i<11;i++){
			System.out.println(Thread.currentThread().getId()+i);
		}
	}

	public static void main(String[] args) {
		demo123 d1 = new demo123();
		d1.start();
	}
}