package chapter6;

interface Func1 {
//	public abstract boolean call(int x);
	boolean call(int x);
}

interface Func2 {
//	public abstract String call(boolean male, String name);
	String call(boolean male, String name);
}

public class Main {
	public static void main(String[] args) {
//		FuncList funclist = new FuncList();
//		Func1 f1 = FuncList::isOdd;
//		Func2 f2 = funclist::addNamePrefix;
		Func1 f1 = x -> x%2==1;
		Func2 f2 = (male, name) -> {
			if(male == true) { return "Mr." + name; }
			else { return "Ms." + name; }
		};
		System.out.println(f1.call(15));
		System.out.println(f2.call(true, "Scott"));
	}
}
