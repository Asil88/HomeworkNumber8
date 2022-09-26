package Task2;

public class TreatmentPlan extends Patient {


   public TreatmentPlan(int numberOfTreatmentPlan) {
      this.numberOfTreatmentPlan = numberOfTreatmentPlan;
   }

   public int getNumberOfTreatmentPlan() {
      return numberOfTreatmentPlan;
   }

   public void setNumberOfTreatmentPlan(int numberOfTreatmentPlan) {
      this.numberOfTreatmentPlan = numberOfTreatmentPlan;
   }
    Patient p1 = new Patient("Anton",1);
    Patient p2 = new Patient("Andrey",2);
    Patient p3 = new Patient("Artem",3);

    Doctor dentist = new Dentist();
    Doctor surgeon = new Dentist();
    Doctor therapist = new Dentist();


  public void addThreat(){
     p1.getName()+p1.numberOfTreatmentPlan
  }


}
