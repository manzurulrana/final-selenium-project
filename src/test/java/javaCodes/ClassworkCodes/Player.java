package javaCodes.ClassworkCodes;

public class Player {

    String name;
    int age;
    double height;
    double weight;
    String gender;

    public void playerDetails () {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(gender);
    }

    public void walk () {
        System.out.println("Player walks");
    }

    public void run () {
        System.out.println("Player runs");
    }

    public void jump () {
        System.out.println("Player jumps");
    }
}
