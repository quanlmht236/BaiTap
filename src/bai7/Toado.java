package bai7;
import bai7.HinhTron;

public class Toado {
    private String ten;
    private int x;
    private int y;
    public final float Pi = 3.14f;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public Toado(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Toado(){
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Toado{}";
    }
}
