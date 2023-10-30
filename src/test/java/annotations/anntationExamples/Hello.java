package annotations.anntationExamples;

import annotations.anntationExamples.IAnnotation;

class Hello{

    @IAnnotation(value=10)
    public void sayHello(){
        System.out.println("hello annotation");
    }

}