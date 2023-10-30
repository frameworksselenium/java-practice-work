package generics.genericmethods;

class NonGenericClassAccount {

    public <T> void printArrayElements(T[] t){
        String nameClass = t.getClass().getName();
        for(T tt:t){
            System.out.println("Non Generic Class Name : " +nameClass + " : "  + tt);
        }
    }

}