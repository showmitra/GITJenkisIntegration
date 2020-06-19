
public class Bank1 {

	public static void main(String[] args) {
		bankAccount a= new bankAccount(0);
		a.addBal(200);
		a.getBal();
		
		
		bankAccount b= new bankAccount(100);
		b.addBal(300);
		b.getBal();
		
		a.transBal(b, 200);
		

	}

}
