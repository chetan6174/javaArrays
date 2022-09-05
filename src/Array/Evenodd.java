package Array;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {

	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter a number");
	    	int i=sc.nextInt();
	    	String b=(i%2==0)?"even":"odd";
	    	System.out.println(b);
	}

}
