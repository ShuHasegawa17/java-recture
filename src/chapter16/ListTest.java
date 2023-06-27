package chapter16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import chapter8.Square;

public class ListTest {
	
	public static void main(String[] args) {
		
		String[] sList = new String[5];
		String s = new String("ssssss");
		s.isEmpty();
		s.length();
		
		
		
		
		List<Square> sArray = new ArrayList<>();
		
		
		sArray.add(new Square(10, 20));
		sArray.add(new Square(10, 30));
		
		Square st = new Square(20, 40);
		sArray.add(st);
		
		sArray.remove(st);
		
		for(Square sq : sArray) {
			System.out.println(sq.area());
		}
		
		
		HashSet<Square> set  = new HashSet<>();
		set.add(st);
		set.add(st);
		set.add(st);
		for(Square sq2 : set) {
			System.out.println("set" + sq2.area());
		}
		
	}

}
