package chapter10;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("c:¥pref.properties");
		Properties p = new Properties();
		p.load(fr);
		String capital = p.getProperty("aichi.capital");
		String food = p.getProperty("aichi.food");
		System.out.println(capital + ":" + food);
		fr.close();
	}
}
