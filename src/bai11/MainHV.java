package bai11;

import java.time.LocalDate;

public class MainHV {
    public static void main(String[] args) {


    float[] diem1 = {7,9,7,10,8};
    float[] diem2 = {5,5,6,7,8};
    float[] diem3 = {4,9,6,10,8};

    HocVien A = new HocVien("Ngo Minh Quân",LocalDate.of(2002,7,26),diem1);
    HocVien B = new HocVien("Cao Minh Ha",LocalDate.of(2002,8,26),diem2);
    HocVien C = new HocVien("Ha Thanh Thao ",LocalDate.of(2002,9,26),diem3);

        A.ThongBao();
        B.ThongBao();
        C.ThongBao();
}}
