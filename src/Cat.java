public class Cat extends Animal{
    private boolean hasPlayedWith;
    private boolean allowsPetting;

    public Cat(String n, int a, boolean v, String b, boolean h, boolean p) {
        super(n, a, v, b);
        hasPlayedWith = h;
        allowsPetting = p;
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean isAllowsPetting() {
        return allowsPetting;
    }

    public void play() {
        System.out.println("Mrrph.");
        hasPlayedWith = true;
    }

    public void meow() {
        System.out.println("...");
    }
}
