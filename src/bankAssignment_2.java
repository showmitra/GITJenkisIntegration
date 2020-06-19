import java.util.Scanner;

public class bankAssignment_2 {

	public static void main(String[] args) {
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




