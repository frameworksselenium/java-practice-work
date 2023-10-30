package patterns.factoryWithcInterfacewithSingleton;


public class main {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getInstance().getComputer("pc","2 GB");
        Computer server = ComputerFactory.getInstance().getComputer("server","16 GB");
        System.out.println("Factory PC Config::"+ pc);
        System.out.println("Factory Server Config::"+ server);

    }

}
