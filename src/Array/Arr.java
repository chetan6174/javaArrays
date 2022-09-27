package Array;



import java.io.IOException;
import java.util.Scanner;

public class Arr {
	public static void main(String args[]) throws IOException   {
		int guests[] = new int[10];
		Scanner sc = new Scanner("GuestList.txt");
		for(int roomNum = 0; roomNum < 10; roomNum++) {
		guests[roomNum] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Room\tGuests");
		for(int roomNum = 0; roomNum < 10; roomNum++) {
		System.out.println(roomNum);
		System.out.println("\t");
		System.out.println(guests[roomNum]);
		}
		sc.close();
	}

}
