package patterns.factoryWithcInterfacewithSingleton;

public class ComputerFactory {
    private static ComputerFactory computerFacrotyInstance = new ComputerFactory();

    private ComputerFactory(){

    }
    public static ComputerFactory getInstance(){
        return computerFacrotyInstance;
    }
    public Computer getComputer(String type, String ram){
        if("PC".equalsIgnoreCase(type)) {
            return new PC(ram);
        }else if("Server".equalsIgnoreCase(type)) {
            return new Server(ram);
        }
        return null;
    }

}
