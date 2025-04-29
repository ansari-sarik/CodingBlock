package lecture_19;

import java.util.Iterator;
import java.util.Scanner;

public class Rat_Chases_its_cheese {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		printpath(maze, 0, 0, ans);
		if(path == false) {
			System.out.println("NO PATH FOUND");
		}
	}
	
	static boolean path = false;

	public static void printpath(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}

		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ans[cr][cc] = 1; // last cell k liye h
			Display(ans);
			path= true;
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int [] r = {-1,0,0,-1};
		int [] c = {0,1,-1,0};
		for (int i = 0; i < c.length; i++) {
			printpath(maze, cr + r[i] , cc  + c[i], ans);
		}
//		printpath(maze, cr - 1, cc, ans);// up
//		printpath(maze, cr, cc - 1, ans);// left
//		printpath(maze, cr + 1, cc, ans);// down
//		printpath(maze, cr, cc + 1, ans);// right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
