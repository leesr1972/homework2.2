package sky.pro.java.course2;

public class Slytherin extends Hogwarts{
    int trick;
    int determination;
    int ambition;
    int resourcefulness;
    int power;

    public Slytherin(String name, int trick, int determination, int ambition, int resourcefulness, int power, int witchcraft, int transgression) {
        super(name, witchcraft, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public String toStringSlytherin() {
        return "Хитрость - " + trick + ";" + '\n' +
                " Решительность - " + determination + ";" + '\n' + "Амбициозность - " + ambition + ";" + '\n'
                + "Находчивость - " + resourcefulness + ";" + '\n' + "Жажда власти - " + power + ".";
    }
}
