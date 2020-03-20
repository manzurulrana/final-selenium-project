package javaCodes.HomeworkCodes.classes;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;

    public void setTonerLevel(int userSetTonerLevel) {
        if (userSetTonerLevel > 100) {
            System.out.println("ERROR: Invalid toner level");
        } else {
            this.tonerLevel = this.tonerLevel + userSetTonerLevel;
        }
    }

    public int getTonerLevel () {
        return this.tonerLevel;
    }

    public int getPagesPrinted () {
        return this.pagesPrinted;
    }

    public void pagesPrinted (int pagesToPrint) {

        if (pagesToPrint > 100) {
            System.out.println("ERROR: You can only print 100 pages at a time");
        } else if (this.tonerLevel-pagesToPrint < 0) {
            System.out.println("ERROR: Low toner, please add more toner");
        }
        else {
            this.tonerLevel = this.tonerLevel - pagesToPrint;
            this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        }
    }

    public void printDoubleSided (int pagesToPrint) {

        if (pagesToPrint > 50) {
            System.out.println("ERROR: You can only print 50 double sided pages at a time");
        } else if (this.tonerLevel-(pagesToPrint*2) < 0) {
            System.out.println("ERROR: Low toner, please add more toner");
        }
        else {
            this.tonerLevel = this.tonerLevel - (pagesToPrint*2);
            this.pagesPrinted = this.pagesPrinted + (pagesToPrint*2);
        }
    }

    public void printOverallPage (int numOfPages, boolean doubleSided) {

        if (doubleSided == true) {
            printDoubleSided(numOfPages);
        } else {
            pagesPrinted(numOfPages);
        }
    }

    public void overallDetails () {
        System.out.println("Toner Level: " + getTonerLevel());
        System.out.println("Pages Printed: " + getPagesPrinted());
    }
}