
public class Car {
	private String name;
	private int age;
	double miles;
	
	public Car(String name, int age, double miles) {
		this.name=name;
		this.age=age;
		this.miles=miles;
	}
	
	public void drive(double distance) {
		miles+=distance;
	}
	
	public double worth() {
		return Math.max(0, 1000-age*35-miles/50);
	}
	
	public double getMiles() {
		return miles;
	}
}
