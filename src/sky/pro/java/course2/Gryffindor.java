package sky.pro.java.course2;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int witchcraft, int transgression) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public String toStringGryffindor() {
        return getName() + ":" + '\n' + "Факультет - Гриффиндор;" + '\n' + "Колдовство - " + getWitchcraft()
                + ";" + '\n' + "Трансгрессия - " + getTransgression() + ";" + '\n' +
                "Благородство - " + nobility + ";" + '\n' + "Честь - " + honor + ";" + '\n' +
                "Храбрость - " + bravery + ".";
    }
}
