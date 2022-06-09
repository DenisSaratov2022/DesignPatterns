package neoflex.adapter;

public class MemoryCard implements IMemoryCard{
    @Override
    public void set() {
        System.out.println("Memory card подключен");
    }
}
