package br.com.dotofcodex.jpa_hibernate.entity.table_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book extends Publication {

	private static final long serialVersionUID = 1L;

	@Column
	private Integer pages;

	public Book() {
		super();
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [pages=").append(pages).append("]");
		return builder.toString();
	}

}
