package kadai;

public class SuperHuman extends Human {

	private String born;
	
	public SuperHuman(String name, int age, String born) {
		super(name, age);
		this.born = born;
	}
	
	
	
	public void aisatu() {
		super.aisatu();
		System.out.println("出身地は" + this.born + "です");
	}
	
	
	
	// ルール1
	// デフォルトコンストラクタ（引数なしのコンストラクタ）
	// コンストラクタを自分でつくると、デフォルトコンストラクタは消える
	
	// ルール2（継承時のルール）
	// コンストラクタを作るときに、親のコンストラクタも呼ぶ必要がある。
	// デフォルトコンストラクタの場合は、親のデフォルトコンストラクタが呼ばれてる。
	
	
}
