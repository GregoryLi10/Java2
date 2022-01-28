import java.awt.Color;

public class Wrestler {
	private String name; 
	private double weight;
	private int wins;
	private Color outfit;
	
	public Wrestler(String name, double weight, Color outfit, int wins) {
		this.name=name; this.weight=weight; this.wins=wins; this.outfit=outfit;
	}
	
	public String intimidate() {
		String[] lines= {"something intimidating", "I'm intimidating", "another intimidating statement"};
		return name+" says "+lines[(int)(Math.random()*lines.length)];
	}
	
	public String toString() {
		return "My name is "+name+". I weigh "+weight+" units. My outfit is R:"+outfit.getRed()+", G:"+outfit.getGreen()+", B:"+outfit.getBlue()+". I have "+wins+" wins.";
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public Color getColor() {
		return outfit;
	}
	
	public void addWin() {
		wins+=1;
	}
	
	public void setColor(Color newColor) {
		outfit=newColor;
	}
	
	public String fight(Wrestler a) {
		if (weight>a.getWeight()) {
			wins++;
			return name+" wins";
		}
		else if (weight!=a.getWeight()){ 
			a.addWin();
			return a.getName()+" wins";
		}
		if (name.compareToIgnoreCase(a.getName())<0) {
			wins++;
			return name+" wins";
		}
		else {
			a.addWin();
			return a.getName()+" wins";
		}
	}
	
	public void lift(int mins) {
		weight+=(double)mins/100;
	}
	
	public String tagTeam(Wrestler[] allies, Wrestler[] opponents) {
		if (tag(allies, opponents, outfit, weight)) {
			for (int i=0; i<allies.length; i++) {
				allies[i].addWin();
			}
			wins++;
			return "team 1 (allies) win";
		}
		else {
			for (int i=0; i<opponents.length; i++) {
				opponents[i].addWin();
			}
			return "team 2 (opponents) win";
		}
	}
	
	public static boolean tag(Wrestler[] allies, Wrestler[] opponents, Color outfit, double weight) {
		int sum1=0, sum2=0;
		for (int i=0; i<allies.length; i++) {
			allies[i].setColor(outfit);
			sum1+=allies[i].getWeight();
		}
		for (int i=1; i<opponents.length; i++) {
			opponents[i].setColor(opponents[0].getColor());
			sum2+=opponents[i].getWeight();
		}
		return (sum1+weight)/(allies.length+1)>=(sum2+opponents[0].getWeight())/opponents.length;
	}
	
	public static void main(String[] args) {
		Wrestler[] allies={new Wrestler("a", 99, Color.black, 150), new Wrestler("b", 100, Color.black, 150)};
		Wrestler[] opponents={new Wrestler("c", 100, Color.white, 150), new Wrestler("d", 100, Color.black, 150), new Wrestler("e", 100, Color.black, 150)};
		
		Wrestler a=new Wrestler("wrestler a", 100, Color.black, 150);
		Wrestler b=new Wrestler("wrestler b", 100, Color.blue, 150);
		System.out.println(a.intimidate());
		System.out.println(a.fight(b));
		System.out.println(a.tagTeam(allies, opponents));
		System.out.println(a); System.out.println(b);
		for (Wrestler t: allies) {
			System.out.println(t);
		}
		for (Wrestler t: opponents) {
			System.out.println(t);
		}
		
	}
}
