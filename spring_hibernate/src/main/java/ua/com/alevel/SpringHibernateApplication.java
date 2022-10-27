package ua.com.alevel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.com.alevel.entity.Employee;


public class SpringHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateApplication.class, args);

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Anna", "Karenina", "IT", 231);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            int empId = employee.getId();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee getEmployee = session.get(Employee.class, empId);
            session.getTransaction().commit();
            System.out.println(getEmployee);
        } finally {
            sessionFactory.close();
        }
    }

}
