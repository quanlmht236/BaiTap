package bai8;

import java.text.NumberFormat;
import java.util.Locale;

public class CD {
    private int MaCD;
    private String TuaCD;
    private int SoBH;
    private float Price;

    public CD(int maCD, String tuaCD, int soBH, float price) {
        MaCD = maCD;
        TuaCD = tuaCD;
        SoBH = soBH;
        Price = price;
    }
    public void KTCD(){if(
            this.TuaCD.isEmpty() || this.TuaCD.isBlank()) setTuaCD("chưa xác định");
        if(this.MaCD<0) this.MaCD=999999;

    }
    public CD() {
    }

    public int getMaCD() {
        return MaCD;
    }

    public void setMaCD(int maCD) {
        MaCD = maCD;
    }

    public String getTuaCD() {
        return TuaCD;
    }

    public void setTuaCD(String tuaCD) {
//        if(tuaCD.isBlank() || tuaCD.isEmpty()) tuaCD="chưa xác định";
        TuaCD = tuaCD;
    }
    public int getSoBH() {
        return SoBH;
    }

    public void setSoBH(int soBH) {
        SoBH = soBH;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi","VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String currency =formatter.format(Price);
        String s1 = String.format("%-15s %-30s %-37s %-25s",MaCD,TuaCD,SoBH,currency);
        return s1;


}}
