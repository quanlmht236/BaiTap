package bai10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KiemNghiem {
    public static void main(String[] args) {


        Product product1 = new Product("Dau An", "sp10", 1000);
        Product product2 = new Product("Gao Thom", "sp1", 14000);
        Product product3 = new Product("Duong Trang", "sp3", 10000);

        Order order = new Order(1, LocalDate.of(2021, 3, 20));
        order.addLineItems (product1, 2);
        order.addLineItems(product2,50);
        order.addLineItems(product3,2);


        System.out.println(order);
    }
}
