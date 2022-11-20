import Pressets.AbstractPlace;
import Pressets.Sentiments;
import characters.*;

public class Main {
    public static void main(String[] args) {
        AbstractPlace room = new Room("Комната");
        System.out.println();

        Snusmumrik snus = new Snusmumrik("Снусмумрик");
        snus.laugh();
        snus.takeBreath();
        System.out.println();

        Others others = new Others("Остальные");
        others.laugh();
        System.out.println();

        Hemul hemul = new Hemul("Хемуль");
        hemul.setter.setType(Sentiments.Surpsized, hemul);
        hemul.lookAround();
        System.out.println();

        Hedgehog hog = new Hedgehog("Ёж");
        hog.setter.setType(Sentiments.Ceremonial, hog);
        hog.goDown();
        System.out.println();

        Water water = new Water("Вода");
        water.pour();









    }

}