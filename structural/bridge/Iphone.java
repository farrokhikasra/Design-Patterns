package structural.bridge;

public class Iphone implements Cellphone {
    private String version;
    private String ram;

    public Iphone(String version, String ram) {
        this.version = version;
        this.ram = ram;
    }

    @Override
    public String model() {
        return "Iphone{" +
                "version='" + version + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
