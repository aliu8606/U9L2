public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal("Bathtub", 5, false, "American");
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.isVaccinated());
        System.out.println(animal.getBreed());
        animal.adopt();
        animal.feed();
        animal.sleep();

        Cat cat = new Cat("Ketchup", 3, true, "Ragdoll", false, true);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.isVaccinated());
        System.out.println(cat.getBreed());
        System.out.println(cat.isHasPlayedWith());
        System.out.println(cat.isAllowsPetting());
        cat.adopt();
        cat.feed();
        cat.sleep();
        cat.play();
        cat.meow();

        Dog dog = new Dog("Mop", 7, true, "Pug", false, false);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.isVaccinated());
        System.out.println(dog.getBreed());
        System.out.println(dog.isHasBeenWalked());
        System.out.println(dog.isLeashed());
        dog.adopt();
        dog.feed();
        dog.sleep();
        dog.walk();
        dog.bark();
    }
}
