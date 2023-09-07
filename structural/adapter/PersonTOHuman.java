package structural.adapter;

import java.util.Date;
import java.util.GregorianCalendar;

public class PersonTOHuman implements PersonToHumanAdapter {
    @Override
    public Human changePersonToHuman(Person person) {
        String[] fullName = person.getName().split(" ");
        int birthDate = person.getBirthDate();
        int year = birthDate / 10000;
        int month = (birthDate % 10000) / 100;
        int day = birthDate % 100;
        Date date = new GregorianCalendar(year, month, day).getTime();
        return new Human(date, fullName[0], fullName[1]);
    }
}
