package ua.com.alevel.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import ua.com.alevel.SpringHibernateApplication;
import ua.com.alevel.many_to_many.entity.Child;
import ua.com.alevel.many_to_many.entity.Section;

public class ManyToManyMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateApplication.class, args);

        SessionFactory sessionFactory = new Configuration().configure()
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//
//            Child child1 = new Child("Vadim", 10);
//            Child child2 = new Child("Sasha", 12);
//            Child child3 = new Child("Lena", 11);
//            Child child4 = new Child("Vika", 9);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            section1.addChildToSection(child4);
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();

//            ********************************************************************************

//            session = sessionFactory.getCurrentSession();
//
//            Section volleyball = new Section("volleyball");
//            Section basketball = new Section("basketball");
//            Section chess = new Section("chess");
//
//            Child child1 = new Child("Ivan", 11);
//            child1.addSectionToChild(volleyball);
//            child1.addSectionToChild(basketball);
//            child1.addSectionToChild(chess);
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();

//            ********************************************************************************

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Child child = session.get(Child.class, 12);
            session.delete(child);
            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
