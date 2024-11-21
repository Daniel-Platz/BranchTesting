public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Futte");
        Animal cat = new Cat("Manfred");

        dog.makeSound();
        cat.makeSound();

        dog.eat("dogfood");
        cat.eat("fish");

        dog.showMood(true);
        dog.showMood(false);

        cat.showMood(true);
        cat.showMood(false);

        System.out.println("Extra sout");





    }
}