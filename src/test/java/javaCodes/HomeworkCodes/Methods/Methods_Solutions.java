package javaCodes.HomeworkCodes.Methods;

public class Methods_Solutions {

    ///1.
    public static String getReversedString(String myWord)
    {
        myWord = myWord.toLowerCase();
        String reversedName = "";
        for (int i=myWord.length()-1; i>=0;i--)
        {
            reversedName += myWord.charAt(i);
        }
        System.out.println("Reversed name is " + reversedName);
        return reversedName;
    }
    //2.
//    public static double[] getReversedArray (double[] myArray) {
//        double[] reversedArray = new double[myArray.length];
//        for (int i= 0; i<myArray.length; i++) {
//            reversedArray[(myArray.length-1)-i] = myArray[i];
//        }
//        System.out.println("Reversed array is " + Arrays.toString(reversedArray));
//        return reversedArray;
//    }
    //3
    public static double addNumbersinArray( double[] arrayForSum)
    {
        double sum=0;
        for (int i= 0; i< arrayForSum.length; i++)
        {
            sum += arrayForSum[i];
        }
        System.out.println("The sum is " + sum);
        return sum;
    }
    // [30, 70, 40, 90]
    //4. Sort an array (ascending order)
    public static double[] sortArrayInAscendingOrder( double[] arrayToSort) {
        int n = arrayToSort.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arrayToSort[j] < arrayToSort[min])
                    min = j;
            // Swap the found minimum element with the first
            double temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[min];
            arrayToSort[min] = temp;
        }
        return arrayToSort;
    }
    //5.
    public static double findAverage(double[] arrayForAverage)
    {
        double sum=0;
        for (int i= 0; i< arrayForAverage.length; i++)
        {
            sum = sum+arrayForAverage[i];
        }
        double average = sum/arrayForAverage.length;
        System.out.println("The average is " + average);
        return average;
    }
    //6. Find maximum [3, 5,1,9]
    public static double findMaximum(double[] arrayForMaximum)
    {
        int n = arrayForMaximum.length;
        double maximum = arrayForMaximum[0];
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n; i++)
        {
            if(arrayForMaximum[i]>maximum)
            {
                maximum=arrayForMaximum[i];
            }
        }
        System.out.println("The maximum is " + maximum);
        return maximum;
    }
    //7.
    public static double findMinimum(double[] arrayForMinimum)
    {
        int n = arrayForMinimum.length;
        double minimum = arrayForMinimum[0];
        // One by one move boundary of unsorted subarray
        for (int i = 1; i < n; i++)
        {
            if(arrayForMinimum[i]<minimum)
            {
                minimum=arrayForMinimum[i];
            }
        }
        System.out.println("The minimum is " + minimum);
        return minimum;
    }
    //8.
    public static String findAbbreviation(String wordForAbbreviation)
    {
        String abbreviation = "HNY";
        String[] newArr = wordForAbbreviation.split("\\s");
        for (int i = 0; i < newArr.length; i++)
        {
            abbreviation = abbreviation + newArr[i].charAt(0);
        }
        abbreviation = abbreviation.toUpperCase();
        System.out.println("The abbreviation is " + abbreviation);
        return abbreviation;
    }
    //9.
//    public static int[] findFibonacciSeries(int startNumber, int length)
//    {
//        int[] arrayForFibonacci = new int[length];
//        arrayForFibonacci[0]=startNumber;
//        arrayForFibonacci[1]=arrayForFibonacci[0]+0;
//        for (int i=2; i<length; i++)
//        {
//            arrayForFibonacci[i] = arrayForFibonacci[i-1] + arrayForFibonacci[i-2];
//        }
//        System.out.println("The fibonacci series is " + Arrays.toString(arrayForFibonacci));
//        return arrayForFibonacci;
//    }
    public static void fibonacci(int a, int b, int n){
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n - 2; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println();
    }
    //10
    public static String findStudentWithHighestScore(double[] sMarks, String[] sNames)
    {
        int n = sMarks.length;
        double maxScore =sMarks[0];
        int maxPosition=0;
        for (int i = 1; i < n-1; i++)
        {
            if(sMarks[i]>maxScore)
            {
                maxScore=sMarks[i];
                maxPosition = i;
            }
        }
        String highestScorer = sNames[maxPosition];
        System.out.println("The highest scorer is " + highestScorer);
        return highestScorer;
    }
    //11.
    public static int findSumUpTo(int sumUpTo) {
        int sum =0;
        if (sumUpTo <0) {
            for(int i=sumUpTo; i<=0; i++) {
                sum = sum+i;
            }
            System.out.println("Sum up to " + sumUpTo + " is " + sum);
            return sum;
        } else {
            for (int i = 0; i <= sumUpTo; i++) {
                sum = sum + i;
            }
            System.out.println("Sum up to " + sumUpTo + " is " + sum);
            return sum;
        }
    }
}