package structural.bridge;

public class Test {
    public static void main(String[] args) {
        Cellphone samsung = new Samsung("S23", 125.5f, 8);
        Cellphone apple = new Iphone("SE", "1Gb");

        App instagram1 = new Instagram(samsung);
        App instagram2 = new Instagram(apple);

        System.out.println(instagram1.runApp());
        System.out.println(instagram2.runApp());

        App facebook1 = new Facebook(samsung);
        App facebook2 = new Facebook(apple);

        System.out.println(facebook1.runApp());
        System.out.println(facebook2.runApp());

    }
}
