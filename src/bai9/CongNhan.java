package bai9;

import java.text.NumberFormat;
import java.util.Locale;

public class CongNhan {
    private int MaCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public int getMaCN() {
        return MaCN;
    }

    public void setMaCN(int maCN) {
        MaCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    public CongNhan() {
    }

    public CongNhan(int maCN, String mHo, String mTen, int mSoSP) {
        MaCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }
    public Object TinhLuong(){
        double luong = 0;
        if(getmSoSP()<199) luong= (getmSoSP()*0.5);
        else if (getmSoSP()>199&&getmSoSP()<399) luong = (getmSoSP()*0.55);
        else if (getmSoSP()>399&&getmSoSP()<599) luong = (getmSoSP()*0.6);
        else if (getmSoSP()>599) luong = (getmSoSP()*0.65);
        Locale local = new Locale("vi","VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String currency =formatter.format(luong);
        return currency;
    }

    @Override
    public String toString() {
        String s1 = String.format("%-10d %-10s %-20s %-15d %-10s ",getMaCN(), getmHo(), getmTen(),getmSoSP(),TinhLuong());
        return s1;
    }
}
