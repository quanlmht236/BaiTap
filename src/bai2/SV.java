package bai2;

import java.util.Scanner;

public class SV {
    public static void main(String[] args) {
        TKT sv1 = new TKT();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên 1(>0): ");
        sv1.setMsv(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setHoten(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setDLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setDTH(sc.nextFloat());

        TKT sv2 = new TKT();
        System.out.println("Nhập mã sinh viên 2: ");
        sv2.setMsv(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 2: ");
        sv2.setHoten(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv2.setDLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv2.setDTH(sc.nextFloat());

        TKT sv3 = new TKT();
        System.out.println("Nhập mã sinh viên 3: ");
        sv3.setMsv(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 3: ");
        sv3.setHoten(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv3.setDLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv3.setDTH(sc.nextFloat());

        System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
    }
}
