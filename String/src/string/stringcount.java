package string;
import java.util.*;
public class stringcount {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String user=sc.nextLine();
		int space=0,digit=0,other=0,ch=0;
		char temp;
		
		for(int i=0;i<user.length();i++)
		{
			temp=user.charAt(i);
			if(Character.isDigit(temp))
			{
				digit++;
			}
			else if(Character.isSpaceChar(temp))
			{
				space++;
			}
			else if(Character.isLetter(temp))
			{
				ch++;
			}
			else
			{
				other++;
			}
		}
		System.out.println(digit);
		System.out.println(space);
		System.out.println(ch);
		System.out.println(other);
	
	}
	}

