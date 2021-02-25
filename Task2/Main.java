public class Main{

	public static void main(String[] args){ 
		printString("haha");
		emptyLine(true);
		printSentence("Inga", 25);
		sum(2, 3);
		makeAllCaps("my text here");
		isFirstLetterUpperCase("Yes");
	}

	public static void printString(String myString){
		System.out.println();
		System.out.println(myString);
	}

	public static void emptyLine(boolean happy){
		if(happy){
			System.out.println("I am happy");
		}else{
			System.out.println("I am not happy");
		}
	}

	public static void printSentence(String name, int age){
		System.out.println("My name is " + name + ", I am " + age + " years old");
	}

	public static int sum(int a, int b){
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public static String makeAllCaps(String lowerCaseToUpperCase){
		String myString = lowerCaseToUpperCase.toUpperCase();
		System.out.println(myString);
		return myString;
	}

	public static boolean isFirstLetterUpperCase(String checkText){

		char firstLetterCheck = checkText.charAt(0);
		System.out.println(Character.isUpperCase(firstLetterCheck));
		
		if(Character.isUpperCase(firstLetterCheck)){
			return true;
		}else{
			return false;
		}
	}
} 