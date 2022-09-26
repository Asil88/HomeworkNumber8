package Task3;

public class Cat extends Animal {
    private String catBreed;

    public Cat() {
    }

    public Cat(String food, String location, String catBreed) {
        super(food, location);
        this.catBreed = catBreed;
    }

    public void makeNoise() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println(this.getFood());
    }

    public void sleep() {
        System.out.println("sleeping at "+this.getLocation());
    }

    public String getCatBreed() {
        return catBreed;
    }
}
