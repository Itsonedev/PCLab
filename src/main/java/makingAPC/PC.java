package makingAPC;

public class PC {
    private Monitor monitor;
    private Case pcCase;
    private MotherBoard pcMotherboard;

    public PC(Monitor monitor, Case pcCase, MotherBoard pcMotherboard){
        this.monitor = monitor;
        this.pcCase = pcCase;
        this.pcMotherboard = pcMotherboard;
    }
    private void drawLogo(){
        monitor.drawPixel(10, 10, "Green");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today\n" + monitor + "\n" + pcCase + "\n" + pcMotherboard);
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                ", pcCase=" + pcCase +
                ", pcMotherboard=" + pcMotherboard +
                '}';
    }
    public void powerUp(Case pcCase, MotherBoard pcMotherboard ){
        pcCase.pressPowerButton();
        drawLogo();
        pcMotherboard.loadProgram("Photoshop");
    }

}
