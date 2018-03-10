package string;
import java.util.*;
public class string1 {
public static void main(String[] args) {
	String str="JavaProgramme ";
	String s1="niit for dgnext";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter word");
	String user=sc.nextLine();
	//char m[]=new char[s1.length()]
	
	/*if(user.contentEquals(s1))
		System.out.println("yes");
	else
		System.out.println("no");*/
	
	System.out.println(s1.contains(user));
	System.out.println(s1.endsWith("xt"));
	//System.out.println(str.charAt(5));
	//System.out.println(str.equalsIgnoreCase(s1));
	 
	//str.compareToIgnoreCase(s1);

//	System.out.println(str.concat(s1));
	
	
	//int i=str.compareTo(s1);
/*	if(i>0)
		System.out.println("positive");
	else if(i==0)
		System.out.println("same");
	else if(i<0)
		System.out.println("negative");
	
	*/
}
}
