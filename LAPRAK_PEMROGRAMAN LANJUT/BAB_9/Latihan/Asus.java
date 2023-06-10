package BAB_9.Latihan;

public class Asus implements Laptop {
    private int brightness;
    private boolean isPowerOn;
  
    Asus() {
        // set brightness awal
        this.brightness = 50;
    }
  
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Laptop menyala...");
        System.out.println("Selamat datang di ASUS");
        System.out.println("Windows 11 is running");
    }
  
    @Override
    public void shutDown() {
        isPowerOn = false;
        System.out.println("Laptop dimatikan");
    }
  
    @Override
    public void brightnessUp() {
        if (isPowerOn) {
            if (this.brightness == max_brightness) {
                System.out.println("Brightness FULL!!");
                System.out.println("sudah " + this.getBrightness() + "%");
            } else {
                this.brightness += 10;
                System.out.println("Brightness sekarang: " + this.getBrightness());
            }
        } else {
            System.out.println("Nyalakan dulu donk Laptop-nya!!");
        }
    }
  
    @Override
    public void brightnessDown() {
        if (isPowerOn) {
            if (this.brightness == min_brightness) {
                System.out.println("Brightness = 0%");
            } else {
                this.brightness -= 10;
                System.out.println("Brightness sekarang: " + this.getBrightness());
            }
        } else {
            System.out.println("Nyalakan dulu donk Laptop-nya!!");
        }
    }
  
    public int getBrightness() {
        return this.brightness;
    }
}