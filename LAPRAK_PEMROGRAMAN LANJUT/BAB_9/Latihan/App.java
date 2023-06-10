package BAB_9.Latihan;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Laptop asus = new Asus();
        User khoir = new User(asus);

        khoir.turnOnTheLaptop();

        String action;

        while (true) {
        System.out.println("=== APLIKASI INTERFACE ===");
        System.out.println("[1] Nyalakan Laptop");
        System.out.println("[2] Matikan Laptop");
        System.out.println("[3] Tambah Brightness");
        System.out.println("[4] Kurangi Brightness");
        System.out.println("[0] Keluar");
        System.out.println("--------------------------");
        System.out.print("Pilih aksi> ");
        action = input.nextLine();
        
        if(action.equalsIgnoreCase("1")){
            khoir.turnOnTheLaptop();
        } else if (action.equalsIgnoreCase("2")){
            khoir.shutDownTheLaptop();
        } else if (action.equalsIgnoreCase("3")){
            khoir.makeBrightnessUp();
        } else if (action.equalsIgnoreCase("4")){
            khoir.makeBrightnessDown();
        } else if (action.equalsIgnoreCase("0")){
            System.exit(0);
        } else {
            System.out.println("Kamu memilih aksi yang salah!");
        }
        }

    }
}