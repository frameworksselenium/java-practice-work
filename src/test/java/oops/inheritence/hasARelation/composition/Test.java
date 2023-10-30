package oops.inheritence.hasARelation.composition;


public class Test {

    public static void main(String[] args) {

        /*Detention detension1 = new Detention("Krishna", "pencil lift","Jan 21");
        Detention detension2 = new Detention("Ram", "pen lift","Jan 21");
        Detention detension3 = new Detention("Raju", "box","Jan 21");

        DetentionList detentionList = new DetentionList();
        detentionList.addDetention(detension1);
        detentionList.addDetention(detension2);
        detentionList.addDetention(detension3);
        System.out.println(detentionList);*/



        DetentionList detentionList = new DetentionList();
        detentionList.addDetentionFromConsole();
        detentionList.addDetentionFromConsole();
        System.out.println(detentionList);

        detentionList.deleteDetention();
        System.out.println(detentionList);
    }
}
