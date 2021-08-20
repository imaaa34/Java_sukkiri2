package chapter5;

public class StrongBox<E> {
	private E box;
	private KeyType keyType;
	private long count;
	public void put(E b) { this.box = b; }
	public StrongBox(KeyType key) {
		this.keyType = key;
	}
	public E get() { 
		this.count++;
		switch(this.keyType) {
		case PADLOCK:
			if(count<1024) { return null; }
			break;
		case BUTTON:
			if(count<10000) { return null; }
			break;
		case DIAL:
			if(count<30000) { return null; }
			break;
		case FINGER:
			if(count<1000000) { return null; }
			break;
		}
		this.count = 0;
		return this.box;
	}
}
