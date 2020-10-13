public class Animal {
    public int vitesse;

    public static void main(String[] args) {
        Crocodile c = new Crocodile();
        Autruche a = new Autruche();
        ThonRouge t = new ThonRouge();

        Course.courseTerrestre(c,a);
    }
}

public class Course {
    public static void courseTerrestre(AnimalTerrestre a1, AnimalTerrestre a2) {
        if (a1.vitesseSol() > a2.vitesseSol()) {
            System.out.println("a1 gagne");
        } else {
            System.out.println("a2 gagne");
        }
    }

    public static void courseMarine(AnimalMarin a1, AnimalMarin a2) {
        if (a1.vitesseNage() > a2.vitesseNage()) {
            System.out.println("a1 gagne");
        } else {
            System.out.println("a2 gagne");
        }
    }
}

public class Chevreuil extends Animal implements AnimalTerrestre {
    public int vitesseSol() {
        return 78;
    }
}

public class Autruche extends Animal implements AnimalTerrestre {
    public int vitesseSol() {
        return 70;
    }
}

public class Orque extends Animal implements AnimalMarin {
    public int vitesseNage() {
        return 48;
    }
}

public class ThonRouge extends Animal implements AnimalMarin {
    public int vitesseNage() {
        return 74;
    }
}

public class Crocodile extends Animal implements AnimalTerrestre, AnimalMarin {
    public int vitesseNage() {
        return 25;
    }

    public int vitesseSol() {
        return 17;
    }
}

interface AnimalTerrestre {
    public int vitesseSol();
}

interface AnimalMarin {
    public int vitesseNage();
}