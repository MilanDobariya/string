package string;
import java.util.*;
public class whitespace {
public static void main(String[] args) {
	String s1="niit for for dgnext";
	String ss=s1.replaceAll("\\s", "");
	System.out.println(ss);
	System.out.println(s1.replace("for", "or"));
}
}
