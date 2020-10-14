package test;

import com.pa.Person;
import org.junit.*;

public class TestPerson {

    Person p1 = new Person(1, "Joao");

    @Test
    public void testName(){
        Assert.assertEquals("Joao", p1.getName());
    }




}
