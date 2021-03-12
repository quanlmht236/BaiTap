package bai4;

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
        return "Vehicle{" +
                "Own='" + Own + '\'' +
                ", Loai='" + Loai + '\'' +
                ", DungTich=" + DungTich +
                ", Price=" + Price +
                ", Tax=" + Tax +
                '}';
    }

    public void InBT(){
        System.out.printf("%4s %15s %24d %25.2f %15.2f\n ", Own ,Loai,DungTich,Price,Tax);
    }
}
