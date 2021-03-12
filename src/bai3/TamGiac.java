package bai3;

public class TamGiac {
    private int ma;
    private int mb;
    private int mc;
    private String name;
    private String loai;
    public TamGiac() {
    }
    public boolean KTTG() {
        if (ma + mb > mc && mb + mc > ma && mc + ma > mb) return true ;
   return false; }

    public TamGiac(int ma, int mb, int mc, String name) {
        this.ma = ma;
        this.mb = mb;
        this.mc = mc;
        this.name = name;
    }
    public int getMa() {
        return ma;
    }
    public void setMa(int ma) {
        this.ma = ma;
    }
    public int getMb() {
        return mb;
    }
    public void setMb(int mb) {
        this.mb = mb;
    }
    public int getMc() {
        return mc;
    }
    public void setMc(int mc) {
        this.mc = mc;
    }
    public void KTL2(){
        if (this.ma<0||this.mb<0||this.mc<0||KTTG()==false){
            this.ma=0;
            this.mb=0;
            this.mc=0;
        }
    }
    public int chuvi(){
     return this.ma+this.mb+this.mc;
    }
    public double dientich(){
        float p = (this.ma+this.mb+this.mc)/2;
        return Math.sqrt(p*(p-this.ma)*(p-this.mb)*(p-this.mc));
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void CheckTG(){
        if (KTTG()){setLoai(" Tam Giac Thường");
        if((this.ma == this.mb) && (this.mb == this.mc) && (this.mc == this.ma)){
            setLoai("Tam Giác Đều");
        }
        else if((this.ma == this.mb) || (this.mb == this.mc) || (this.mc == this.ma)){
            setLoai("Tam Giác Cân");
        }else if ((this.ma * this.ma == this.mb * this.mb + this.mc * this.mc) || (this.mb * this.mb == this.ma * this.ma + this.mc * this.mc) || (this.mc * this.mc == this.mb * this.mb + this.ma * this.ma))
        setLoai(" Tam Giác Vuông");}
        else setLoai("Không Phải Tam Giác");
    }
    @Override
    public String toString() {
        return "TamGiac "+ name +" {"+"\r\n " +
                "  ma=" + ma + "\r\n " +
                "  mb=" + mb + "\r\n " +
                "  mc=" + mc + "\r\n " +
                " "+getLoai()+"\r\n" +
                "  Chu Vi: "+chuvi()+ "\r\n" +
                "  Dien Tich: "+dientich()

                + "\r\n"+
                '}';
    }
    public void inTG()
    {
        KTL2();
        CheckTG();
        System.out.printf("%5s %9d %5d %5d %23s %9d %13.2f \n", name , this.ma,this.mb,this.mc,getLoai(), chuvi(),dientich());
    }
}
