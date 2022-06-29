
public class WaysInMatrix {

	public int countWays(int[][] arr,int m,int n) {
		if(m==0||n==0) {
			return 0;
		} else if(m==1 || n==1) {
			return 1;
		}
		
		return countWays(arr, m-1, n)+ countWays(arr, m, n-1);
	}
}
