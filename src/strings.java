
public class strings {

	public static void main(String[] args) {
		
		String s1="Hello to new world";
		int l1=s1.length();
		System.out.println("Length is"+ l1);
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		
		String[] s2=s1.split(" ");
		System.out.println(s2.length);
		for (int i=0; i<s2.length; i++) {
        System.out.println(s2[i]);
	}
      s1= s1.replace("new", "whole");
       System.out.println(s1);
}
}
