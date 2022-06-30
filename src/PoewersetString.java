import java.util.List;

public class PoewersetString {

	public void printPowerset(String str, int i, String curr) {
		if(str.length()==i) {
			System.out.println(curr);
			return ;
		} 
		
		printPowerset(str, i+1, curr+str.charAt(i));
		printPowerset(str, i+1, curr);
		
	}
}
