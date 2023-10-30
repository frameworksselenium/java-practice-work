package generics.boundedclasses.interfaceexamples;

class Account<T extends Interest> {
    T obj;
    Account(T obj)
    {
        this.obj=obj;
    }
    public void show()
    {
        System.out.println("The type of object is :" + obj.getClass().getName());
    }
    public T getObject()
    {
        return obj;
    }
}