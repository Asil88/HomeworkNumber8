package task2;

public class TreatmentPlan  {
   private int numberOfTreatmentPlan;

  public void addThreat(){
      this.numberOfTreatmentPlan=(int) (Math.random()*3);
  }

    public int getNumberOfTreatmentPlan(){
        return numberOfTreatmentPlan;
    }

}
