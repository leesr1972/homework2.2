package sky.pro.java.course2;

public class PrintService {
    public void printStudentOfGryffindor (Gryffindor[] gryffindors, String name) {
        System.out.println();
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor student = gryffindors[i];
            if (student.getName().equals(name)) {
                System.out.println("Факультет - Гриффиндор.");
                System.out.println("Студент " + student.toString());
                System.out.println(student.toStringGryffindor());
            }
        }
    }

    public void whoIsNoblerinGryffindor (Gryffindor[] gryffindors) {
        System.out.println();
        Gryffindor hermioneGranger = gryffindors[1];
        Gryffindor ronWeasley = gryffindors[2];
        if (hermioneGranger.getNobility() > ronWeasley.getNobility()) {
            System.out.println(hermioneGranger.getName() + " благороднее, чем " + ronWeasley.getName() + ".");
        } else {
            System.out.println(ronWeasley.getName() + " благороднее, чем " + hermioneGranger.getName() + ".");
        }
    }

    public void whoIsHarderWorkingInHufflepuff(Hufflepuff[] hufflepuffs) {
        System.out.println();
        Hufflepuff zachariahSmith = hufflepuffs[0];
        Hufflepuff cedricDiggory = hufflepuffs[1];
        if (zachariahSmith.getIndustriousness() > cedricDiggory.getIndustriousness()) {
            System.out.println(zachariahSmith.getName() + " трудолюбивее, чем " + cedricDiggory.getName() + ".");
        } else {
            System.out.println(cedricDiggory.getName() + " трудолюбивее, чем " + zachariahSmith.getName() + ".");
        }
    }

    public void whoIsMoreIntelligentInRavenclaw(Ravenclaw[] ravenclaws) {
        System.out.println();
        Ravenclaw choChang = ravenclaws[0];
        Ravenclaw padmaPatil = ravenclaws[1];
        if (choChang.getIntellect() > padmaPatil.getIntellect()) {
            System.out.println(choChang.getName() + " умнее, чем " + padmaPatil.getName() + ".");
        } else {
            System.out.println(padmaPatil.getName() + " умнее, чем " + choChang.getName() + ".");
        }
    }

    public void whoIsSmarterInSlytherin(Slytherin[] slytherins) {
        System.out.println();
        Slytherin dracoMalfoy = slytherins[0];
        Slytherin gregoryGoyle = slytherins[2];
        if (dracoMalfoy.getTrick() > gregoryGoyle.getTrick()) {
            System.out.println(dracoMalfoy.getName() + " хитрее, чем " + gregoryGoyle.getName() + ".");
        } else {
            System.out.println(gregoryGoyle.getName() + " хитрее, чем " + dracoMalfoy.getName() + ".");
        }
    }

    public void whoIsBetterInHogwarts(Gryffindor[] gryffindors, Slytherin[] slytherins) {
        System.out.println();
        Gryffindor harryPotter = gryffindors[0];
        Slytherin dracoMalfoy = slytherins[0];
        if (harryPotter.getWitchcraft() > dracoMalfoy.getWitchcraft()) {
            System.out.println(harryPotter.getName() + " обладает большей силой колдовства, чем " + dracoMalfoy.getName() + ",");
        } else {
            System.out.println(dracoMalfoy.getName() + " обладает большей силой колдовства, чем " + harryPotter.getName() + ",");
        }
        if (harryPotter.getTransgression() < dracoMalfoy.getTransgression()) {
            System.out.println("но сила трансгрессии у него слабее.");
        } else {
            System.out.println("но сила трансгрессии у него слабее.");
        }
    }
}
