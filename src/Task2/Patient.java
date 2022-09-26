package Task2;

public class Patient {
    private String name;
    int numberOfTreatmentPlan;

    public Patient() {
    }

    public Patient(String name,int numberOfTreatmentPlan) {
        this.name = name;
        this.numberOfTreatmentPlan=numberOfTreatmentPlan;
    }

    public String getName() {
        return name;
    }
    public int getNumberOfTreatmentPlan(){
        return numberOfTreatmentPlan;
    }

    public void setName(String name) {
        this.name = name;
    }
}
