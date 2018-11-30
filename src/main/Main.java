package main;

public class Main {
	
	public static void main(String[] args) {
	}
	
	public static String findFactorial(int number) {
		int i = 2;
		int originalNumber = number;
		while (number % i == 0){
			number = number / i;
			i++;
		}
		if (number == 1) {
			return originalNumber + " = " + (i - 1) + "!";
		} else {
			return "NONE";
		}
	}
	
	

}
