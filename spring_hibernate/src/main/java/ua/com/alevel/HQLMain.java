package ua.com.alevel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import ua.com.alevel.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class HQLMain {

    public static void main(String[] args) {

        SpringApplication.run(SpringHibernateApplication.class, args);

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employees = new ArrayList<>();
//            employees = session.createQuery("from Employee").getResultList();

//            Employee employee = session.get(Employee.class, 2);
//            employee.setSalary(130);

            // session.createQuery("update Employee set salary = 250 where salary < 200").executeUpdate();

            session.createQuery("delete Employee where name = 'Ivan'").executeUpdate();

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
