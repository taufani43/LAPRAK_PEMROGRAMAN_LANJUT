package BAB_2;

public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
        anna.jumlahObjek();
        
        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();
        chris.jumlahObjek();

        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
        chris.jumlahObjek();

        System.out.println("===================");
        Student tika = new Student(90, 80, 100);
        tika.setName("Tika");
        tika.setAddress("Banjarmasin");
        tika.setAge(25);
        tika.displayMessage();
        tika.jumlahObjek();

        System.out.println("===================");
        Student siska = new Student(40, 60, 55);
        siska.setName("Siska");
        siska.setAddress("Banyuwangi");
        siska.setAge(19);
        siska.displayMessage();
        siska.jumlahObjek();
    } 
}

// INI MAINSTUDENT YANG KE-2

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int sumStudent = io.nextInt();
        
        Student[] student = new Student[sumStudent];
        
        for (int i = 0; i < sumStudent; i++) {
            System.out.println("Data siswa ke " + (i + 1));
            System.out.print("Masukkan nama \t: ");
            String Name = io.next();
            System.out.print("Masukkan alamat : ");
            String Address = io.next();
            System.out.print("Masukkan usia \t: ");
            int Age = io.nextInt();
            System.out.print("Masukkan nilai matematika \t: ");
            int Mathematics = io.nextInt();
            System.out.print("Masukkan nilai bahasa Inggris \t: ");
            int English = io.nextInt();
            System.out.print("Masukkan nilai IPA \t\t: ");
            int Science = io.nextInt();
            
            student[i] = new Student();
            student[i].setName(Name);
            student[i].setAddress(Address);
            student[i].setAge(Age);
            student[i].setMath(Mathematics);
            student[i].setEnglish(English);
            student[i].setScience(Science);
        }
        io.close();

        System.out.println("===========================================");
        System.out.println("Data Seluruh Siswa:");
        for (int i = 0; i < sumStudent; i++) {
            System.out.println("Siswa ke " + (i + 1));
            student[i].displayMessage(); 
        }

        System.out.println("===========================================");
    }
}