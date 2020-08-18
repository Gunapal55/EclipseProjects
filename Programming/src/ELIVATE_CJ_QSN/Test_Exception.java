package ELIVATE_CJ_QSN;

public class Test_Exception {

	public static void main(String[] args) {
		
		try{
			throw new InavildamountException("low balance");
		}
		catch(Exception e){
			//System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
