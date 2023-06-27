package bronze;

public class Car implements Viercle {
	
	private String list = "";

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("車が走る");
		
	}
	
	protected void enging() {
		System.out.println("ニトロエンジン");
	}
	
	protected Car() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	private void access() {
		// DB
		// DB→一覧情報取る
		this.list = "";
	}
	
}
