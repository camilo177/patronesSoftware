public class Main{
    public static void main(String[] args) {
        //Create Samsung device
        DeviceFactory samsungFactory = new SamsungFactory();
        Phone samsungPhone = samsungFactory.createPhone();
        Computer samsungComputer = samsungFactory.createComputer();

        System.out.println("Samsung Phone: " + samsungPhone.getModel());
        System.out.println("Samsung Computer" + samsungComputer.getModel());

        //Create apple devices
        DeviceFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Computer appleComputer = appleFactory.createComputer();

        System.out.println("Apple Phone: " + applePhone.getModel());
        System.out.println("Apple Computer" + appleComputer.getModel());
    }
}


