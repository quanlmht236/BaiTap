package bai8;
import java.util.Arrays;
import java.util.Collections;

public class KiemDuyet {
    public static void main(String[] args) {


        CD CD1 = new CD(-1,"Winter",15,20000);
        CD CD2 = new CD(123456,"Spring Mike",17,25000);
        CD CD3 = new CD(234567,"Fall",10,10000);
        CD CD4 = new CD(234567,"",10,15000);
        CD CD5 = new CD(234597,"",100,100000);


        CD1.KTCD();
        CD2.KTCD();
        CD3.KTCD();
        CD4.KTCD();
        CD5.KTCD();
        try {
            In();
            CDList tag = new CDList(4);
            tag.add(CD1);
            tag.add(CD2);
            tag.add(CD3);
            tag.add(CD4);
            tag.add(CD5);
            System.out.println(tag.toString());

            System.out.printf("Tổng số lượng CD là %d \n",tag.soLuongCD());
            System.out.printf("Tổng tiền là %s \n", tag.TotalPrice());

            tag.sortZaPrice();
            In();
            System.out.println(tag.toString());

            tag.sortAzTuaCd();
            In();
            System.out.println(tag.toString());


        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("STOP");
    }
    public static void In(){
        System.out.printf("%-15s %-30s %-37s %-35s \n","Mã CD","Tựa CD","Sô Bài Hát","Giá " );
    }
}