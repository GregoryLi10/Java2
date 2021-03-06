package DeckOfCards;
import java.util.Arrays;

public class Deck {
	private Card[] deck=new Card[52];
	public Deck() {
		String[] suits= {"clubs", "hearts", "diamonds", "spades"};
		for (int i=0; i<suits.length; i++) {
			for (int j=0; j<13; j++) {
				deck[i+j+12*i]=new Card(suits[i], j+1);
			}
		}
	}
	
	public String toString() {
		String s="";
		for (Card a:deck)
			s+=a+" ";
		return s;
	}
	
	public Card getRandom() {
		return deck[(int) (Math.random()*52)];
	}
	
	public Card[] getFirstN(int n) {
		Card[] a=new Card[Math.max(Math.min(n, 52),0)];
		for (int i=0; i<a.length; i++) {
			a[i]=deck[i];
		}
		return a;
	}
	
	public void shuffle() {
		Card[] temp=new Card[deck.length];
		for (int j=0; j<(int)(Math.random()*7)+5; j++) {
			Card[][] split=new Card[2][26];
			split[0]=Arrays.copyOfRange(deck, 0, 26);
			split[1]=Arrays.copyOfRange(deck, 26, temp.length);
			int ind1=25, ind2=25;
			for (int i=temp.length-1; i>=0; i--) {
				int c=(int)(Math.random()*2);
				if (c==0&&ind1>=0) {
					temp[i]=split[c][ind1]; ind1--;
				}
				else if (c==1&&ind2>=0){
					temp[i]=split[c][ind2]; ind2--;
				}
				else {
					i++;
				}
			}
			deck=temp;
		}
	}
	
	public void sort() {
		for (int i=0; i<deck.length; i++) {
			int k=i; int t=deck[i].getVal();
			for (int j=i+1; j<deck.length; j++) {
				if (deck[j].getVal()<t) {
					k=j;
					t=deck[j].getVal();
				}
			}
			Card temp=deck[i];
			deck[i]=deck[k];
			deck[k]=temp;
		}
	}
	
	public Card[][] deal(int n) {
		if (n<=0) return null;
		Card[][] newDeck=new Card[n][52/n];
		for (int i=0; i<newDeck.length; i++) {
			for  (int j=0; j<newDeck[i].length; j++) {
				newDeck[i][j]=deck[j+((52/n)*i)];
			}
		}
		return newDeck;
	}
	
	public Card[] bestHand(int n) {
		if (n<=0) return null;
		Card[][] dealt=deal(n); int index=0, max=0;
		for (int i=0; i<dealt[0].length; i++) {
			max+=dealt[0][i].getVal(); 
		}
		
		for (int i=0; i<dealt.length; i++) {
			int curr=0;
			for (int j=0; j<dealt[i].length; j++) {
				curr+=dealt[i][j].getVal();
			}
			if (curr>max) {
				max=curr; 
				index=i;
			}
		}
		return dealt[index];
	}
	
	public static void main (String[] args) {
		Deck a=new Deck();
		System.out.println(a);
		System.out.println(a.getRandom());
		System.out.println(Arrays.toString(a.getFirstN(3)));
		a.sort();
		System.out.println(a);
		a.shuffle();
		System.out.println(a);
		Card[][]b=a.deal(5);
		for (Card[] c:b)
			System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(a.bestHand(10)));
		
	}
	
}
