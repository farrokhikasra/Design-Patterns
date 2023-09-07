package structural.adapter;

public class Person {
    private String name;
    private int birthDate;

    public Person(int birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
