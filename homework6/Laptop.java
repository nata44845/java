public class Laptop {
    int id;
    String name;
    String brand;
    String processor;
    Integer RamGB;
    String memoryType;
    int memorySizeGB;
    int screenSize;
    OS os;
    Color color;

    public void Laptop(String name, String Brand) {
        this.name = name;
        this.brand = brand;
    }

    public Laptop(String brand, String processor,  Integer RamGB,
    String memoryType, int memorySizeGB, int screenSize, OS os, Color color) {
        this.brand = brand;
        this.processor = processor;
        this.RamGB = RamGB; 
        this.memoryType = memoryType;
        this.memorySizeGB = memorySizeGB;
        this.screenSize = screenSize;
        this.os = os;
        this.color = color;
    }

    public Laptop(String name,String brand, String processor, Integer RamGB,
    String memoryType, int memorySizeGB, int screenSize, OS os, Color color) {
        this.name = name;
        this.brand = brand;
        this.processor = processor;
        this.RamGB = RamGB; 
        this.memoryType = memoryType;
        this.memorySizeGB = memorySizeGB;
        this.screenSize = screenSize;
        this.os = os;
        this.color = color;
    }

    public Laptop(String name){
        this.name = name;
    }

    public Laptop(){

    }

    @Override
    public String toString() {
        return brand+" "+processor+" "+RamGB+" "+memoryType+" "+memorySizeGB+" "+screenSize+" "+os+" "+color;
    }
}
