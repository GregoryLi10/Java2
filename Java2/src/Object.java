
public class Object {
	
	
	private int age;
	private int height;
	private String name;
	
	//constructor
	public Object(int age, int height, String name) {
		this.age=age;
		this.height=height;
		this.name=name; 
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age=newAge;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String toString() {
		return "I am "+name+", I am "+age+" years old, I am "+height+" cm.";
	}
	
	public void eat(int foodAmount) {
		height+=foodAmount/10;
	}
	
	public boolean isTaller(Object other) {
		return height>other.height;
	}
	
	public static void main(String[] args) {
		Object a=new Object(0, 0, "name1");
		Object b=new Object(0, 1, "name2");
		a.eat(105);
		System.out.println(a.isTaller(b));
		System.out.println(a);
	}
}
