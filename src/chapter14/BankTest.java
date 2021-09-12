package chapter14;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	// 名前をセットできるか
	@Test public void setName() {
		Bank b = new Bank();
		b.setName("みなと銀行");
	}
	@Test public void setNameWithNull() {
		try {
			Bank b = new Bank();
			b.setName(null);
		} catch (NullPointerException e) {
			return;
		}
		fail();
	}
	@Test public void throwsExceptionWithTwoCharName() {
		try {
			Bank b = new Bank();
			b.setName("みな");
		} catch (IllegalArgumentException e) {
			return;
		}
		fail();
	}
	@Test (expected = IllegalArgumentException.class)
	public void two() {
		Bank b = new Bank();
		b.setName("みな");
	}
}
