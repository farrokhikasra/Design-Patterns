package structural.bridge;

public class Instagram implements App{
    Cellphone cellphone;

    public Instagram(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String runApp() {
        return "The app is running on:\n" + cellphone.model();
    }
}
