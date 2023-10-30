package patterns.singletonLazyInitialization;

public class VariableManager {

    private static VariableManager instance;
    ThreadLocal<Variable> variable = new ThreadLocal<Variable>();

    private VariableManager(){

    }

    public static VariableManager getInstance(){
        if(instance == null){
            instance = new VariableManager();
        }
        return instance;
    }

    public void setVariables(Variable variable){
        this.variable.set(variable);
    }

    public Variable getVariables(){
        return variable.get();
    }
}
