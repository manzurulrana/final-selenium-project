package javaCodes.ClassworkCodes;

public class FanName {

    public static void main(String[] args) {

        FanName newTest = new FanName();

        //String result = newTest.fansName("deepak");

        fansName("deepak");

        //System.out.println(result);

    }

    public static String fansName (String givenName) {

        String message = "";

        if (givenName.equalsIgnoreCase("Deepak")) {
            message = "They like football";
        } else if (givenName.equalsIgnoreCase("Ani") || givenName.equalsIgnoreCase("rana")) {
            message = "They like Soccer";
        } else if (givenName.equalsIgnoreCase("Ferdous") || givenName.equalsIgnoreCase("Delwar") ||
                givenName.equalsIgnoreCase("Ahsan")) {
            message = "They like cricket";
        } else if (givenName.equalsIgnoreCase("Palina") || givenName.equalsIgnoreCase("Mark") ||
                givenName.equalsIgnoreCase("Mareeha") || givenName.equalsIgnoreCase("Rovshan")) {
            message = "They like Basketball";
        } else if (givenName.equalsIgnoreCase("Sumon") || givenName.equalsIgnoreCase("Himani")) {
            message = "Not a fan of any sports";
        } else {
            message = "THey are into tv shows";
        } return message;
    }
}

