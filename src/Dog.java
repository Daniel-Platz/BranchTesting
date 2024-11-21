public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public boolean eat(String foodType) {
        System.out.println("Dog is eating " + foodType);
        return true;
    }

    @Override
    public void showMood (boolean mood) {
        if (mood) {
            System.out.println("The dog is wagging its tail");
        } else {
            System.out.println("The dog is growling");
        }
    }

    @Override
    public void jump (double distance) {
        System.out.println("Dog jumped " + distance + " meters");
    }

}