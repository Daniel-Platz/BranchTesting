public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public boolean eat(String foodType) {
        System.out.println("Cat is eating " + foodType);
        return true;
    }

    @Override
    public void showMood (boolean mood) {
        if (mood) {
            System.out.println("The cat is purring");
        } else {
            System.out.println("The cat is hissing");
        }
    }

    @Override
    public void jump (double distance) {
        System.out.println("Cat jumped " + distance + " meters");
    }

}