package br.com.dotofcodex.jpa_hibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {

	private static final String PERSISTENCE_UNIT_NAME = "local-pu";
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			synchronized (PersistenceUtil.class) {
				if (factory == null) {
					factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				}
			}

		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}

}
