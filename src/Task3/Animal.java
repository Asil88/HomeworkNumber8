package Task3;

public class Animal {
    private String food;
   private String location;
   Animal(){}

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Animal noise");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void sleep() {
       System.out.println("Animal sleep"+this.getClass());
    }


}
