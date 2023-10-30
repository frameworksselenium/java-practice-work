package patterns.factoryWithcInterfacewithSingleton;

public class PC implements Computer {

    private String ram;

    public PC(String ram){
        this.ram=ram;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String toString(){
        return "RAM = " + this.getRAM();
    }
}
