package Array;

public class Ar {

	public static void main(String[] args) {
		try {
			int i[]= {2,3,445,6};
			System.out.println(i[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handled");
		}

	}

}
