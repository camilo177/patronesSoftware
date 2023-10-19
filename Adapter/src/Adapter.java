class Usb{
    public void connectUsb(){
        System.out.println("Connected via USB");
    }
}
interface Storage{
    void connect();
}
class UsbAdapter implements Storage {
    private Usb usbDevice;

    public UsbAdapter(Usb usbDevice) {
        this.usbDevice = usbDevice;
    }

    @Override
    public void connect() {
        usbDevice.connectUsb();
    }
}



