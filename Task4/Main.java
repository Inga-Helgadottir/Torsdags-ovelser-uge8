import java.util.Arrays;
import java.util.stream.*;

public class Main{

	public static int[] intArray = {5, 9, 3, 7};
	public static String[] stringArray = {"One", "Two", "Three", "Four"};
	public static boolean booleanArray[] = {true, false, false, true};

	public static void main(String[] args){ 
        printStrings(stringArray);
        sumOfInts(intArray);
        averageInt(intArray);
        lowestToHighest(intArray);
    }

    public static String printStrings(String[] stringArray){
    	String placeHolder = "";
    	System.out.println();
    	for(int i = 0; i <= stringArray.length-1; i++){
    		System.out.println("[" + i + "]: " + stringArray[i]);
    	}
    	return placeHolder;
    }

    public static int sumOfInts(int[] intArray){
    	int sum = IntStream.of(intArray).sum();
    	System.out.println();
    	System.out.println("Sum: " + sum);
    	return sum;
    }

    public static int averageInt(int[] intArray){
    	int sum = IntStream.of(intArray).sum();
    	int average = sum / intArray.length;
    	System.out.println();
    	System.out.println("Average: " + average);
    	return average;
    }

    public static int lowestToHighest(int[] intArray){
    	int placeHolder = 0;
    	Arrays.sort(intArray);
    	System.out.println();
    	for(int i = 0; i <= intArray.length-1; i++){
    		System.out.println("[" + i + "]: " + intArray[i]);
    	}
    	return placeHolder;
    }
}