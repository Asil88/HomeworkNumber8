package Task3;

public class Dog extends Animal {
    private String dogBreed;

    public Dog() {}

    public Dog(String food, String location, String dogBreed) {
        super(food, location);
        this.dogBreed = dogBreed;
    }

    public void makeNoise() {
        System.out.println("Gaf");
    }

    public void eat() {
        System.out.println(this.getFood());
    }

    public void sleep() {
        System.out.println("sleeping at "+getLocation());
    }

    public String getDogBreed() {
        return dogBreed;
    }
}
