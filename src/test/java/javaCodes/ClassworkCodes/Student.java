package javaCodes.ClassworkCodes;

public abstract class Student {

    private String name;
    private int age;
    private int studentID;
    private String education;
    private String computerType;


    public Student (String name, int age, int studentID, String education,
                    String computerType) {

        char firstWord = name.toUpperCase().charAt(0);
        this.name = firstWord + name.substring(1);
        this.age = age;
        this.studentID = studentID;
        this.education = education;
        this.computerType = computerType;
    }

    public void attendance() {
        System.out.println("Student: " + name + " is present in class");
    }

    public void punctuality() {
        System.out.println("Student: " + name + " is punctual in class");
    }

    public void proactive() {
        System.out.println("Student: " + name + " is proactive in class");
    }

    public void studentDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student education: " + education);
        System.out.println("Student computer type: " + computerType);
    }

    public abstract void attendance(int days);
}
