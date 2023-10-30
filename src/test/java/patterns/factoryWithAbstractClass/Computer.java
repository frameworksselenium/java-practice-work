package patterns.factoryWithAbstractClass;

public abstract class Computer {

    public abstract String getRAM();

    @Override
    public String toString(){
        return "RAM = " + this.getRAM();
    }

}
