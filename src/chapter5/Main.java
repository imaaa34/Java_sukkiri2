package chapter5;

public class Main {
	public static void main(String[] args) {
		StrongBox<Integer> b = new StrongBox<Integer> ();
		b.put(12345);
		System.out.println(b.get());
	}
}
