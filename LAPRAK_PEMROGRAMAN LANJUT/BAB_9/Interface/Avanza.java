package BAB_9.Interface;

public class Avanza implements Car, Vehicle {
    @Override
    public int getTire() {
      return 4;
    }
  
    @Override
    public void drive() {
      System.out.println("Drive avanza");
    }
  }
