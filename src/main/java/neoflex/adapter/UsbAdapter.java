package neoflex.adapter;

public class UsbAdapter implements IUsb {

    private MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }


    @Override
    public void set() {
        memoryCard.set();
    }
}
