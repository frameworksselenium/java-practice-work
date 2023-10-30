package patterns.factoryWithcInterfacewithSingleton;

public class Server implements Computer {
    private String ram;

    public Server(String ram){
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
