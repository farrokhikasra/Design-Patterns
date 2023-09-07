package structural.adapter;

public class Test {
    public static void main(String[] args) {
        Person p = new Person(19951022, "Kasra Farrokhi");
        PersonTOHuman pth = new PersonTOHuman();
        Human h = pth.changePersonToHuman(p);
        System.out.println(p);
        System.out.println(h);
    }
}
