package week1.day1;

public class Mobilephone {
	
	public void makeCall() {
		System.out.println("Making call is available");
		String mobileModel= "Samsung";
		float mobileWeight= 175.5f;
	}

	public void sendSms() {
		System.out.println("Message is received");
		boolean Fullcharged=true;
		int mobilecost= 15000;
		
	}
	public static void main(String[] args) {
		Mobilephone obj=new Mobilephone();
		obj.makeCall();
		obj.sendSms();
		System.out.println("This is my mobile");
		
		

	}

}
