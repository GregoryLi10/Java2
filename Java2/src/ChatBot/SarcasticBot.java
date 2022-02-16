package ChatBot;

public class SarcasticBot extends ChatBot{

	@Override
	public void sayHi() {
		System.out.println("hello");
		
	}

	@Override
	public void sayBye() {
		System.out.println("yeah sure bye");
		
	}

	@Override
	public void startConversation(String a) {
		System.out.println(a);
		
	}

	@Override
	public void askFirstQuestion() {
		System.out.println("sure... okay?");
		
	}

	@Override
	public void askSecondQuestion() {
		System.out.println("and..?");
		
	}

	@Override
	public void askThirdQuestion() {
		System.out.println("whatever");
		
	}

}
