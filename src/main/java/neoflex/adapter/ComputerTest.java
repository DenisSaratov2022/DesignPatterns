package neoflex.adapter;

public class ComputerTest {
    public static void main(String[] args) {
        UsbFlesh usbFlesh = new UsbFlesh();
        Computer computer = new Computer();
        computer.read(usbFlesh);
        System.out.println();
        MemoryCard memoryCard = new MemoryCard();
        Computer computer1 = new Computer();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);
        computer.read(usbAdapter);
    }
}
