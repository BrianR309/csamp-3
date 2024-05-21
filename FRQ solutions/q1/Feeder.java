public class feeder{
  private int  currentFood;

  public feeder(int f){
    currentFood = f;
  }
  public void simulateOneDay(int numBirds){
    boolean normal =  (int)(Math.random()*100+1) <= 95;
    System.out.println("noraml day");
    if(normal){
      int gramsEaten =  (int)(Math.random()* (50-10+1)+10) ;
      System.out.println("eaten" + gramsEaten);
      int totalEaten = gramsEaten * numBirds;
      System.out.println("total eaten" + totalEaten);

      if(totalEaten> currentFood) {
        currentFood = 0;
         System.out.println("food left" + currentFood);
        
      }
        else{
          currentFood -= totalEaten;
        }
    else{
    currentFood = 0;

    }

  }
  }
  public int simulateManyDays(int numBirds, int numDays){
  while(currentFood > 0 && day<= numDays){
    day++;
    simulateOneDay(numBirds);
    System.out.println();
  
  }
    return day;
  }
}
