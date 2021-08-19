package chapter4;
import java.util.Date;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	public int hashCode() {
		int result = 37;
		result = result * 31 + title.hashCode();
		result = result * 31 + publishDate.hashCode();
//		result = result * 31 + comment.hashCode(); コメントいらない
		return result;
	}
	public boolean equals(Object o) {
		if(o == this) { return true; }
		if(o == null) { return false; }
		if(!(o instanceof Book)) { return false; }
		Book b = (Book) o;
		if(!publishDate.equals(b.publishDate)) { return false; }
		if(!title.equals(b.title)) { return false; }
		return true;
	}
	public int compareTo(Book obj) {
		return this.publishDate.compareTo(obj.publishDate);
	}
	public Book clone() {
		Book r = new Book();
		r.title = this.title;
		r.comment = this.comment;
//		r.publishDate = this.publishDate;　浅いコピー
		r.publishDate = (Date) this.publishDate.clone();
		return r;
	}
}
