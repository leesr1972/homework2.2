package sky.pro.java.course2;

public class Ravenclaw extends Hogwarts{
    int intellect;
    int wisdom;
    int wit;
    int creativity;

    public Ravenclaw(String name, int intellect, int wisdom, int wit, int creativity, int witchcraft, int transgression) {
        super(name, witchcraft, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}
