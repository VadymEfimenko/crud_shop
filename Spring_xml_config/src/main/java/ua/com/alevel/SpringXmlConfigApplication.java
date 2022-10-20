package ua.com.alevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringXmlConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringXmlConfigApplication.class, args);

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContextComponentScan.xml");

		Person person = context.getBean("personQ", Person.class);
		person.callPet();
		context.close();
	}

}
