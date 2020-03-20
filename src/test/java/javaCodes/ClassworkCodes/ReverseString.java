package javaCodes.ClassworkCodes;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Manzurul K. Rana";
        String reversedString = "";
        char [] strArr = name.toCharArray();


        for (int i = strArr.length-1; i >= 0; i--) {

            reversedString = reversedString + strArr[i];

        }System.out.println("Your name reversed is: " + reversedString);
    }
}
