package Array;

public class ArrayInitializer {

	public static void main(String args[]) {
		int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
		System.out.println("Room\tGuests");
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			System.out.print(roomNum);
			System.out.print("\t");
			System.out.println(guests[roomNum]);
	}
	}
}
