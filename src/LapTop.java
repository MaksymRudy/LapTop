public class LapTop {
    int age = 0;
    int ram = 16;
    int ssd = 256;

    int getAge (){
        return age;
    }
    int calculateIndex() {
        return ram * 10 + ssd;
    }
    int upgradeRam(int newRam) {
       ram = ram + newRam;
        return ram;
    }

}
