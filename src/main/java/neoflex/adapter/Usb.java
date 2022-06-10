package neoflex.adapter;

public class Usb implements IUsb {
    @Override
    public void set() {
        System.out.println("Usb подключен");
    }
}
