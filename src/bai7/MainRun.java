package bai7;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        String ten;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập tọa độ tam o");
        System.out.println("nhập X ");
        int x = input.nextInt();
        System.out.println("nhập Y");
        int y = input.nextInt();
        /*int x = 5;
        int y = 5;*/

        Toado O = new Toado(x, y);
        System.out.println("nhap ban kinh r");
        double r = input.nextDouble();

        HinhTron Hinh1 = new HinhTron(O, r);
        Hinh1.setTam(O);
        System.out.print("hinh tron tam O(" + x + "," + y+") với bán kính " + Hinh1.getBankinh() +" và có" );
        System.out.printf(" chu vi hình tròn là %.3f ", Hinh1.CalP());
        System.out.printf(" và diện tích hình tròn là %.3f \n", Hinh1.CalS());
        /*System.out.println(Hinh1.getTam());*/
        /*System.out.println(O.toString());*/
    }


}
