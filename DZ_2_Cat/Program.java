package DZ_2_Cat;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Vasiliy", 15);
        Cat cat3 = new Cat("Tomas", 10);
        Cat cat4 = new Cat("Felix", 17);
        Cat cat5 = new Cat("Fedot", 7);
        Cat cat6 = new Cat("Boris", 14);
        Cat cat7 = new Cat("Usatik", 11);
        Cat cat8 = new Cat("Happy", 13);
        Cat cat9 = new Cat("Leo", 14);
        Cat cat10 = new Cat("Chudik", 7);
        Plate plate = new Plate(100);
        ArrayList<Cat> hungryCats = new ArrayList<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10));
        System.out.println();
        for (Cat x : hungryCats) {
            while (!x.getSatiety()) {
                System.out.println("Котик " + x.getName() + ", голодный на " + x.getAppetite() + " подходит к тарелке");
                plate.info();
                if (x.getAppetite() > plate.getFood()) {
                    System.out.println("Котик " + x.getName() + " замечает что в тарелке мало еды и начинает мяукать, требуя доложить ему корма");
                    plate.setFood(100);
                    System.out.println("В тарелку досыпается корм, и она вновь становится полной\n");
                } else {
                    x.eat();
                    plate.setFood(plate.getFood() - x.getAppetite());
                }

            }
            System.out.println("________________");
        }
        System.out.println("После того как все коты наелись в тарелке осталось " + plate.getFood() + " единиц еды");
    }
}