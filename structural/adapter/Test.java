package structural.adapter;

import java.io.*;

public class Test {

    public static void main(String[] args) throws Exception {
        Person p = new Person(19951022, "Kasra Farrokhi");
        PersonTOHuman pth = new PersonTOHuman();
        Human h = pth.changePersonToHuman(p);
        System.out.println(p);
        System.out.println(h);
    }
}