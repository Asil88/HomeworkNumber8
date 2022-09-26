package Task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone() {
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    String reciveCall(String name) {
        return "Звонит " + name;
    }

    String reciveCall(String name, int number) {
        return "Звонит " + name;
    }

    void sendMessage(Phone... parametres) {
        for (Phone i:parametres){
            System.out.println(this.model+" Send message to"+" "+i.getModel()+" with number "+i.getNumber());
        }

    }

}
