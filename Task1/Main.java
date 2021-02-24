public class Main{

	public static void main(String[] args){ 
		printString("haha");
		emptyLine();
		printSentence("Inga", 25);
	}

	public static void printString(String myString){
		System.out.println();
		System.out.println(myString);
	}

	public static void emptyLine(){
		System.out.println();
	}

	public static void printSentence(String name, int age){
		System.out.println("My name is " + name + ", I am " + age + " years old");
	}
} 