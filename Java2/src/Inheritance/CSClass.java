package Inheritance;

public class CSClass extends Class{
	private String subject;
	private int difficulty;
	private double CSSkill=0;
	
	public CSClass(Student[] students, Human teacher, int difficulty) {
		super( students, teacher);
		this.subject="Computer Science";
		this.difficulty=difficulty;
	}
	
	public CSClass(int n, Human teacher, int difficulty) {
		super(n, teacher);
		this.subject="Computer Science";
		this.difficulty=difficulty;
	}
	
	public void giveHomework() {
		System.out.println(getTeacher().getName()+" gives homework");
		String[] a= {"groan", "yay!", "noooo", "oh no", "wait what is the homework again?"};
		for (int i=0; i<getStudents().length; i++) {
			if (getStudents()[i]==null) continue;
			if (getStudents()[i].getName().equals("Gregory")) {
				System.out.println(getStudents()[i].getName()+": yay!");
				continue;
			}
			System.out.println(getStudents()[i].getName()+": "+a[(int) (Math.random()*a.length)]);
		}
	}
	
	public void changeDifficulty(int n) {
		difficulty+=n;
	}
	
	public String toString() {
		return subject+" (level "+difficulty+") \n"+super.toString();
	}
	
	@Override
	public void teach(int minutes) {
		super.teach(minutes);
		CSSkill+=(double)minutes/2;
	}
	
	public double getSkill() {
		return super.getSkill()+CSSkill;
	}
}
