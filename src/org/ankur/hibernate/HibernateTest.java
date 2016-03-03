package org.ankur.hibernate;

import org.ankur.hibernate.dto.UserDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateTest {

	public static void main(String[] args) {
		/*SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		UserDetail user = session.get(UserDetail.class, 9);
		System.out.println(user);
		session.close();
		factory.close();*/
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metaData = new MetadataSources(registry).buildMetadata();
		SessionFactory sessionFactory2 = metaData.buildSessionFactory();
		Session session2 = sessionFactory2.openSession();
		session2.beginTransaction();
		UserDetail user = session2.get(UserDetail.class, 9);
		System.out.println(user);
		session2.getTransaction().commit();
		session2.close();
	}

}
