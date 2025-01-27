package lecture_01;

public class Lottery_Game1 {
	public static void main(String[] args) {
		int num = 77;
		if(num >=30 && num<=50) {
			System.out.println("Bike");
		}
		else if(num >=100 && num <=110) {
			System.out.println("Kurkure");
		}
		else if(num >= 321 && num <= 421) {
			System.out.println("Mac");
		}
		else if(num >= 500 && num <= 721) {
			System.out.println("Car");
		}
		else {
			System.out.println("Happy Birthday!");
		}
	}
}
