package patterns.singletonThreadSafeSingleton;

public class VariableManager {

    private static VariableManager instance;
    ThreadLocal<Variable> variable = new ThreadLocal<Variable>();

    private VariableManager(){

    }

    public static synchronized VariableManager getInstance(){
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


class VariableManager1 {

    private static VariableManager1 instance;
    ThreadLocal<Variable> variable = new ThreadLocal<Variable>();

    private VariableManager1(){

    }

    public static VariableManager1 getInstance(){
        if(instance == null){
            synchronized (VariableManager1.class) {
                if(instance == null){
                    instance = new VariableManager1();
                }
            }
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