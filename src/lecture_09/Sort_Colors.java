package lecture_09;

public class Sort_Colors {
	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		DNF(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	// white --0, red -- 1, pink 2
	public static void DNF(int[] arr) {
		int w = 0;
		int p =arr.length-1;
		int i = 0;
		while(i <= p) {
			if(arr[i] == 0) { //white
				int temp = arr[w];
				arr[w] = arr[i];
				arr[i] = temp;
				w++;
				i++;
			}else if(arr[i] == 2) {//pink
				int temp = arr[p];
				arr[p] = arr[i];
				arr[i] = temp;
				p--;
			}else {
				i++;
			}
		}
	}
}
