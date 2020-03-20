package javaCodes.HomeworkCodes.Methods;

public class methodHomework {

    //reverse a string
    public static String reverseString(String userSentance) {

        String reverseSentance = "";

        char[] sentanceArr = userSentance.toCharArray();

        for (int i = sentanceArr.length - 1; i >= 0; i--) {

            reverseSentance = reverseSentance + sentanceArr[i];
        }
        return reverseSentance;
    }

    //reverse an Array
    public static int[] reverseIntArray(int[] userGivenArr) {

        for (int i = userGivenArr.length - 1; i >= 0; i--) {

            System.out.print(userGivenArr[i] + " ");
        }
        return userGivenArr;
    }

    //sum of integer Array
    public static int sumOfIntegerArr(int[] userGivenIntArr) {

        int givenIntArrLength = userGivenIntArr.length;

        int sum = 0;

        for (int i = 0; i < givenIntArrLength; i++) {

            sum = sum + userGivenIntArr[i];
        }
        return sum;
    }

    //average of an Array
    public static double arrAverage(int[] userGivenArr) {

        int sum = 0;
        double average = 0;
        int userArrLength = userGivenArr.length;

        for (int i = 0; i < userArrLength; i++) {

            sum = sum + userGivenArr[i];
        }
        average = sum / userArrLength;

        return average;
    }

    //String abbreviation
    public static String stringAbbreviation(String givenUserString) {

        String[] givenStringArr = givenUserString.split(" ");
        //int length = givenStringArr.length;
        String abbreviation = "";

        for (int i = 0; i < givenStringArr.length; i++) {

            abbreviation = abbreviation + givenStringArr[i].charAt(0);
        }
        return abbreviation.toUpperCase();
    }

    //sum of numbers 0 to given number
    public static int sumOfNumbers(int givenNumber) {

        int sum = 0;

        for (int i = 0; i <= givenNumber; i++) {

            sum = sum + i;
        }
        return sum;
    }

    //maximum number from array
    public static int maxNumArr (int [] userGivenArr) {

        int maxNumber = userGivenArr[0];

        for (int i = 1; i < userGivenArr.length; i++) {

            if (userGivenArr[i] > maxNumber) {

                maxNumber = userGivenArr[i];
            }
        } return maxNumber;
    }

    //minimum number from array
    public static int minNumArr (int [] userGivenArr) {

        int minNumber = userGivenArr[0];

        for (int i = 1; i < userGivenArr.length; i++) {

            if (userGivenArr[i] < minNumber) {

                minNumber = userGivenArr[i];
            }
        } return minNumber;
    }

    //celcius to kelvin converter
    public static double celciusToKelvin(double userCelcius) {

        double kelvin = userCelcius + 273.15; {

        } return kelvin;
    }

    //kelvin to fahrenheit converter
    public static double kelvinToFahrenheit (double userKelvin) {

        double fahrenheit = (userKelvin * 9/5 - 459.67); {

        } return fahrenheit;
    }

    //celcius to fahrenheit converter
    public static double celciusToFahrenheit (double userCelcius) {

        double fahrenheit = (userCelcius * 9/5 + 32); {

        } return fahrenheit;
    }

    //kelvin to celcius converter
    public static double kelvinToCelcius (double userKelvin) {

        double celcius = userKelvin - 273.15; {

        } return celcius;
    }



    //run methods in here
    public static void main(String[] args) {

        methodHomework newTest = new methodHomework();

        int[] numbers = {10, 20, 30, 4, 50};

        int result = minNumArr(numbers);
        System.out.println(result);

    }
}