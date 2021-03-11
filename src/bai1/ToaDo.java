package bai1;

public class ToaDo {
    private String name;
    private int x;
    private int y;

    //constructor FUll
    public ToaDo(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public int Cal(){
        System.out.println(x+y);
        return x+y;
    }


    public String toString() {
        return
                name + "("+ x + ","+ y + ")";
    }
   //constructor
    public ToaDo() {
    };
}
