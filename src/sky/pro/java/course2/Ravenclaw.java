package sky.pro.java.course2;

public class Ravenclaw extends Hogwarts{
    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;

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

    public String toStringRavenclaw() {
        return "Интеллект - " + intellect + ";" + '\n' +
                "Мудрость - " + wisdom + ";" + '\n' + "Остроумие - " + wit + ";" + '\n' +
                "Креативность - " + creativity + ".";
    }
}
