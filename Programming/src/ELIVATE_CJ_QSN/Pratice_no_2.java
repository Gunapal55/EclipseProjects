package ELIVATE_CJ_QSN;

public class Pratice_no_2 implements Runnable {

	@Override
	public void run() {
for(int i=1;i<101;i++){
	System.out.println("Thread value : "+i);
}
		
	}
public static void main(String[] args) {
	Thread t1 = new Thread(new Pratice_no_2());
	t1.start();
	Thread t2 = new Thread(new Pratice_no_2());
	t2.start();
	Thread t3 = new Thread(new Pratice_no_2());
	t3.start();
}
}
