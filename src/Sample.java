public class Sample {

	void Sample() {
		System.out.println("ss");
	}
	
    public String toString() {
        return "自作したクラスです";
    }

	//	Sample(String s) {
	//		System.out.println("ss");
	//	}

	   protected enum Fruit {
	        Orange,
	        Apple,
	        Melon,
	        
	    };
	    
	public static void main(String[] args) {
		
		int num = 10;
		if(num == 100) 
			System.out.println("A");
		else if(10 < num)
			System.out.println("B");
		else
			if(num == 10)
				System.out.println("C");
			else
				System.out.println("D");
		
			if(num == 10)
					System.out.println("D");
		
//		String moji1 = "テスト";
//		String moji2 = "テスト";
//		String moji3 = new String("テスト");
//		Sample sample = new Sample();
//		System.out.println(sample);
//		
////		if(moji1 == moji2) {
////			System.out.println("代入演算子の比較は一致");
////		}
////		if(moji1 != moji3) {
////			System.out.println("new演算子の場合は別のオブジェクトのため不一致");
////		}
////		
//		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("abc");
//		list.add("def");
//		if(moji1 == "テスト") {
//			list.add(moji1);
//		}
//		for(String s : list) {
//			System.out.println(s);
//		}
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		List<String> list2 = new ArrayList<>();

	}

}
