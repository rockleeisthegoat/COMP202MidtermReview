/**COMP 202 FALL 2017 MIDTERM REVIEW 
 * 
 * @author Taha Salman and Kabilan Sriranjan
 *
 */
public class MidtermReview {
	
	/**The following methods do some useful
	 * tasks that are needed for many programs
	 * GENERAL METHODS
	 **/
	
	//Method that converts any double value to negative (if it is not already)
	public static double toNegative(double num){
		if (num<0.0)
			return num;
		else
			return -1.0*num;
	}
	
	//method that finds out if an int is a multiple of another
	public static boolean multipleOf(int x, int y){
		return x%y==0;
	}
	
	//method that converts a decimal number to binary
	public static String toBinary(int num){
		String binNum = "";
		while (num>0){
			binNum = num%2 + binNum;
			num = num/2;
		}
		return binNum;
	}
	
	
	//method that converts a binary number to decimal
	public static int toDecimal(String binNum){
		int decNum = 0;
		for (int i=binNum.length()-1; i>=0; i--){
			if (binNum.charAt(i)=='1')
				decNum = decNum + (int)Math.pow(2, i);
		}
		return decNum;
	}
	
	//method that repeats a string n times
	public static String repeat(String word, int n){
		String repeatedWord = "";
		for (int i=0; i<n; i++){
			repeatedWord = repeatedWord + word;
		}
		return repeatedWord;
	}
	
	
	/**The following are useful methods for arrays (you can modify them to do more specific tasks)
	 * ARRAY METHODS
	 **/
	
	//A method that prints all array elements where array is of type int
	public static void printIntArray(int [] arr) {
		int l = arr.length;
		
		for(int i=0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//A method that prints all array elements where array is of type String
	public static void printStringArray(String [] arr) {
			int l = arr.length;
			
			for(int i=0;i<l;i++) {
				System.out.print(arr[i]+" ");
			}
		}

	//A method that sums up all of the elements in an int array
	public static int sumIntArray(int [] arr) {
		int sum=0;
		int l=arr.length;
		for(int i=0;i<l;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	//A method that returns the largest element in an int array
	public static int findMax(int[] arr) {
		int max = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	         if (arr[i] > max) 
	        	 max = arr[i];
	     }
	     return max;
	}
		
	
	//A method that prints the elements in a 2 dimensional array
	public static void print2D(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	
	//A method that adds n to each element in a 2D int array
	public static int[][] inc2D(int[][] arr, int x) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]+=x;
			}
		}
		return arr;
	}

	
	/**EXERCISES**/
	
	/*Create a method that prints the numbers from 1 till a given number (included). 
	 * If the number being printed is a multiple of 3, it prints "Fizz"
	 * If the number being printed is a multiple of 5, it prints "Buzz"
	 * If the number being printed is a multiple of both 3 and 5, it prints "FizzBuzz"
	 * SAMPLE OUTPUT: 1 2 Fizz 4 Buzz (and so on)
	 */
	public static void fizzBuzz(int n) {
		for(int i=1; i<=n;i++) {
			
			boolean div3 = i%3==0;
			boolean div5 = i%5==0;
			
			if(div3 && div5)
				System.out.println("FizzBuzz");
			else if(div3)
				System.out.println("Fizz");
			else if(div5)
				System.out.println("Buzz");
			else 
				System.out.print(i);
		}
	}
	
	/*Create a method that prints a right triangle with its tip to the right
	 * The user specifies the height
	 */
	public static void rightTriangle1(char c,int h) {
		for(int i=1; i<=h;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	/*Create a method that prints a right triangle with its tip to the left*/
	public static void rightTriangle2(char c,int h) {
		for(int i=0; i<h;i++) {
			for(int j=0;j<(h-i);j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	/*Create a method that prints a right triangle with its tip to the left with a while loop*/
	public static void rightTriangle3(char c, int h) {
		int i = 0;
		int j=0;
		while (i<h) {
			j=0;
			while(j<(h-i)) {
				System.out.print(c);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	/*Create a method that prints an isosceles triangle
	 * The user specifies the character with which to build it and its height
	 */
	public static void isosTriangle(char c, int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n-i; j++){
				System.out.print(' ');
			}
			for (int j=0; j<=2*i; j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	/*
	 * Write a method that takes an integer and returns all the prime numbers less than or equal to it
	 */
	public static void printPrimes(int n){
		for (int i=2; i<n; i++){
			boolean isPrime = true;
			for (int j=2; j<i; j++){
				if (i%j==0){
					isPrime = false;
				}
			}
			if (isPrime){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	/*Create a method that takes a start value and a range
	 * The program should generate random numbers between 1 and range keep decreasing the start value by the random numbers
	 * It should return the number of times it has to decrement the start value to get it below 0
	 */ 
	public static int randomCountdown(int start, int range){
		int counter = 0;
		while (start>0){
			start = start - (int)(Math.random()*range)+1;
			counter++;
		}
		return counter;
	}
	
	/*Create a method that takes an integer array and returns a new array of booleans
	 * For each index where the element is even, the boolean array stores true
	 * else it stores false 
	 */
	public static boolean[] evens(int[] numbers){
		boolean[] bools = new boolean[numbers.length-1];
		for (int i=0; i<numbers.length; i++){
			bools[i] = numbers[i]%2==0;
		}
		return bools;
	}
	
	/* Create a method that takes a double array, a double, and an int
	 * For each index in the array that is a multiple of the int, change the value of the element
	 * at that index to the double
	 */
	public static void writeArray(double[] nums, double newVal, int n){
		for (int i=0; i<nums.length; i+=n){
			nums[i] = newVal;
		}
	}
	
	/* Create a method that takes a 2D int array a and two integers and switches the two rows
	 * that correspond to the integers given
	 * If the integers aren't valid indices then print an error message
	 */
	public static void switchRows(int[][] arr, int i, int j){
		if (!(i<0 || j<0 || i>=arr.length || j>=arr.length)){
			int[] temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		} else {
			System.out.println("Invalid indices");
		}	
	}
	
	/*
	 * Write a method that takes a 2D integer array and returns an array with the sum of all the rows
	 */
	public static int[] sumRows(int[][] arr){
		int[] sums = new int[arr.length];
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++){
				sums[i] = sums[i]+arr[i][j];
			}
		}
		return sums;
	}
	
	public static void main(String [] args) {

	/**DATA TYPES AND DECLARING VARIABLES**/		
	//Primitive Data Types Sample Code
	int x = 10;
	char c = '&';
	double d = 100.0;
	boolean b = false;
	
	//Reference Types Sample Code
	String s = "Hi I am string";
	int [] sampleArray = new int[5];

	
	/**BOOLEANS AND DECISION MAKING**/
	//Sample Code
	System.out.println("BOOLEAN LOGIC:");
	System.out.println("");
	
	
	//checking if int number is positive or negative
	int number = 9;
    if (number > 0) {
       System.out.println("Number is positive.");
    }
    else if (number < 0) {
       System.out.println("Number is negative.");
    }
    else {
       System.out.println("Number is 0.");
    } 
    

	System.out.println("");
	
	/**LOOPS**/
    System.out.println("LOOPS:");
	System.out.println("");
	
    //printing a right triangle (check methods above for code)
    rightTriangle1('*',5); //try using for loop
    System.out.println();
	
    rightTriangle2('+',5); //try using while loop
	System.out.println();
		
    isosTriangle('#',5);
	System.out.println("");
	
	/**ARRAYS**/
	System.out.println("ARRAYS:");
	
	//Lets create an int array of 5 elements and play around
	int[] nums = {15,12,20,8,-1};
	printIntArray(nums);
	System.out.println();
	
	//What is the sum of the elements in nums?
	System.out.println(sumIntArray(nums));
	
	//What is the largest element in nums?
	System.out.println(findMax(nums));
	
	System.out.println();
    String[] marshallsFriends = {"Ted", "Lily", "Barney", "Robin"};
	String[] tedsFriends = marshallsFriends;
	tedsFriends[0]="Marshall";
	printStringArray(marshallsFriends);
	System.out.println();
	printStringArray(tedsFriends);
	System.out.println("");
	
	System.out.println();
	
	/*
	 * Let's create a 2 dimensional array that will store numbers from 1 to 100
	 * The first row will store numbers 1 to 10, the second 20 to 30 and so on
	 */
	int[][] twoDArr = new int[10][10];
	int count=1;
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			twoDArr[i][j]=count;
			count++;
		}
	}
	
	print2D(twoDArr);
	System.out.println("\n");
	
	print2D(inc2D(twoDArr,100));
	System.out.println();
	
	int[][] a = { {1,3,9}, {2,7,6,1}, {5,5,0,9,10,0,0,0}, {1}};
	printIntArray(sumRows(a));
	System.out.println();
	switchRows(a, 1, 3);
	printIntArray(sumRows(a));
	System.out.println("\n");
	
	printPrimes(50);
	System.out.println("\n");
	//Some more sample code
	
	/*Even though the code compiles, nothing is printed since both conditions evaluate to false.
	 * That is why it is good practice to have an else statement when using nested if's
	 */
	int z=5; 
	if(z>5) {
		System.out.println("z > 5");
	}
	else if(z<5) {
		System.out.println("z<5");
	}
	
	System.out.println("dogs"+3+7); //prints dogs37
	
	System.out.println("\n"); //skips a line
	
	String s1 ="Good ";
	String s2= "Luck";
	char c1='!';
	
	System.out.println(s1+s2+c1);
	}
}
