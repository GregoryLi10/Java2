package Inheritance;

public class JavaCSClass extends CSClass {
	private double javaSkill=0;

	public JavaCSClass(Student[] students, Human teacher, int difficulty) {
		super(students, teacher, difficulty);
	}

	public JavaCSClass(int n, Human teacher, int difficulty) {
		super(n, teacher, difficulty);
	}
	
	@Override
	public void teach(int minutes) {
		super.teach(minutes);
		javaSkill+=minutes;
	}
	
	public double getSkill() {
		return super.getSkill()+javaSkill;
	}
	
	public String toString() {
		return "Java "+super.toString();
	}
	
	public static void main (String[] args) {
		Student[] students={new Student(15, 15, "Gregory", 3), null, new Student(16, 7, "Anika", 4), new Student(14, 7, "Ian", 3), new Student(15, 10, "Cooper", 3)};
		Human teacher=new Human(100, 100, "Friedman");
		JavaCSClass a=new JavaCSClass(5, teacher, 3);
		System.out.println(a);
		System.out.println();
		
		a.addStudent(new Student(15,15, "Ryan", 4));
		System.out.println(a);
		System.out.println();
		
		a.giveHomework();
		a.teach(12);
		System.out.println(a.getSkill());
		System.out.println();
		
		a.removeStudent("Anika");
		System.out.println(a);
		System.out.println(a.getNumStudents());
	}
}
