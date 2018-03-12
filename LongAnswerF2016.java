public class AlphabetSoup{
	public static int countChar(String str, char c){
		int counter = 0;
		for (int i=0; i<str.length(); i++){
			if (str.charAt(i) == c) counter++;
		}
		return counter;
	}
	
}