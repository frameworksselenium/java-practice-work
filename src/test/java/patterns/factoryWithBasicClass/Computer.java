package patterns.factoryWithBasicClass;

public class Computer {

    public  String getRAM(){
        return "1 GB";
    }

    @Override
    public String toString(){
        return "RAM = " + this.getRAM();
    }

}
