package patterns.factoryWithAbstractClass;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram){
        if("PC".equalsIgnoreCase(type)) {
            return new PC(ram);
        }else if("Server".equalsIgnoreCase(type)) {
            return new Server(ram);
        }
        return null;
    }

}
