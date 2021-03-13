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
        if (KTTG()){setLoai("Tam Giac Thường");
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
       KTL2();
       CheckTG();
       String s1 = String.format("%5s",name);
       String s0 = String.format("%8s"," ");
       String s2 = String.format("%-6d",this.ma);
       String s3 = String.format("%-6d",this.mb);
       String s4 = String.format("%-6d",this.mc);
       String s5 = String.format("%-27s",getLoai());
       String s6 = String.format("%-16d",chuvi());
       String s7 = String.format("%-10.2f",dientich());


        return s1+s0+s2+s3+s4+s5+s6+s7;
    }
}
