package org.system;

public class Desktop extends Computer {
	public void Desktopsize() {
		System.out.println("16 inches");
	}

	public static void main(String[] args) {
	
  Desktop obj=new Desktop();
  obj.Computermodel();
  obj.Desktopsize();
	}

}
