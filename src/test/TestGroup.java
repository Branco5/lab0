package test;

import com.pa.Person;
import com.pa.Group;
import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestGroup{

    Person person1, person2, person3;
    Group group1;

    @Before
    public void setUp(){
        person1 = new Person(1, "Tiago");
        person2 = new Person(2, "Leo");
        person3 = new Person(3, "Rui");
        group1 = new Group(person1);
    }

    @Test
    public void addMember(){
        assertFalse(group1.hasMember(person2));
        group1.addMember(person2);
        assertTrue(group1.hasMember(person2));
    }



}
