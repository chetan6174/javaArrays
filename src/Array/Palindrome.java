package Array;

public class Palindrome {
	public static void main(String[] args) {
		
		String m="Anna";
		m=m.toLowerCase();
		StringBuffer b=new StringBuffer(m);
		b.reverse();
		String d=b.toString();
		if(m.equals(d)) {
			System.out.println("it is palindron");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
