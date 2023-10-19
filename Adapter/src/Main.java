public class Main {
    public static void main(String[] args) {
        //Usb
        Usb usb = new Usb();

        //Adapter
        Storage usbAdapter = new UsbAdapter(usb);

        //Usar adaptador
        usbAdapter.connect();

    }
}
