package br.com.dotofcodex.jpa_hibernate.entity.single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("blogpost")
public class BlogPost extends Publication {

	private static final long serialVersionUID = 1L;

	@Column
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
