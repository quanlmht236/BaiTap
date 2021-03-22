package bai5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HangThucPham {
    private String Mahang;
    private String Tenhang;
    private float DonGia;
    private LocalDate NsX;
    private LocalDate NhH;

    public HangThucPham(String mahang) {
        Mahang = mahang;
    }

    public HangThucPham(String mahang, String tenhang, float donGia, LocalDate NSX, LocalDate NHH) throws Exception {
        if(mahang.isEmpty()||mahang.isBlank()) throw new Exception(
          "error !!! Mã hàng không được phép để rỗng!!!");
        else Mahang = mahang;
        if (!tenhang.isBlank()||!tenhang.isBlank())
            this.Tenhang = tenhang;
        else
            this.Tenhang = "xxx";
        if (donGia >= 0f)
            this.DonGia = donGia;
        else
            this.DonGia = 0f;

        if (NSX.isBefore(LocalDate.now()))
            this.NsX = NSX;
        else
            this.NsX = LocalDate.now();
        if (NHH.isAfter(NsX))
            this.NhH = NHH;
        else
            this.NhH = LocalDate.now();
    }

    public String getMahang() {
        return Mahang;
    }

    public void setMahang(String mahang) {
        Mahang = mahang;
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String tenhang) {
        Tenhang = tenhang;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(float donGia) {
        DonGia = donGia;
    }

    public LocalDate getNSX() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NsX.format(dtf);
        return LocalDate.parse(NsX.toString());
    }

    public void setNSX(LocalDate NSX) {
        this.NsX = NSX;
    }

    public LocalDate getNHH() {
        return NhH;
    }

    public void setNHH(LocalDate NHH) {
        this.NhH = NHH;
    }

    public boolean CheckHSD(){
        if(NhH.isBefore(LocalDate.now()))
            return true;
        else return false;
    }
    @Override
    public String toString()
    {
        String Note;
        if (CheckHSD())
            Note = "SP đã hết hạn SD";
        else
            Note = "SP vẫn còn hạn SD";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
//        Locale local = new Locale("vi", "VN");
//        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        return String.format("%-10s %-15s %20s₫ %5s %-20s %-20s %-15s", getMahang(), getTenhang(), df.format(getDonGia()),"", getNSX().format(dtf),
                getNHH().format(dtf), Note);
    }

}
