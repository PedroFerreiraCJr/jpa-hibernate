package br.com.dotofcodex.jpa_hibernate.model;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

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
