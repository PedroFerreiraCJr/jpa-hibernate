package br.com.dotofcodex.jpa_hibernate;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.dotofcodex.jpa_hibernate.entity.joined.BlogPost;
import br.com.dotofcodex.jpa_hibernate.entity.joined.Book;
import br.com.dotofcodex.jpa_hibernate.entity.joined.Publication;
import br.com.dotofcodex.jpa_hibernate.jpa.PublicationJPA;
import br.com.dotofcodex.jpa_hibernate.util.PersistenceUtil;

/*
 * source of research:
 * https://thoughts-on-java.org/complete-guide-inheritance-strategies-jpa-hibernate/
 * */
public class Main {

	public static void main(String[] args) {
		EntityManager em = PersistenceUtil.getEntityManagerFactory().createEntityManager();

		PublicationJPA jpa = new PublicationJPA(em);

		// createBook(jpa);
		// createBlogPost(jpa);

		List<Publication> list = jpa.list();
		for (Publication p : list) {
			System.out.println(p);
		}

		if (list.size() > 0) {
			Publication pub = jpa.find(list.get(0).getId());
			System.out.println(pub.getTitle());
			// remove(jpa, pub);
		}

		em.clear();
		PersistenceUtil.shutdown();
		System.out.println("Done!");
	}

	public static final void createBook(PublicationJPA jpa) {
		Book book = new Book();
		book.setTitle("Titulo 01");
		book.setVersion(1);
		book.setPublish(new Date());
		book.setPages(100);
		jpa.persist(book);
	}

	public static final void createBlogPost(PublicationJPA jpa) {
		BlogPost book = new BlogPost();
		book.setTitle("Titulo 02");
		book.setVersion(1);
		book.setPublish(new Date());
		book.setUrl("https://www.sorayasa.com.br");
		jpa.persist(book);
	}

	public static final Publication find(PublicationJPA jpa, Serializable id) {
		return jpa.find(id);
	}

	public static final Publication merge(PublicationJPA jpa, Publication object) {
		return jpa.merge(object);
	}

	public static final Publication remove(PublicationJPA jpa, Publication object) {
		return jpa.remove(object);
	}

}
