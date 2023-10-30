package patterns.factoryWithAbstractClass;


public class main {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB");
        Computer server = ComputerFactory.getComputer("server","16 GB");
        System.out.println("Factory PC Config::"+ pc);
        System.out.println("Factory Server Config::"+ server);
    }

}
