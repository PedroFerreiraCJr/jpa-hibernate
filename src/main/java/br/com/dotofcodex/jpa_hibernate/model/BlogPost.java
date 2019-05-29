package br.com.dotofcodex.jpa_hibernate.model;

import java.io.Serializable;

public class BlogPost implements Serializable {

	private static final long serialVersionUID = 1L;

	private String url;

	public BlogPost() {
		super();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BlogPost [url=").append(url).append("]");
		return builder.toString();
	}

}
