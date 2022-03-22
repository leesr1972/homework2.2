package sky.pro.java.course2;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

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

    public String toString() {
        return getName() + ":" + '\n' + "Факультет - Пуффендуй;" + '\n' + "Колдовство - " + getWitchcraft()
                + ";" + '\n' + "Трансгрессия - " + getTransgression() + ";" + '\n' +"Трудолюбие - " + industriousness + ";" + '\n' +
                "Верность - " + loyalty + ";" + '\n' + "Честность - " + honesty + ".";
    }
}
