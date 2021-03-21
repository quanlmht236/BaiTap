package bai10;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.time.LocalDate;
public class Order {
    private int OrderID;
    private LocalDate OrderDate;
    private ArrayList<OrderDetail> lineItems = new ArrayList<>();
    private int count;

    public Order(int orderID, LocalDate orderDate) {
        OrderID = orderID;
        OrderDate = orderDate;
    }

    public int getOrderID() {
        return OrderID;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    public double CalcTotalCharge(){
        double Total = 0.0;
    for (OrderDetail OD : lineItems)
        Total += OD.calcTotalPrice();

    return Total;
    }
    @Override
        public String toString()
        {
            String KQ = "";
            int stt = 1;
            DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            KQ += "Ma HD: " + OrderID + "\n" +
                    "Ngay Lap Hoa Don: " + OrderDate.format(dmy) + "\n" +
                    String.format("| %-4s | %-10s | %-30s | %-20s | %10s | %24s", "STT", "Ma SP", "Mo ta", "Don Gia",
                            "S Luong", "Thanh Tien") + "\n";

            Locale local = new Locale("vi", "VN");
            NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
            for (OrderDetail od : lineItems)
            {
                Product product = od.getProduct();

                KQ += String.format("| %-5d| %-10s | %-30s | %-20s | %10d | %24s \n", stt, product.getProductID(),
                        product.getDescription(), formatter.format(product.getPrice()), od.getQuatily(), formatter.format(od.calcTotalPrice())   );
                stt++;
            }
            String currency = formatter.format(CalcTotalCharge());
            KQ += "Tong tien thanh toan: " + currency + "\n";
            return KQ;
        }
    public void addLineItems(Product product, int quatily){
        OrderDetail obj = new OrderDetail(quatily,product);
        lineItems.add(obj);
        this.count=lineItems.size();
    }


}
