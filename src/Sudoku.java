
public class Sudoku {

	public Boolean isSafe (int arr[][], int i, int j, int num) {
		
		if(arr[i][j]!=0) {
			return false;
		}
		for (int x=0; x<arr.length; x++) {
			if(arr[x][j]==num) {
				return false;
			}
		}
		for (int x=0; x<arr[i].length; x++) {
			if(arr[i][x]==num) {
				return false;
			}
		}
		int iMin = (i/3)*3;
		int iMax = iMin+3;
		
		int jMin = (j/3)*3;
		int jMax = jMin+3;
		
		for (int x =iMin; x<iMax; x++) {
			for (int y=jMin; y<jMax; y++) {
				if(arr[x][y]==num) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Boolean sudoku(int[][] a, int n) {
		int row = -1;
		int col = -1;
		Boolean isEmpty = true;
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==0) {
					row = i;
					col=j;
					isEmpty = false;
					break;
				}
			}
			if(!isEmpty) {
				break;
			}
		}
		if(isEmpty) {
			return true;
		}
		
		for(int x=1; x<=n;x++) {
			if(isSafe(a, row, col, x)) {
				a[row][col] = x;
				if(sudoku(a, n)) {
					return true;
				} else
					a[row][col]=0;
			}
		}
		
		return false;
	}
}
