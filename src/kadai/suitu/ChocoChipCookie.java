package kadai.suitu;

public class ChocoChipCookie extends Cookie{

	private int choco;

	public int getChoco() {
		return choco;
	}

	public void setChoco(int choco) {
		this.choco = choco;
	}
	
	@Override
	public void bakingTime() {
		System.out.println("15分");
	}
	
}
