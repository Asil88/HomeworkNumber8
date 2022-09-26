package Task3;

public class Main {
    public static void main(String[] args) {
Animal dog =new Dog("pedegri","aviary","Ovcharka");
Animal cat=new Cat("kiti ket","kitchen","British Shorthair");
Animal horse=new Horse("oat","stable","Belgian Greyhair");
Veterenar veterenar=new Veterenar();
Animal[]animals={dog,cat,horse};
        for (Animal temp:animals) {
            veterenar.treatAnimal(temp);
        }

    }
}
