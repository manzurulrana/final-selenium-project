package javaCodes.HomeworkCodes.Strings;

public class Homework12_19 {
    public static void main(String[] args) {

        System.out.println("Homework 12/19 Solutions");
        System.out.println();

        //Create a string with the statement I am a good programmer.
        String myStatement = "I am a good programmer";
        System.out.println(myStatement);
        System.out.println();

        //Extract "Programmer" string from myStatement
        myStatement.substring(12);
        System.out.println("Extracting the word: " + myStatement.substring(12));
        System.out.println();

        //Display the total number of words in myStatement
        System.out.println(myStatement.length());
        System.out.println(myStatement);

        //Replace all the 'R' characters with 'f' characters.
        System.out.println(myStatement.replace('r', 'f'));
        System.out.println();

        //Store your name in a string variable.
        String myName = "Manzurul K. Rana";
        System.out.println("My name is " + myName);
        System.out.println();

        //Calculate the length of your name, without using length() method.
        int count = myName.lastIndexOf(0);
        System.out.println("Count with lastindexof: " + count);
        int charCount = myName.toCharArray().length;
        System.out.println ("Count with Char Array: " + charCount);

        int nameLength = myName.length();
        System.out.println("My name " + myName + " contains " + nameLength + " letters");
        System.out.println();

        //Verify if "JOHN" is present in index 1. --Ask instructor
        String [] names = {"Mohammed", "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
        boolean check = names[1].equalsIgnoreCase("JOHN");
        System.out.println("Is \"JOHN\" present in index 1: " + check);
        System.out.println();

        //Store first names of 5 of your friends/colleagues in an array, and display the following in console.
        String [] friends = {"Promy", "Moe", "Imran", "Himel", "Thakia"};
        System.out.println();

        //Length of that array
        int arrLength = friends.length;
        System.out.println("The array length is " + arrLength);
        System.out.println();

        //Print name written on 3rd position (hint: 2nd index)
        System.out.println(friends[2]);
        System.out.println();

        //name of each friend/colleague
        for (String xyz : friends) {
            System.out.println(xyz);
        } System.out.println();

        //Does the name of 2nd position start with an "A"
        boolean letterCheck = friends[1].startsWith("A");
        System.out.println("Does the name in the 2nd position start with an \"A\": " + letterCheck);
    }
}
