package com.pa;

public class lab0Main {

    public static void main(String[] args) {
        Person person1 = new Person(1, "Tiago");
        Person person2 = new Person(2, "Leo");
        Person person3 = new Person(3, "Rui");
        Person person4 = new Person(4, "Bla");

        Group group1 = new Group(person1);
        //group1.addMember(person2);
        group1.addMember(person2);
        group1.addMember(person3);
        group1.addMember(person4);

        System.out.println(group1.toString());
    }
}
