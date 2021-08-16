package chapter2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
//		chapter02-1
//		Date now = new Date();
//		Calendar c = Calendar.getInstance();
//		c.setTime(now);
//		int d = c.get(Calendar.DAY_OF_MONTH);
//		d += 100;
//		c.set(Calendar.DAY_OF_MONTH, d);
//		Date future = c.getTime();
//		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
//		System.out.println("100日後は" + f.format(future) + "です。");
		
//		chapter02-2
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		System.out.println("100日後は" + future.format(f) + "です。");
	}
}
