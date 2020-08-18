package ELIVATE_CJ_QSN;

public class count_no_words {
	
	public static void main(String[] args) {
		String word = "Hello jack";
		String[] x = word.split(" ");
		for( int i=0;i<x.length;i++){
			System.out.println(x[i].length());	
		}
		
		String space = " ";
		if(word.contains(space)){
			word.split(space);
		}
		System.out.println(x.length);// counts no of words based on space 
		System.out.println(word.length());// Counts total no of words including space
	}
}
