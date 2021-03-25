package bai11;

import java.time.LocalDate;
import java.util.Arrays;

public class HocVien {
    private String Hoten;
    private LocalDate NamSinh;
    private float[] Diem = new float[5];

    public HocVien() {
        this.Hoten = "chưa nhập";
        this.NamSinh = null;
    }

    public HocVien(String hoten, LocalDate namSinh, float[] diem) {
        if (!hoten.isBlank() || !hoten.isEmpty())
            Hoten = hoten;
        else Hoten = "chưa có";
        NamSinh = namSinh;
        if (diem.length == 5) {
            for (int i = 0; i <= 4; i++) {
                if (diem[i] >= 0.0 && diem[i] <= 10.0)
                    Diem[i] = diem[i];
                else Diem[i] = 0F;
            }
        }
    }

    public float CalAva() {
        float Total = 0;
        for (int i = 0; i < 5; i++) {
            Total += Diem[i];
        }
        return Total /5;
    }

    public void ThongBao() {
        boolean flag = true;;
        for (float i : Diem){
            if (i < 5) flag=false;}
            if(flag == false){
                System.out.println("Thi Lại");
                }
                else if(CalAva()<7){
                    System.out.println("Thi Tốt nghiệp");
                }
                else if(CalAva()>=7) {
                    System.out.println("Làm luận văn");
                }

    }
    public void DemNg(){

    }
}

