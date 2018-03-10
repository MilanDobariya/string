package string;
import java.util.*;
public class stringcont {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String user=sc.nextLine();
	
	int chr=1;
	for (int i = 0; i < user.length() - 1; i++)
	{
		if ((user.charAt(i) == ' ') && (user.charAt(i + 1) != ' '))
		{
			chr++;

		}
	}
	System.out.println(chr);
}
}
