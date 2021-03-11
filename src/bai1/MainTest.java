package bai1;

public class MainTest {
    public static void main(String[] args) {

        ToaDo obj = new ToaDo("A",4,2);
        obj.Cal();
        ToaDo obj_dif = new ToaDo("X",5,7);
        System.out.println(obj_dif);
        System.out.println(obj.toString());
    }
}
