package ELIVATE_CJ_QSN;

public class Pratice_no_1 extends Thread  {
// There are 2 ways to create threads i.e. 
//	 1. By extending Thread class
//	2. By implementing runnable interface
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Pratice_no_1 e1 = new Pratice_no_1();
		e1.run();
		Thread.sleep(100);
		Pratice_no_1 e2 = new Pratice_no_1();
		e2.run();
	}

	@Override
	public void run() {
		for(int i =1;i<11;i++){
			System.out.println("Thread no : "+i);
		}
	}

}
