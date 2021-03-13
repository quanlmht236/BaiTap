package bai4;

import java.util.Scanner;

public class BangHoaDon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //xe thứ 1
        Vehicle xe1 = new Vehicle();
        System.out.print("Nhập tên chủ xe 1: ");
        xe1.setOwn(input.nextLine());
        System.out.print("Nhập loại xe: ");
        xe1.setLoai(input.nextLine());
        System.out.print("Nhập dung tích của xe: ");
        xe1.setDungTich(input.nextInt());
        System.out.print("Nhập giá xe: ");
        xe1.setPrice(input.nextFloat());
        System.out.println();
        xe1.CalTax();
        //xe2
        Vehicle xe2 = new Vehicle();input.nextLine();
        System.out.print("Nhập tên chủ xe 2 : ");
        xe2.setOwn(input.nextLine());
        System.out.print("Nhập loại xe: ");
        xe2.setLoai(input.nextLine());
        System.out.print("Nhập dung tích của xe: ");
        xe2.setDungTich(input.nextInt());
        System.out.print("Nhập giá xe: ");
        xe2.setPrice(input.nextFloat());
        System.out.println();
        xe2.CalTax();
        //xe3
        Vehicle xe3 = new Vehicle();input.nextLine();
        System.out.print("Nhập tên chủ xe 3 : ");
        xe3.setOwn(input.nextLine());
        System.out.print("Nhập loại xe: ");
        xe3.setLoai(input.nextLine());
        System.out.print("Nhập dung tích của xe: ");
        xe3.setDungTich(input.nextInt());
        System.out.print("Nhập giá xe: ");
        xe3.setPrice(input.nextFloat());
        System.out.println();
        xe3.CalTax();

        System.out.printf("%5s %25s %25s %20s %25s \n","Tên chủ xe","Loại xe","Dung tích","Trị Giá" ,"Thuế phải nộp");
        System.out.println("=============================================================================================================");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
        System.out.println("STOP!!!!!");
    }
}
