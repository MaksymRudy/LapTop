public class Main {
    public static void main(String[] args) {
        LapTop hp1 = new LapTop();
        LapTop hp2 = new LapTop();

        System.out.println(hp1.getAge());
        System.out.println(hp1.calculateIndex());
        System.out.println(hp2.ram);
        System.out.println(hp2.upgradeRam(16));
        System.out.println(hp2.calculateIndex());

    }

}