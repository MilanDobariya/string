package string;
import java.util.*;
public class password {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("at password length is 10,and at list 2 digit");
	System.out.println("enter string");
	String user=sc.nextLine();
	char ch;
	int digit=0,other=0,space=0,letter=0;
	for(int i=0;i<user.length();i++)
	{
		ch=user.charAt(i);
		if(Character.isDigit(ch))
		{
			digit++;
		}
		else if(Character.isSpaceChar(ch))
		{
			space++;
		}
		else if(Character.isLetter(ch))
		{
			letter++;
		}
		else
			other++;
	}
	System.out.println(space);
	if(user.length()>=10 && other==1 && space==0  &&  letter>=8  && digit==2)
	{
		System.out.println("sucess your passwoed");
	}
	else
		System.out.println("please check condition and re-enter your passwoed");
}
}
