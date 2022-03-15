public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String breed;

    public Animal(String n, int a, boolean v, String b) {
        name = n;
        age = a;
        vaccinated = v;
        breed = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public void adopt() {
        System.out.println("I have been adopted!");
    }

    public void feed() {
        System.out.println("I have been fed!");
    }

    public void sleep() {
        System.out.println("I am sleeping now.");
    }
}
