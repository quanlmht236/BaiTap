package bai5;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        try {
            HangThucPham SP01 = new HangThucPham("SP1","Gạo",14000,LocalDate.of(2021,3,22),
                    LocalDate.of(2021,4,22));
            HangThucPham SP02 = new HangThucPham("SP2","Đường",10000,LocalDate.of(2017,3,10),
                    LocalDate.of(2021,3,21));
            HangThucPham SP03 = new HangThucPham("SP3","Muối",5000,LocalDate.of(2021,2,22),
                    LocalDate.of(2020,3,22));
            System.out.printf("%-10s %-26s %-16s %-20s %-20s %-10s \n","Mã Hàng","Tên Hàng","Đơn Giá","Ngày Sản Xuất","Ngày Hết Hạn","Note");
            System.out.println(SP01.toString());
            System.out.println(SP02.toString());
            System.out.println(SP03.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
