package Task3;

public class Horse extends Animal {
   private String horseBreed;

 public Horse() {
 }

 public Horse(String food, String location,String horseBreed) {
  super(food, location);
  this.horseBreed=horseBreed;
 }

 public void makeNoise() {
     System.out.println("Tpruu");
    }

    public void eat() {
        System.out.println(this.getFood());
    }

    public void sleep() {
        System.out.println("sleeping at "+this.getLocation());
    }

 public String getHorseBreed() {
  return horseBreed;
 }
}
