package sky.pro.java.course2;

public class Hufflepuff extends Hogwarts {
    int industriousness;
    int loyalty;
    int honesty;

    public Hufflepuff(String name, int industriousness, int loyalty, int honesty, int witchcraft, int transgression) {
        super(name, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
