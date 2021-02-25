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
		Datamatik(students, 2);
	}

	public static String Datamatik(String[] student, int i){
		System.out.println(student[i]);
	}
}