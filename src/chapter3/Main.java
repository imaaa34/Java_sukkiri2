package chapter3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> heroList = new HashMap<Hero, Integer>();
		heroList.put(h1, 3);
		heroList.put(h2, 7);
		for(Hero key: heroList.keySet()) {
			int value = heroList.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
	}
}