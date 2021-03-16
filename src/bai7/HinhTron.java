package bai7;

public class HinhTron {
    private Toado tam;
    private static double bankinh;
    public double CalP(){
        return (2*bankinh* Math.PI);
    }
    public double CalS(){
        return bankinh*bankinh* Math.PI;
    }

    public HinhTron(Toado tam, double bankinh) {
        this.tam = tam;
        this.bankinh = bankinh;
    }


    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

}
