package javaCodes.ClassworkCodes;

public class CarArray {
    public static void main(String[] args) {

        String[] cars = new String[5];
        cars[0] = "Chevy";
        cars[1] = "Honda";
        cars[2] = "kia";
        cars[3] = "toyota";
        cars[4] = "bmW";

        int size = cars.length;
        System.out.println("the array length is: " + size);

        boolean isEqual = cars[4].equalsIgnoreCase("bmw");
        System.out.println(isEqual);

    }
}
