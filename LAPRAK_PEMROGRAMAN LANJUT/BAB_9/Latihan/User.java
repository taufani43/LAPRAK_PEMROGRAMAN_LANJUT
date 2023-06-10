package BAB_9.Latihan;

public class User {
    private Laptop laptop;
  
    User(Laptop laptop) {
      this.laptop = laptop;
    }
  
    void turnOnTheLaptop(){
      this.laptop.powerOn();
    }
  
    void shutDownTheLaptop(){
        this.laptop.shutDown();
    }
  
    void makeBrightnessUp(){
        this.laptop.brightnessUp();
    }
  
    void makeBrightnessDown(){
        this.laptop.brightnessDown();
    }
}