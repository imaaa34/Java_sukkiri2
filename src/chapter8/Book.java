package chapter8;
import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	public int compareTo(Book obj) {
		return CompareToBuilder.reflectionCompare(this, obj, "comment", "title");
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
