public static boolean productOfTwoPrimes(int num){
	// Check each possible prime
	for (int firstPrime=2; firstPrime<num; firstPrime++){
		// If prime is a factor
		if (num%firstPrime == 0 && isPrime(firstPrime)){ 
			// See if quotient is a prime
			int quotient = num/firstPrime;
			if (isPrime(quotient)) return true; // If yes, exit method and return true
		}
	}
	// If reached here, cannot be divided by two prime numbers
	return false;
}

public static int secondLargest secondLargest(int[] arr){
	// find the index of the largest integer
	int largest = arr[0];
	for (int i=1; i<arr.length; i++){
		if (arr[i] > largest){
			largest = arr[i];
		}
	}
	// find the second largest integer, ignoring the largest integer
	int secondLargest = Integer.MIN_VALUE;
	for (int i=0; i<arr.length; i++){
		if (arr[i] > secondLargest && arr[i] < largest){
			secondLargest = arr[i];
		}
	}
	return secondLargest;
}