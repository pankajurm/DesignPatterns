package AdapterDP;


public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("Program started..");

        //AppleCharger charger = new ChargerXYZ();
        AppleCharger charger = new AdapterCharger(new DkCharger());
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargeIphone();
    }
}
