public static class Main{

	public static void main(String[] args){ 
        Teacher teach = new Teacher();
        Student s1 = new Student();
        Student s2 = new Student();
        teach("Tess", 30, true);
        s1("Inga", 25, true);
        s2("Asker", 25, false);
        printTeacher();
	}

	public static void printTeacher(){
		System.out.println(teach);
	}
}