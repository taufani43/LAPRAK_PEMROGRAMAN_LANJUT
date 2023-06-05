package BAB_2;

public class Student {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private int jumlah_Objek = 0;
    public Student(){
        name = "";
        address = "";
        age = 0;
        jumlah_Objek++;
    }
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        jumlah_Objek++;
    }
    public Student(double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jumlah_Objek++;
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    private double getAverage(){
        average = (mathGrade+scienceGrade+englishGrade)/3;
        return average;
    }
    public boolean statusAkhir() {
        if (average <= 60) {
            return false;
        } else {
            return true;
        }
    }
    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        if (statusAkhir() == true) {
            System.out.println("Status akhir siswa: Lolos ");
        } else {
            System.out.println("Status akhir siswa: Remidi");
        }
    }
    public void jumlahObjek() {
        System.out.println("Jumlah objek yang telah dibuat : " + jumlah_Objek);
    }
}