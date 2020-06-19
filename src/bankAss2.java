
public class bankAss2 {
	static String[] vUser= {"A","123abc","1500"};
	static String[] vUser1= {"A","123abc","1600"};
	public static void main(String[] args) {
		addFunds(1000);
	}
	
	public static void addFunds(int x) {
		System.out.println("Old balance was:"+vUser[2]);
		vUser[2]=String.valueOf(Integer.parseInt(vUser[2]) + x);
		vUser1[2]=String.valueOf(Integer.parseInt(vUser1[2]) + x);
		System.out.println("New balance is:"+vUser[2]);
		System.out.println("New balance is:"+vUser1[2]);
	}

}
