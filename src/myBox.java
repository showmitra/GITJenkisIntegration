
public class myBox {
int vW,vH, vL;
String vStatus;

public void getArea() {
	int vArea=this.vH * this.vW * this.vL;
	System.out.println("The area for box is "+vArea);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myBox b1= new myBox();
		b1.vW=10;
		b1.vH=20;
		b1.vL=30;
		b1.vStatus="open";
		myBox b2= new myBox();
		b2.vW=50;
		b2.vH=150;
		b2.vL=20;
		b2.vStatus="close";
		
		System.out.println("b1 is "+b1.vStatus);
		System.out.println("b1 is "+b2.vStatus);
		
		b1.getArea();
		b2.getArea();
		
		
		
		

	}

}
