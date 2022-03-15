public class Apartment extends Place{
    private boolean studio;

    public Apartment(String a, int f, boolean s) {
        super(a, f);
        studio = s;
    }

    public boolean isStudio() {
        return studio;
    }

    public void goToSleep() {
        System.out.println("Are you sure this is even your house?");
    }
}
