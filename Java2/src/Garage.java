
public class Garage {
	public Car[] cars;

	public Garage(int num) {
		cars=new Car[num];
	}
	
	public void addCar(int i, String name, int age, double miles) {
		cars[i]=new Car(name, age, miles);
	}
	
	public double totalWorth() {
		double sum=0;
		for (Car a:cars) {
			if (a!=null) 
			sum+=a.worth();
		}
		return sum;
	}
	
	public double averageMiles() {
		double sum=0, c=0;
		for (Car a:cars) {
			if (a!=null) {
				sum+=a.getMiles();
				c++;
			}
		}
		if (c==0) return 0;
		return sum/c;
	}
	
	public void drive(int i, double n) {
		if (cars[i]==null) return;
		cars[i].drive(n);
	}
	
	public static void main (String[] args) {
		Garage a=new Garage(3);
		a.addCar(0, "rock", 4, 200120);
		a.addCar(2, "paper", 1, 3050);
		System.out.println(a.totalWorth());
		System.out.println(a.averageMiles());
	}
}
