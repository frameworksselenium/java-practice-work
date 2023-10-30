package oops.inheritence.hasARelation.composition;

public class Detention {

    private String name;
    private String offence;
    private String date;

    public Detention(String name, String offence, String date) {
        this.name = name;
        this.offence = offence;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffence() {
        return offence;
    }

    public void setOffence(String offence) {
        this.offence = offence;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "name: " + name + " offence: " + offence + " date: " + date;
    }
}
