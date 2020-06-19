import java.util.Scanner;

public class bankAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * version1
		String uN,uP;
		uN="show";
		uP="123";
		
		if(uN.equals("show")) {
			System.out.println("usename is correct");
			
			if(uP.equals("123")) {
				System.out.println("userpswd is correct");
				
				System.out.println("User loged in");
			}
			
			else {
				System.out.println("Incorrect paswd");
			}
		}
			else {
				System.out.println("Incorrect username");
			}
			*/
	/*		
	//version 2
		String uN,uP;
		
		 Scanner sc1=new Scanner(System.in);
		 
		 System.out.println("     ------------");
		 System.out.print("Enter userName:");
		 uN = sc1.nextLine();
		 System.out.println("userName is:" +uN);
		 
		 System.out.println("       -----------");
		 
		 System.out.print("Enter uPswd:"); 
		 uP=sc1.nextLine();
		 System.out.println("uPswd is:" +uP);
		 
		 sc1.close();
		 
		// if(uN.equals("show")) {
		  if (uN.equalsIgnoreCase("show")){
				System.out.println("usename is correct");
				
				if(uP.equals("123")) {
					System.out.println("userpswd is correct");
					
					System.out.println("User loged in");
				}
				
				else {
					System.out.println("Incorrect paswd");
				}
		    }
				else {
					System.out.println("Incorrect username");
			}
	
	
	}
			
				
	}
	/*
		
		// version 3
		
		 String uN,uP;
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("     Starting point");
		 
		int vAttms = 3;
		/*
		boolean vLogin;
		vLogin=true;
		vLogin=false;
		
		if(vLogin) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		while (vAttms>0) {
			 
	
			 System.out.println("attempts left are:"+vAttms);
			 vAttms--;
			 System.out.print("Enter user name:");
			 uN = sc1.nextLine();
			 
			 System.out.print("Enter user Password:"); 
			 uP=sc1.nextLine();
			 
			
		 
			 if (uN.equalsIgnoreCase("show")){
				System.out.println("user name is correct");
				if(uP.equals("123")) {
					System.out.println("user pswd is correct");
					System.out.println("User loged in");
					break;
				}
				
				else {
					System.out.println("Incorrect password");
				}
		    }
				else {
					System.out.println("Incorrect user name");
			}
	
			 if(vAttms==0) {
				 System.out.println("You ran out all ur attempts");
			     break;
			 }
	}
			
				sc1.close();
}
}
 */

// version 4

String uN,uP;
Scanner sc1=new Scanner(System.in);
System.out.println("     Starting point");

int vAttms = 3;
while (vAttms>0) {
	 

	 System.out.println("attempts left are:"+vAttms);
	 vAttms--;
	 System.out.print("Enter user name:");
	 uN = sc1.nextLine();
	 
	 System.out.print("Enter user Password:"); 
	 uP=sc1.nextLine();
	 
	

	 if (uN.equalsIgnoreCase("show") && uP.equals("123")){
		    System.out.println("user name is correct");
			System.out.println("user pswd is correct");
			System.out.println("User loged in");
			break;
		}
		
		else {
			System.out.println("Incorrect user name or password");
		
   }
	

	 if(vAttms==0) {
		 System.out.println("You ran out all ur attempts");
	     break;
	 }
}
	
		sc1.close();
}
}

