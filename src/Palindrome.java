
public class Palindrome {

	public Boolean isPalindrome(String str, int l, int r) {
		if(l>=r) {
			return true;
		}
		if(str.charAt(l)!=str.charAt(r)) {
			return false;
		} else {
			return isPalindrome(str, l+1, r-1);
		}
	}
	
	public Boolean isPalindrome(String str, int i) {
		if(i>str.length()/2) {
			return true;
		} else{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				return false;
			return  isPalindrome(str, i+1);
		}
	}
}
