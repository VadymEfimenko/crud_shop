package ua.com.alevel.one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import ua.com.alevel.SpringHibernateApplication;
import ua.com.alevel.one_to_many_bi.entity.Department;
import ua.com.alevel.one_to_many_bi.entity.Employee;

public class OneToManyMain {
    public static void main(String[] args) {

        SpringApplication.run(SpringHibernateApplication.class, args);

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {

//            **************************************************************************************
//
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = new Department("HR", 1000, 5000);
//            Employee employee1 = new Employee("Vadim", "Efimenko", 1200);
//            Employee employee2 = new Employee("Ivan", "Litvinov", 1300);
//            Employee employee3 = new Employee("Olga", "Rudenko", 1200);
//            Employee employee4 = new Employee("Veneamin", "Trubachev", 1200);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//            department.addEmployeeToDepartment(employee4);
//            session.save(department);
//
//            session.getTransaction().commit();
//
//            **************************************************************************************

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 2);

            System.out.println(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
            sessionFactory.close();
        }

    }
}
