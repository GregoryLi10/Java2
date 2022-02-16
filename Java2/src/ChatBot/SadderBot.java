package ChatBot;

public class SadderBot extends ChatBot{

	@Override
	public void sayHi() {
		System.out.println("hi..");
		
	}

	@Override
	public void sayBye() {
		System.out.println("cya");
		
	}

	@Override
	public void startConversation(String a) {
		System.out.println("you wanna talk to me?");
		
	}

	@Override
	public void askFirstQuestion() {
		System.out.println("do you like me?");
		
	}

	@Override
	public void askSecondQuestion() {
		System.out.println("am i projecting?");
		
	}

	@Override
	public void askThirdQuestion() {
		System.out.println("can you stay?");
		
	}

}
