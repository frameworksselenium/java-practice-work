package patterns.singletonThreadSafeSingleton;


public class main {

    public static void main(String[] args){

        Variable variable = new Variable();
        VariableManager.getInstance().setVariables(variable);

        VariableManager.getInstance().getVariables().setvar("Name","Krishna");
        String name = VariableManager.getInstance().getVariables().getvar("Name").toString();
        System.out.println(name);


        Variable variable1 = new Variable();
        VariableManager1.getInstance().setVariables(variable1);

        VariableManager1.getInstance().getVariables().setvar("Name","Krishna Reddy");
        String name1 = VariableManager.getInstance().getVariables().getvar("Name").toString();
        System.out.println(name1);

    }
}
