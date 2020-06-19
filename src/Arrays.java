
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vUN= {"A","B","C","D","E"};
		int[] vPW= {1,2,3,4,5};
		
	System.out.println(vUN[0]);
	System.out.println(vUN[1]);
	//System.out.println(vUN[5]);
	
	int i=vUN.length;
	System.out.println("My vUN aray size:"+i);
	int j=vPW.length;
	System.out.println("My vPW array size:"+j);
	
	for (int a=0; a<i; a++) {
		System.out.println("vUN " + a + "  is  " +vUN[a]);
	}
	for (int b=0; b<j; b++) {
		System.out.println("vPW  " + b + "  is  " +vPW[b]);
	}
	}

}
