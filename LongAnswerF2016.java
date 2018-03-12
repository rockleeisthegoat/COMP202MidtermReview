public class LongAnswerF2016{
	public static int countChar(String str, char c){
		int counter = 0; // initialize counter
		for (int i=0; i<str.length(); i++){ // go through string
			if (str.charAt(i) == c) counter++; // increment counter
		}
		return counter; 
	}
	public static boolean haveChar(String[] strArray, char c){
		for (int i=0; i<strArray.length; i++){
			if (countChar(strArray[i], c) == 0) return false; // if any string in array does not contain char, exit function
		}
		return true;
	}
	public static String[] copySubArray(String[] strArray, int start, int end){
		int subarrayLength = end - start + 1; 
		String[] subArray = new String[subarrayLength];
		int iterator = start;
		for (int i=0; i<subarrayLength; i++){
			subArray[i] = strArray[iterator];
			iterator++;
		}
		return subArray;
	}
	public static void main(String[] args){
		if (args[0].length() != 1 || args.length < 2){
			throw new IllegalArgumentException("This program takes as input command line arguments a single char, followed by an arbitrary number of strings");
		}
		char c = args[0].charAt(0);
		String[] strArray = copySubArray(args, 1, args.length-1);
		if (haveChar(strArray, c)){
			System.out.println("The letter a is present in all of the Strings.");
		}
		else{
			System.out.println("The letter a is not present in all of the Strings.");
		}
	}
}