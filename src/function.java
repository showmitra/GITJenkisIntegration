
public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i, j;
		i=10;
		j=20;
		System.out.println("Output of i:" +i);
		System.out.println("Output of j:" +j);
        System.out.println("Output of i times j:" +(i*j));
*/
		
		System.out.println("Start");
		
		funA();
		funB("xyz");
		funC("sd",56);
		funD(100,200);
		
		int myV= funE(45,67);
		
		if (myV==3015) {
			System.out.println("verified");
		}else {
			System.out.println("Issue");
		}
		System.out.println("End");
	}
  public static void funA() {
	   System.out.println("$$$$");
	   System.out.println("$$$$");
	   System.out.println("$$$$");
}
  public static void funB(String printMe) {
	   System.out.println("I will print whatever you gine me:" +printMe);
	   
}
  public static void funC(String printMe, int printNoage) {
	   System.out.println("I will print whatever you gine me:" +printMe);
	   System.out.println("Don't prnt my age:" +printNoage);
}
  
  public static void funD(int x, int y) {
	  int z;
	  z=x+y;
	   System.out.println("The sum of " + x + " and " + y + " is: " + z);
	   
}
  
  public static int funE(int x, int y) {
	  int z;
	  z=x*y;
	   System.out.println("The product of " + x + " and " + y + " is: " + z);
	   return z;
}
}