package week3.day2.assignment;

public class Automation extends MultipleLanguage{

	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.Java();
		obj.python();
		obj.ruby();
		obj.selenium();

	}

	public void selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}

}
