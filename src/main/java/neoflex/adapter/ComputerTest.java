package neoflex.adapter;

public class ComputerTest {
    public static void main(String[] args) {
        Usb usbFlesh = new Usb();
        Computer computer = new Computer();
        computer.read(usbFlesh);
        System.out.println();
        MemoryCard memoryCard = new MemoryCard();
        Computer computer1 = new Computer();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);
        computer.read(usbAdapter);
    }
}
