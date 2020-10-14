package test;

import com.pa.Person;
import com.pa.Group;
import org.junit.*;

public class TestGroup{
    Person person1 = new Person(1, "Tiago");
    Person person2 = new Person(2, "Leo");
    Person person3 = new Person(3, "Rui");

    Group group1 = new Group(person1);

    group1.addMember(person2);
    group1.addMember(person3);
}
