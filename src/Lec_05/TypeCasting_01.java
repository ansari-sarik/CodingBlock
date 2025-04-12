package Lec_05;

public class TypeCasting_01 {
	public static void main(String[] args) {
		byte b = 124;
		System.out.println(b);
		byte b1 = (byte)(300);
		System.out.println(b1); // this will be print 44 because literal is going out of range in byte data type so first we will do typecasting then print,
		byte b2 = (byte)(428);
		System.out.println(b2);// -84
	}
}
