package ELIVATE_CJ_QSN;

public class InavildamountException extends Exception{

	String str;
	public InavildamountException(String str) {
		this.str = str;
	
	}
	public String toString(){
		return ("ERROR : No balance "+ str);
		
	}

	
	
	
}