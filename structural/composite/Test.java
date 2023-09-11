package structural.composite;

public class Test {
    public static void main(String[] args) {
        Equipment ram = new Equipment("DD3", 100);
        Equipment gpu = new Equipment("Nvidia", 300);
        Equipment cpu = new Equipment("M1", 200);
        Composite motherBoard = new Composite("AppleBoard");
        motherBoard.addEquipment(ram).addEquipment(cpu).addEquipment(gpu);

        System.out.println(motherBoard.getPrice());
    }
}
