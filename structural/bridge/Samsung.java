package structural.bridge;

public class Samsung implements Cellphone {
    private String version;
    private float weight;
    private int coreNumber;

    public Samsung(String version, float weight, int coreNumber) {
        this.version = version;
        this.weight = weight;
        this.coreNumber = coreNumber;
    }

    @Override
    public String model() {
        return "Samsung{" +
                "version='" + version + '\'' +
                ", weight=" + weight +
                ", coreNumber=" + coreNumber +
                '}';
    }

}
