package BAB_5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println("                       Data Manusia 1");
        System.out.println("=================================================================");
        Manusia manusia1 = new Manusia("Ahmad", true, "1234567890123450", true);
        System.out.println(manusia1.toString());

        System.out.println("=================================================================");
        System.out.println("                       Data Manusia 2");
        System.out.println("=================================================================");
        Manusia manusia2 = new Manusia("Sari", false, "1234567890123451", true);
        System.out.println(manusia2.toString());

        System.out.println("=================================================================");
        System.out.println("                       Data Manusia 3");
        System.out.println("=================================================================");
        Manusia manusia3 = new Manusia("Reno", true, "1234567890123452", false);
        System.out.println(manusia3.toString());

        System.out.println(" ");
        System.out.println("=================================================================");
        System.out.println("                     Data Mahasiswa FILKOM 1");
        System.out.println("=================================================================");
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("Taufani Soviana Zahro", false,"1234567890123453", false,  "225150401111010", 2.75);
        System.out.println(mhs1.toString());

        System.out.println("=================================================================");
        System.out.println("                     Data Mahasiswa FILKOM 2");
        System.out.println("=================================================================");
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("Taufani Soviana Zahro", false,"1234567890123453", false,  "225150401111010", 3.25);
        System.out.println(mhs2.toString());

        System.out.println("=================================================================");
        System.out.println("                     Data Mahasiswa FILKOM 3");
        System.out.println("=================================================================");
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("Taufani Soviana Zahro", false,"1234567890123453", false,  "225150401111010", 3.75);
        System.out.println(mhs3.toString());

        System.out.println(" ");
        System.out.println("=================================================================");
        System.out.println("                       Data Pekerja 1");
        System.out.println("=================================================================");
        Pekerja p1 = new Pekerja("Dina", false, "1234567890123456", true, 3000, LocalDate.of(2021, 1, 4), 2);
        System.out.println(p1.toString());

        System.out.println("=================================================================");
        System.out.println("                       Data Pekerja 2");
        System.out.println("=================================================================");
        Pekerja p2 = new Pekerja("Jeno", true, "1234567890123457", false, 4000, LocalDate.of(2014, 2, 5), 0);
        System.out.println(p2.toString());

        System.out.println("=================================================================");
        System.out.println("                       Data Pekerja 3");
        System.out.println("=================================================================");
        Pekerja p3 = new Pekerja("Rahayu", false, "1234567890123458", true, 6000, LocalDate.of(2003, 3, 6), 10);
        System.out.println(p3.toString());

        System.out.println(" ");
        System.out.println("=================================================================");
        System.out.println("                        Data Manager");
        System.out.println("=================================================================");
        Manager mgr = new Manager("Bambang", true, "1234567890123459", false, 7500, LocalDate.of(2008, 1, 7), 0, "HRD");
        System.out.println(mgr.toString());
    }
}