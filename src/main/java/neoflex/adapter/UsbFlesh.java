package neoflex.adapter;

public class UsbFlesh implements IUsb {
    @Override
    public void set() {
        System.out.println("UsbFlesh подключен");
    }
}
