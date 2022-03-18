package sky.pro.java.course2;

public class Gryffindor extends Hogwarts {
    int nobility;
    int honor;
    int bravery;

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
}
