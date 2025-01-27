package lecture_01;

public class Lottery_Game2 {
	public static void main(String[] args) {
		int num = 77;
		if(num >=30 && num<=50) {
			System.out.println("Bike");
			if(num>=30 && num <= 40) {
				System.out.println("Splender");
			}
			else {
				System.out.println("Hero");
			}
		}
		else if(num >=100 && num <=110) {
			System.out.println("Kurkure");
			if(num>=100 && num <= 105) {
				System.out.println("Plain kurkure");
			}
			else {
				System.out.println("Red chilly kurkure");
			}
		}
		else if(num >= 321 && num <= 421) {
			System.out.println("Mac");
			if(num>=321 && num <= 389) {
				System.out.println("M1 mac");
			}
			else {
				System.out.println("M2 mac");
			}
		}
		else if(num >= 500 && num <= 721) {
			System.out.println("Car");
			if(num>=500 && num <= 600) {
				System.out.println("Verna");
			}
			else {
				System.out.println("Thar");
			}
		}
		else {
			System.out.println("Happy Birthday!");
		}
	}
}
