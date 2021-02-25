import java.util.Arrays;

public class Main{

	public static Student[] students = new Student[10];

	public static void main(String[] args){ 

		students[0] = new Student("Inga", 25, true, true);
		students[1] = new Student("Asger", 25, false, true);
		students[2] = new Student("Anna", 22, true, true);
		students[3] = new Student("Sofie", 21, true, true);
		students[4] = new Student("Peter", 33, false, true);
		students[5] = new Student("Karen", 34, true, true);
		students[6] = new Student("Lucy", 43, true, true);
		students[7] = new Student("Hannah", 44, true, true);
		students[8] = new Student("Lisa", 19, true, true);
		students[9] = new Student("Eske", 21, false, true);
		datamatik(students, 0);
		datamatik(students, 2);
		findByName("Lisa");
		findByName("Eske");
		findByName("Inga");
	}

	public static String datamatik(Student[] student, int i){
		System.out.println();
		System.out.println(student[i].getName());
		return student[i].getName();
	}

	public static String findByName(String whichStudent){
		int placeholder = 0;
		System.out.println();
		
		for(int i = 0; i < students.length; i++){
			if(whichStudent == students[i].getName()){
				System.out.println("[" + i + "]" + students[i].getName());
				placeholder = i;
			}
		}

		String returnString = Integer.toString(placeholder);
		return returnString;
	}
}