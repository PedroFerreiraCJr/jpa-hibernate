package br.com.dotofcodex.jpa_hibernate.jpa;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.dotofcodex.jpa_hibernate.entity.joined.Publication;

public class PublicationJPA {

	private final EntityManager em;

	public PublicationJPA(EntityManager em) {
		super();
		this.em = em;
	}

	public Publication persist(Publication object) {
		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		return object;
	}

	public Publication find(Serializable id) {
		return em.find(Publication.class, id);
	}

	public Publication merge(Publication object) {
		em.getTransaction().begin();
		Publication p = em.merge(object);
		em.getTransaction().commit();
		return p;
	}

	public Publication remove(Publication object) {
		em.getTransaction().begin();
		em.remove(object);
		em.getTransaction().commit();
		return object;
	}
	
	public List<Publication> list() {
		List<Publication> result = em.createQuery("FROM Publication", Publication.class).getResultList();
		return (result == null) ? Collections.emptyList() : result;
	}

}
