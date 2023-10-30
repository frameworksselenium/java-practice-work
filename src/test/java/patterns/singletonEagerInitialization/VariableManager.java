package patterns.singletonEagerInitialization;

public class VariableManager {

    private static VariableManager instance = new VariableManager();
    ThreadLocal<Variable> variable = new ThreadLocal<Variable>();

    private VariableManager(){

    }

    public static VariableManager getInstance(){
        return instance;
    }

    public void setVariables(Variable variable){
        this.variable.set(variable);
    }

    public Variable getVariables(){
        return variable.get();
    }
}
