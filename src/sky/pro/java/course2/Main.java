package sky.pro.java.course2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 100, 100, 100, 90, 60),
                new Gryffindor("Гермиона Грейнджер", 80, 80, 75, 80, 65),
                new Gryffindor("Рон Уизли", 90, 75, 90, 60, 75),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 90, 80, 90, 70, 62),
                new Hufflepuff("Седрик Диггори", 80, 90, 85, 74, 88),
                new Hufflepuff("Джастин Финч-Флетчли", 85, 75, 88, 68, 86),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 98, 74, 87, 80, 77, 69),
                new Ravenclaw("Падма Патил", 81, 89, 84, 92, 63, 58),
                new Ravenclaw("Маркус Белби", 88, 78, 90, 77, 85, 95),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 96, 75, 84, 78, 99, 87, 92),
                new Slytherin("Грэхэм Монтегю", 78, 84, 83, 82, 75, 57, 77),
                new Slytherin("Грегори Гойл", 85, 88, 90, 88, 88, 88, 72),
        };

        PrintService printService = new PrintService();
        printService.printStudent(gryffindors[0]);
        printService.whoIsNoblerinGryffindor(gryffindors);
        printService.whoIsHarderWorkingInHufflepuff(hufflepuffs);
        printService.whoIsMoreIntelligentInRavenclaw(ravenclaws);
        printService.whoIsSmarterInSlytherin(slytherins);
        printService.whoIsBetterInHogwarts(gryffindors, slytherins);
    }
}
