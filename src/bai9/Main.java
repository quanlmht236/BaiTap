package bai9;

public class Main {
    public static void main(String[] args) {
        CongNhan A = new CongNhan(10,"Ngo","Quan",100);
        CongNhan B = new CongNhan(11,"Ngo","Quang",200);
        CongNhan C = new CongNhan(12,"Ngo","Quanh",300);
        try{
            DanhSachCongNhan list = new DanhSachCongNhan(3);
            list.add(A);
            list.add(B);
            list.add(C);
            System.out.printf("Số nhân viên trong danh sách là %d \n", list.CalSLCN());
            In();
            System.out.println(list.toString());
            System.out.println("Danh sách các công nhân có số sản phẩm trên 200");
            In();
            System.out.println(list.toString1());

            list.sortZa();
            In();
            System.out.println(list.toString());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void In(){
        System.out.printf("%-10s %-10s %-20s %-15s %-15s \n","Mã CN","Họ","Tên","Số SP","Lương");
    }
}
