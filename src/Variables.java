
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Start of my code");
         
         
         // using variables in different way.
         String showPhone;
         showPhone="313-896-8469";
         System.out.println("1. show Phone is:"+showPhone);
        
         String x;
         x="hello how do u do?";
         System.out.println("x value is:"+x);
         
         String  y="hello how do u do?";
         System.out.println("y value is:"+y);
         
         String s1="show";
         System.out.println(s1);
         
         int i1=100;
         System.out.println(i1);
         
         int a,b;
         a=10;
         b=20;
         int z;
         z=a+b;
         System.out.println("z is:"+z);
         
         int a1=10,b1=20;
         int z1;
         z1=a1+b1;
         System.out.println("z1 addition is:"+z1);
         
         z1=a1-b1;
         System.out.println("z1 substraction is:"+z1);
         
         z1=a1*b1;
         System.out.println("z1 multiplication is:"+z1);
         
         z1=a1/b1;
         System.out.println("z1 division is:"+z1);
         
         
         
        //increment 
         int i=1;
         int j=i+1;
         System.out.println("Incremental value of j is:"+j);
         
         
         
         int vAge;
         vAge=20;
         //vAge=19;
         //System.out.println(vAge + " Can not Vote");
         //vAge=22;
        // System.out.println("Can vote " + vAge);
         
        // Conditional statement
         //if else
         
         if(vAge<21) {
        	 System.out.println("Can vote");
        	 System.out.println("Hurray");
         } else {
        		 System.out.println("Can not vote");
        	     System.out.println("Sorry try next year");
         }
        	 
        	 
         int s,t;
         s=20;
         t=20;
         
        
         if(s>t) {
        	 System.out.println("s is greater.");
         }else {
        	 System.out.println("t is greater.");
         }
         
         
         if(s<t) {
        	  System.out.println(" s is smaller.");
          }else {
        	  System.out.println("t is smaller.");
          }
         
         
         if(s==t) {
       	  System.out.println(" s and t are same.");
         }else {
       	  System.out.println("s and t are different.");
         }
         
         if(s!=t) {
        	 System.out.println("s is greater.");
         }else {
        	 System.out.println("t is greater.");
         }
         
         if(s>=t) {
        	 System.out.println("s is greater.");
         }else {
        	 System.out.println("t is greater.");
         }
         
         if(s<=t) {
        	 System.out.println("s is greater.");
         }else {
        	 System.out.println("t is greater.");
         }
         
         
         
         
         
         //System.out.println("--------");
        // System.out.println("----------");
        // System.out.println("---------");
         
         for (int p=2;p<10;p=p+1) {
        	 System.out.println("value of p is:"+p);
        	 System.out.println("-------");
         }
         
         String vDay;
         vDay="Sun";
         
         if(vDay=="Mon") {
        	 System.out.println("Weekday");
         }
         if(vDay=="Tues") {
        	 System.out.println("Weekday");
         }
         if(vDay=="Wed") {
        	 System.out.println("Weekday");
         }
         if(vDay=="Thur") {
        	 System.out.println("Weekday");
         }
         if(vDay=="Fri") {
        	 System.out.println("Weekday");
         }
        
         if(vDay=="Sat") {
        	 System.out.println("Weekend");
         }
         if(vDay=="Sun") {
        	 System.out.println("Weekend");
         }
        
         
         if(vDay=="Mon" || vDay=="Tues" || vDay=="Wed" || vDay=="Thur" || vDay=="Fri"){
       
             System.out.println("Weekday");
         }
         
	     if(vDay=="Sat" || vDay=="Sun"){ 
         
	    	 System.out.println("Weekend");
         
}
        
         
         
           System.out.println("End of my code");
	}

}
