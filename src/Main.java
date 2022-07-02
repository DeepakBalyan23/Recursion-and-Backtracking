import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		WaysInMatrix w = new WaysInMatrix();
//		int arr[][] = new int[3][3];
//		System.out.println(w.countWays(arr, 3, 3));
		
//		JosephusProblem j = new JosephusProblem();
//		System.out.println(j.getWinner(14, 2));
		
//		Palindrome p = new Palindrome();
//		System.out.println(p.isPalindrome("malayalam", 0));
		
//		PoewersetString s = new PoewersetString();
//		s.printPowerset("abc", 0,"");
		
//		Permutation pr = new Permutation();
//		pr.printPermutation("abc", 0, 2);
		
//		NQueen nq = new NQueen();
//		int n=5;
//		int [][] a = new int[n][n];
//		System.out.println(nq.nQueen(a, 0));
//		for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//                System.out.print(" "+a[i][j]+" ");
//            System.out.println();
//        }
		
		Sudoku s = new Sudoku();
		int[][] a = new int[][] {
            { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
		System.out.println(s.sudoku(a, 9));
		
		for(int i=0;i<9;i++)
	        {
	            for(int j=0;j<9;j++)
	                System.out.print(" "+a[i][j]+" ");
	            System.out.println();
	        }
	}

}
