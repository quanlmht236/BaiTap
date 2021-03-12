package bai3;

public class Main {
    public static void main(String[] args) {
        TamGiac A = new TamGiac(10,10,15,"A");
        TamGiac B = new TamGiac(6,4,5,"B");
        TamGiac C = new TamGiac(6,6,6,"c");
        TamGiac D = new TamGiac(1,3,5,"D");
        TamGiac E = new TamGiac(5,5,-7,"E");
        /*A.KTL2();
        B.KTL2();
        C.KTL2();
        D.KTL2();
        E.KTL2();*/
        /*A.CheckTG();
        B.CheckTG();
        C.CheckTG();
        D.CheckTG();
        E.CheckTG();*/
/*        System.out.println(A.chuvi());
        System.out.println(A.dientich());
        System.out.println(A.toString());*/
        System.out.printf("%6s %5s %5s %5s %15s %20s %13s  \n"," tam giác","ma","mb","mc" ,"loại","chu vi","diện tích");
        A.inTG();
        B.inTG();
        C.inTG();
        D.inTG();
        E.inTG();

    }
}
