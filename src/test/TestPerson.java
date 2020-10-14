package test;

import com.pa.Person;
import org.junit.*;

public class TestPerson {

    @Test
    public void testName(){
        Person p1 = new Person(1, "Joao");
        Assert.assertEquals("Joao", p1.getName());
    }




}
