package bai4;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {
    private String Own;
    private String Loai;
    private int DungTich;
    private float Price;
    private float Tax;

    public Vehicle(String own, String loai, int dungTich, float price, Float tax) {
        Own = own;
        Loai = loai;
        DungTich = dungTich;
        Price = price;
        Tax = tax;
    }
    public Vehicle(){
    }

    public String getOwn() {
        return Own;
    }

    public void setOwn(String own) {
        Own = own;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int dungTich) {
        DungTich = dungTich;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public float getTax() {
        return Tax;
    }

    public void setTax(float tax) {
        Tax = tax;
    }
    public void CalTax(){
        if(DungTich<100) setTax(Price*1/100);
        else if(DungTich>=100&&DungTich<=200) setTax(Price*3/100);
        else setTax(Price*5/100);
    }

    @Override
    public String toString() {
        String s1 = String.format("%-29s",Own);
        String s2 = String.format("%-24s",Loai);
        String s3 = String.format("%-23s",DungTich);
        String s4 = String.format("%-20.2f",Price);
        String s5 = String.format("%-30.2f",Tax);
        return s1+s2+s3+s4+s5;
    }
}
