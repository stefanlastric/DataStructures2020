package lab.one.maxint;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		MaxInteger maxInt = new MaxInteger();
		
		System.out.println("Reading numbers...");
	    int[] numbers = maxInt.readNumbers("C:\\Users\\Dario Susic\\eclipse-workspace\\DSLab2020\\src\\lab\\one\\maxint\\numbers.txt");
	    int maxNumber = maxInt.findMax(numbers);
	    System.out.println("Maximum number is: " + maxNumber);
	    System.out.println("Writing to file...");
	    maxInt.writeToFile("C:\\Users\\Dario Susic\\eclipse-workspace\\DSLab2020\\src\\lab\\one\\maxint\\maxNumber.txt", maxNumber);
	}

}
