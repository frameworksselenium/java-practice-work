package patterns.singletonStaticblockInitialization;

public class VariableManager {

    private static VariableManager instance;
    ThreadLocal<Variable> variable = new ThreadLocal<Variable>();

    private VariableManager(){

    }

    static{
        try{
            instance = new VariableManager();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
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
