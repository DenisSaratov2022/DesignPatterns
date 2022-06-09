package neoflex.adapter;

public class Computer {
    public void read (IUsb iusb) {
        iusb.set();
        System.out.println("Информация считана");
    }
}
