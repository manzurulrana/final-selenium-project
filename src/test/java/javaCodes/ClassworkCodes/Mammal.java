package javaCodes.ClassworkCodes;

public class Mammal {

    int Hands = 2;
    int Legs = 2;
    String Hair = "Black";
    int wings = 2;

    public static void walks () {
        System.out.println("user walks");
    }

    public static void sleeps () {
        System.out.println("user sleeps");
    }

    public static void drink () {
        System.out.println("user drinks");
    }

    public static void eat () {
        System.out.println("user eats");
    }

    public static void showAllAttributes (int hands, int legs, String hair) {
//        int Hands = 2;
//        int Legs = 2;
//        String Hair = "Black";
//        int wings = 2;
    }


    public static void main(String[] args) {

        Mammal human = new Mammal();

        human.Hands = 2;
        human.Legs = 2;
        human.Hair = "Brown";

        Mammal octopus = new Mammal();

        octopus.Hands = 8;
        octopus.Legs = 0;
        octopus.Hair = "White";

        Mammal dog = new Mammal();

        dog.Hair = "Brown";

    }
}

