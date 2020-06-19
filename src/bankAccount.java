
public class bankAccount {
	
	String vAC, vStatus;
	int vBal;
	
	public bankAccount(int vStartBal) {
		System.out.println("Creating new bank account");
		vBal=vStartBal;
		System.out.println("Added funds" +vBal);
	}
	
	public void getBal() {
		System.out.println("Blance is " +this.vBal);
		
	}
	public void addBal(int vAdd) {
		System.out.println("Old balance is " + this.vBal);
		this.vBal+=vAdd;
		System.out.println("New balance is " +this.vBal);
		
	}
	
	public void transBal(bankAccount toAC, int transAmount) {
		System.out.println("Transferring funds ");
	    this.addBal(-transAmount);
	    toAC.addBal(transAmount);
		
		
	}
    public void lockAC() {
	
    }
}
