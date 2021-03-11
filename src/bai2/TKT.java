package bai2;

public class TKT {
    private int Msv;
    private String Hoten;
    private float DLT;
    private float DTH;

    public TKT(int msv, String hoten, float DLT, float DTH) {
        Msv = msv;
        Hoten = hoten;
        this.DLT = DLT;
        this.DTH = DTH;
    }

    public TKT() {
    }

    public int getMsv() {
        return Msv;
    }

    public void setMsv(int msv) {
        Msv = msv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public float getDLT() {
        return DLT;
    }

    public void setDLT(float DLT) {
        this.DLT = DLT;
    }

    public float getDTH() {
        return DTH;
    }

    public void setDTH(float DTH) {
        this.DTH = DTH;
    }
    public float avg(){
        return (DLT+DTH)/2;
    }

    public boolean doStuff(String c){
        if (c!=null){
        }
        return false;
    }
    @Override
    public String toString() {
    return   Msv+ " - " + Hoten + " diem Tb : " + avg();}
   /* }public void inSV() {
    System.out.printf("%6s %10s %20f %10s %10s \n", Msv, Hoten, DLT, DTH, avg());*/
        public void inSV()
    {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", Msv, Hoten, DLT, DTH, avg());
    }
}
