package BAB_2;

public class Rasional {
    private int pembilang, penyebut, i, j;
    public Rasional(){
        pembilang=0;
        penyebut=0;
        i = pembilang;
        j = penyebut;
    }
    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
        i = pembilang;
        j = penyebut;
    }
    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }
    //menyederhanakan bilangan rasional
    public void Sederhana(){
            int temp, A, B;
        if (penyebut ==0){
            return;
        }
        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;

        for (int i = 1; i <= B; i++) {
            temp = A % B;
            A = B;
            B = temp;
        }
        pembilang /=A;
        penyebut/=A;
    }
    
    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }
    //oprator >
    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
    //operator <
    public boolean lessThan(Rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    //operator <=
    public boolean lessThanOrEqual(Rasional A){
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    //operator >=
    public boolean moreThanOrEqual(Rasional A){
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }
    //operator unary += \
    public void unaryPlus(Rasional A){
        pembilang = i;
        penyebut = j;
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }
    //operator unary -= \
    public void unaryMinus(Rasional A){
        pembilang = i;
        penyebut = j;
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }
    //operator unary *= \
    public void unaryTimes(Rasional A){
        pembilang = i;
        penyebut = j;
        pembilang = pembilang * A.pembilang;
        penyebut *=A.penyebut;
    }
    //operator unary /= \
    public void unaryDivide(Rasional A){
        pembilang = i;
        penyebut = j;
        pembilang = pembilang * A.penyebut;
        penyebut *=A.pembilang;
    }

    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}