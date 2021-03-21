package bai10;
import bai10.Product;
public class OrderDetail {
    private int quatily;
    private Product product;


    public int getQuatily() {
        return quatily;
    }

    public void setQuatily(int quatily) {
        if (quatily>0){
        this.quatily = quatily; }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderDetail(int quatily, Product product) {
        if (quatily>0)
            this.quatily = quatily;

        else{
            this.quatily=0;}
            this.product = product;
    }


    @Override
    public String toString() {
        return product.toString() + " " + quatily;
    }
    public double calcTotalPrice(){
        return quatily*product.getPrice();
    }
}
