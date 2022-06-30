
public class Permutation {

	public void printPermutation(String str, int l, int r) {
		if(l==r){
			System.out.println(str);
			return;
		}
		for(int i =l; i<=r; i++) {
			str = swap(str, l, i);
			printPermutation(str, l+1, r);
			str = swap(str, i, l);
		}
	}
	
	private String swap(String str, int l, int r) {
		StringBuilder sb = new StringBuilder(str);
		char s = sb.charAt(l);
		sb.setCharAt(l, sb.charAt(r));
		sb.setCharAt(r, s);
		return sb.toString();
	}
}
