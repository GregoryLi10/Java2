
public class Classroom {

	private String className;
	private Human[] roster;
	
	public Classroom(String className, int numStudents) {
		this.className=className;
		roster=new Human[numStudents];
	}
	
	public void addStudent(String name, int age, int height, int i) {
		
		if (i>=roster.length||i<0) {
			System.out.println("out of range"); return;
		}
		roster[i]=new Human(age, height, name);
	}
	
	public void ages() {
		for (Human person:roster) {
			if (person==null) {
				System.out.println("empty");
				continue;
			}
			System.out.println(person.getAge());
		}
	}
	
	public static void main(String[] args) {
		Classroom c=new Classroom("class", 2);
		c.addStudent("condy", 0, 0, 1);
		c.ages();
	}
}
