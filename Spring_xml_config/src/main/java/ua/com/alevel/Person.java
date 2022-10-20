package ua.com.alevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personQ")
public class Person {

    private Pet pet;

    private String name;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("created p");
    }



    public void callPet() {
        System.out.println("Hey my Pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
