package makingAPC;

public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution();
        Dimension dimensions = new Dimension();

        resolution.setHeight(50);
        resolution.setWidth(50);
        dimensions.setHeight(200);
        dimensions.setWidth(200);
        dimensions.setDepth(100);

        Monitor monitor1 = new Monitor(resolution, 3789, "Apple");
        Case case1 = new Case("Carbon 7", "Logitech", "220 Volts", dimensions);
        MotherBoard motherBoard1 = new MotherBoard("Macbook air", "Apple", 2, 4, "IOS-bios");
        PC myComputer = new PC(monitor1, case1, motherBoard1);


        myComputer.description();
        myComputer.powerUp(case1, motherBoard1);
    }
}
