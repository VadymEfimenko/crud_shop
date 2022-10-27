package ua.com.alevel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import ua.com.alevel.one_to_one.Employee;
import ua.com.alevel.one_to_one.Details;

public class OneToOneMain {
    public static void main(String[] args) {

        SpringApplication.run(SpringHibernateApplication.class, args);

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
            sessionFactory.close();
        }

    }
}
