package patterns.singletonEagerInitialization;


public class main {

    public static void main(String[] args){

        Variable variable = new Variable();
        VariableManager.getInstance().setVariables(variable);

        VariableManager.getInstance().getVariables().setvar("Name","Krishna");
        String name = VariableManager.getInstance().getVariables().getvar("Name").toString();
        System.out.println(name);

    }
}
