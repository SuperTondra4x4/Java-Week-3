package src;
public class Week3CodingAssignment {
	public static void main(String[] args) {
//
// Question 1.
//		
	double[] ages = {3,9,23,64,2,8,28,93,105}; // 105 is the test value for 1.b
	double sub = ages[(ages.length - 1)] - ages[0]; // sub is the answer for 1.a
	System.out.println(sub);
	double sum = 0;
		for (int i = 0; i<ages.length; i++){
			sum += ages[i];
		}
	double avg = sum / ages.length;
	System.out.println(avg);    // avg is the answer for 1.c
//	
// Question 2.
//	
	String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	double totalNameLength = 0;
	for (int i = 0; i<names.length; i++){
		totalNameLength += names[i].length();
	}
	double nameAVG = totalNameLength / names.length;
	System.out.println(nameAVG);   // nameAVG is the answer for 2.a
	String allNames = "";
	for (int i = 0; i<names.length; i++){
		allNames += names[i];
		if (i < (names.length - 1)) {
			allNames += " ";
		}
	}
	System.out.println(allNames); //  allNames is the answer for 2.b
//	
//	Question #3	
//	
	System.out.println(ages[(ages.length - 1)]); // prints the last value of ages[]
//
//	Question #4
//	
	System.out.println(ages[0]); // prints the first value of ages[]
//	
//	Question #5
//	
	int[] nameLengths = new int [(names.length)];
		for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length(); // nameLengths is the answer for 5
		}
//	
//	Question #6	
//		
	int nameSum = 0;
	for (int i = 0; i < nameLengths.length; i++) {	
		nameSum += nameLengths[i];
	}
	System.out.println(nameSum); // prints the sum for answer 6
//	
//	Question 7
//	
	String bulkWord = stringMultiple("word",7);
	System.out.println(bulkWord);
//	
//	Question 8
//	
	String firstName = "Bob";
	String lastName = "Ross";
	String fullName = createFullName (firstName, lastName);
//	
//	Question 9
//	
	int[] numberArray = {101,205,304,95}; // this is a test array for 9
	System.out.println(greaterThan100(numberArray));
//	
//	Question 10
//	
	double[] testArray = {1,2,3,4,5,6,7}; // testArray is a sample for the Average method
	System.out.println(average(testArray)); 
//	
// Question 11	
//	
	double[] array1 = {5,10,15}; // test array for 11
	double[] array2 = {1,3,200}; // test array for 11
	System.out.println(averageCompare(array1, array2));
//	
// Question 12	
//	
	boolean isHotOutside = false; // test boolean for 12
	double moneyInPocket = 11.50; // test amount for 12
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
//	
//	Question 13
//	
	double cashAvailable = 2500;
	double mortgage = 1000;
	double food = 250;
	double utilities = 400;
	System.out.println(solveProblem(cashAvailable, mortgage, food, utilities));
	}
	private static boolean solveProblem(double cashAvailable, double mortgage, double food, double utilities) { // this method calculates if cashAvailable is enough to support the expenses of mortgage, food and utilities
		if ((mortgage + food + utilities) < cashAvailable) {
		return true;
	}
	return false;
	}
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // method for 12
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
		}		
	private static boolean averageCompare(double[] array1, double[] array2) { // method for 11
		double avg1 = average(array1);
		double avg2 = average(array2);
		if (avg1 > avg2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private static double average(double[] testArray) { // the average method is the method for 10
		double sum = 0;
			for (int i = 0; i < testArray.length; i++) {
				sum += testArray[i];
			}
			double avg = sum / (testArray.length);
			return avg;
		
	}
	private static boolean greaterThan100(int[] numbers) { // greaterThan100 is the method for 9
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= 100) {
				return false;
			}
		}
		return true;
	}
	public static String stringMultiple (String word, int n) { // stringMultiple is the method for 7
		String multiWord = "";
		for (int i = 0; i < n; i++) {
			multiWord += word;
		}
		return multiWord;
	}
	private static String createFullName(String firstName, String lastName) {  // createFullName is the method for 8
	return firstName + " " + lastName;
	}
}
