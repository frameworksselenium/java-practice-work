package patterns.singletonThreadSafeSingleton;

import java.util.HashMap;

public class Variable {

    HashMap<Object, Object> var = new HashMap<>();
    public Variable(){
        System.out.println("Constructor");
    }
    public void setvar(Object key, Object value){
        var.put(key, value);
    }

    public  Object getvar(Object key){
        return var.get(key);
    }
}
