
public class NQueen {

	private Boolean isSafe(int[][] a, int i, int j) {
		for(int x=0; x< a[i].length; x++) {
			if(a[i][x]==1) {
				return false;
			}
		}
		for(int x=0; x< a.length; x++) {
			if(a[x][j]==1) {
				return false;
			}
		}
		for(int x=i, y=j; x<a.length && y<a[x].length; x++, y++) {
			if(a[x][y]==1) {
				return false;
			}
		}
		for(int x=i, y=j; x>=0 && y>=0; x--, y--) {
			if(a[x][y]==1) {
				return false;
			}
		}
		for(int x=i, y=j; x<a.length && y>=0; x++, y--) {
			if(a[x][y]==1) {
				return false;
			}
		}
		for(int x=i, y=j; x>=0 && y<a[x].length; x--, y++) {
			if(a[x][y]==1) {
				return false;
			}
		}
		return true;
	}

	public boolean nQueen(int[][] a, int r){
		if(r==a.length) {
			return true;
		}
		for (int c=0; c<a[r].length; c++) {
			if(isSafe(a, r, c)) {
				a[r][c] = 1;
				if(nQueen(a, r+1))
					return true;
				a[r][c] = 0;
				
			} 
		}
		return false;
	}
}
