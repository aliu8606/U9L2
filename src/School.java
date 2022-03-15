public class School extends Place{
    private boolean highSchool;

    public School(String a, int f, boolean h) {
        super(a, f);
        highSchool = h;
    }

    public boolean isHighSchool() {
        return highSchool;
    }

    public void goToCLass() {
        System.out.println("Are you sure this is even your school?");
    }
}
