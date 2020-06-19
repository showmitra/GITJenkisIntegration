
public class forLoop {

	public static void main(String[] args) {
	/*	int i;
		int j=22;
		System.out.println(j);
		j=j+1;
		j++;
		System.out.println(j);
		
		
		for (i=1;i<=100; i = i+1) {
			System.out.println("A:" +i);
		}

		
		//Multiplication table
		
		int bNum=12;
		int bTimes=20;
		int xOP;
		
		for (int u=1;u<=bTimes; u++) {
		System.out.println(bNum  +  " * "   + u  +  " = "  + (bNum*u));
	}
 //Tree
		System.out.println( "        *");
		System.out.println("       ***");
		System.out.println("      *****");
		System.out.println("     *******");
		System.out.println("    *********");
		System.out.println("        *");
		System.out.println("        *");
		System.out.println("        *");
		System.out.println("        *");
		System.out.println("        *");
		System.out.println("        *");
	
}*/
	/*
	for (int i = 0; i < 10; i++) {
		//System.out.println(i);
		for (int j = 0; j < 10 - i; j++) {
			//System.out.println(j);
			System.out.print(" ");
		}
		for (int k = 0; k < (2 * i + 1); k++) {
			//System.out.println(k);
            System.out.print("*");
		}
            System.out.println();
	}
	
	for (int l = 0; l < 5; l++) {
		System.out.println("\t  *");
	}

*/
/*
   int a,b,c;
   String s="*";
   for (a=1; a<=11; a=a+2) {
	  // System.out.print(a);
   
   for (b=11; b>=a; b=b-2) {
	   System.out.print(" ");
   }
   for(c=1; c<=a; c++) {
	   System.out.print(s);
   }
    System.out.println();
    }
    
   
	
	for(b=1;b<=4;b++)
    {
    	for(a=6;a>=1;a=a-1);{ 
    		System.out.print("      ");
    	}
    		System.out.println(s);
    }
	
	*/
	int x,y,z, noOfLines=4;
	
	for(x=1;x<=noOfLines; x++) {
		
		for(y=1;y<=noOfLines-x; y++) {
			System.out.print(" ");
		}
		for(z=1;z<=(x*2-1); z++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	for (int k=0;k<4; k++) {
		System.out.print("");
		System.out.println("   *");
		}
	}
    }



