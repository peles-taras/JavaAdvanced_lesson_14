package ua.lviv.lgs.hbm.xml;

import java.util.Arrays;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Application {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Item item1 = new Item(1);
		session.persist(item1);

		Item item2 = new Item(2);
		session.persist(item2);

		Item item3 = new Item(3);
		session.persist(item3);

		Item item4 = new Item(4);
		session.persist(item4);

		Cart cart = new Cart(1, "test Cart");

		cart.setItems(new HashSet<>(Arrays.asList(item1, item2, item3, item4)));

		session.persist(cart);

		transaction.commit();
		session.close();
	}

}
