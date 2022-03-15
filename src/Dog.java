public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean leashed;

    public Dog(String n, int a, boolean v, String b, boolean h, boolean l) {
        super(n, a, v, b);
        hasBeenWalked = h;
        leashed = l;
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public boolean isLeashed() {
        return leashed;
    }

    public void walk() {
        System.out.println("Walk! Walk! Walk!");
        hasBeenWalked = true;
    }

    public void bark() {
        System.out.println("Bark! Bark! Bark!");
    }
}
