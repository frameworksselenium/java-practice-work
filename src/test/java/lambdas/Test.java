package lambdas;

public class Test {

    public static void main(String[] args){

        //AddNoReturnNoParms example
        AddNoReturnNoParms addNoReturnNoParms1 = ()->{System.out.println(2+3);};
        addNoReturnNoParms1.add();

        AddNoReturnNoParms addNoReturnNoParms2 = ()->System.out.println(2+5);
        addNoReturnNoParms2.add();





        AddNoReturnWithParms addNoReturnWithParms3 = (a,b)->{
            System.out.println("Add :" + (a+b));
            System.out.println("Sub :" + (a-b));
            System.out.println("Mul :" + (a*b));
                            };
        addNoReturnWithParms3.add(66,55);


        AddReturnWithParms addReturnWithParms = (a, b)->{
            System.out.println("a value is :" + a + " b value is :" + b);
            return a+b;
        };
        int val = addReturnWithParms.add(22, 22);
        System.out.println("return value :" + val);


        AddReturnWithParms addReturnWithParms1 = (a, b)->a+b;
        int val1 = addReturnWithParms1.add(44, 44);
        System.out.println("return value :" + val1);

    }


}
