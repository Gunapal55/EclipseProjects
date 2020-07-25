package Demo;
public class device2 extends device {

	public void RND(){
		super.RND(); 
		System.out.println("Wifi calling 5G");
		
	
	}
	
	
	public static void main(String[] args) {
		
		device d = new device2();
		d.RND();
		
		
	}
}
