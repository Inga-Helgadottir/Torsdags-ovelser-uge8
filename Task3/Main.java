public class Main{

	public static void main(String[] args){ 
        Teacher teach = new Teacher("Tess", 30, true);
        Student s1 = new Student("Inga", 25, true, true);
        Student s2 = new Student("Asger", 25, false, true);

        printTeacher(teach);
        printStudents(s1);
        printStudents(s2);
	}

	public static void printTeacher(Teacher t){
		String maleOrFemale = t.isFemale? "Female." : "Male.";

		System.out.println("Teacher:\n 	Name: " + t.name + ", Age: " + t.age + ", Gender: " + maleOrFemale);
	}

	public static void printStudents(Student s){
		String maleOrFemale = s.isFemale? "Female" : "Male";
		String isDatamatiker = s.datamatikerTeam? "Yes." : "No.";
		System.out.println("Student:\n 	Name: " + s.name + ", Age: " + s.age + ", Gender: " + maleOrFemale + ", Datamatiker: " + isDatamatiker);
	}
}