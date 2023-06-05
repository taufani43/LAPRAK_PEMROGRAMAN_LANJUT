package BAB_8;
public class App {
  public static void main(String[] args) {
    // todo...
    Owner owner1 = new Owner("Arsyad");
    Car car1 = new Car(owner1, "Toyota GR Yaris", 2022, 6500.0);
    car1.drive();
    System.out.println();

    Owner owner2 = new Owner("Ardhan");
    Car car2 = new Car(owner2, "Jeep Wrangler", 1972, 6000.0);
    car2.drive();
    System.out.println();

    Owner owner3 = new Owner("Budhi");
    Car car3 = new Car(owner3, "Mazda RX 87", 1967, 10500.0);
    car3.drive();
    System.out.println();

    Owner owner4 = new Owner("Galuh");
    Car car4 = new Car(owner4, "Mercedes Benz 220", 1958, 5500.0);
    car4.drive();
    System.out.println();
  }
}