package structural.bridge;

public class Facebook implements App {
    Cellphone cellphone;

    public Facebook(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String runApp() {
        return "Facebook is running on\n" + cellphone.model();
    }
}
