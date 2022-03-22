package sky.pro.java.course2;

public class Hogwarts {
    private final String name;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return name + ":" + '\n' + "Колдовство - " + witchcraft + ";" + '\n' + "Трансгрессия - "
                + transgression + ";";
    }
}
