package chapter_jiisen_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Operation {

	public static void main(String[] args) {
		List<Human> hArray = new ArrayList<>();
		Human h1 = new Human("たかし", 10);
		Human h2 = new Human("たかし", 20);
		Human h3 = new Human("はなこ", 20);
		hArray.add(h1);
		hArray.add(h2);
		hArray.add(h3);
		// toStringのオーバライド
		for (Human h : hArray) {
			System.out.println(h);
		}

		// equalsのオーバライド
		System.out.println(h1.equals(h1));
		System.out.println(h1.equals(h2));
		System.out.println(h2.equals(h3));

		// compareToのオーバライド
		System.out.println("=== sortの確認 ====");
		Collections.sort(hArray);
		for (Human h : hArray) {
			System.out.println(h);
		}

		HashSet<Human> hset = new HashSet<>();

		hset.add(h1);
		hset.add(h2);
		hset.add(h3);
		System.out.println("=== hashsetの確認 ====");
		for (Human h : hset) {
			System.out.println(h);
		}
	}

}
