public class Computer {

    private double ram;
    private int disque;
    private String processeur;
    public Computer(double ram, int disque, String processeur) {
        this.ram = ram;
        this.disque = disque;
        this.processeur = processeur;
    }

    @Override
    public String toString() {
        return "Computer [ram=" + ram + ", disque=" + disque + ", processeur=" + processeur + "]";
    }
    public double calculerRamSlot() {
        double ramSlot = ram / 2;
        return ramSlot;
    }
}
