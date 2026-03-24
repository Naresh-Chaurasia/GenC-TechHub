package com.dp.factory;

public class PersonCreation {

    public static void main(String[] args) {

        // Person p = PersonFactory.getPerson("m");
        // p.talk();

        PersonFactory f = new PersonFactory();
        f.getPerson("m").talk();
    }

}
