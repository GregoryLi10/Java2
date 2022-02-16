package ChatBot;

public class SadBot extends ChatBot {

	@Override
	public void sayHi() {
		System.out.println("hi :c");
		
	}

	@Override
	public void sayBye() {
		System.out.println("bye :c");
		
	}

	@Override
	public void startConversation(String a) {
		System.out.println("hey...");
		
	}

	@Override
	public void askFirstQuestion() {
		System.out.println("are u also sad?");
		
	}

	@Override
	public void askSecondQuestion() {
		System.out.println("i'm sad, want to stay?");
		
	}

	@Override
	public void askThirdQuestion() {
		System.out.println("okay then, do u want to leave?");
		
	}

}
