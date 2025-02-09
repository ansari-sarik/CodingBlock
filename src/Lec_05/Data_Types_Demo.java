package Lec_05;

import java.util.Scanner;

public class Data_Types_Demo {
	public static void main(String[] args) {
		byte b = (byte) (428);
		byte b1 = -5;
		short s = 8;
		int i = 9;
		long l = 2237932693l;
		System.out.println(b);
		i = b1;
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		s = sc.nextShort();
		i = sc.nextInt();
		l = sc.nextLong();
	}
}
