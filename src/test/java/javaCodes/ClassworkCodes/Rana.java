package javaCodes.ClassworkCodes;

public class Rana extends Student {

    public Rana(String name, int age, int studentID, String education, String computerType) {
        super(name, age, studentID, education, computerType);
    }

    @Override
    public void attendance(int days) {
        super.attendance();
        //System.out.println(days + );
    }
}
