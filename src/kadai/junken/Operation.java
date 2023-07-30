package kadai.junken;

public class Operation {

	public static void main(String[] args) {
		Janken j = new Janken();
		String choice = j.getMyChoice();
		j.playGame(choice);
	}
}
