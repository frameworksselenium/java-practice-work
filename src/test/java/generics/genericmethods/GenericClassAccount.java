package generics.genericmethods;

class GenericClassAccount<T> {

    private T[] accountName;

    public GenericClassAccount(T[] accountName) {
        this.accountName = accountName;
    }

    public T[] getAccountName() {
        return accountName;
    }

    public <T> void printArrayElements(T[] t){
        String nameClass = t.getClass().getName();
        for(T tt:t){
            System.out.println("Class Name : " +nameClass + " : "  + tt);
        }
    }

}