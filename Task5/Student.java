public class Student{
	String name;
	int age;
	boolean isFemale;
	boolean datamatikerTeam;//--------------------------------------------

	public Student(String tmpName, int tmpAge, boolean tmpIsFemale, boolean tmpDatamatikerTeam){
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale;
		this.datamatikerTeam = tmpDatamatikerTeam;
	}

	public String getName(){
		return name;
	}

}