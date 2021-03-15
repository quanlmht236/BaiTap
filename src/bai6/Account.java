package bai6;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;
    public Account() {
    }
    public Account(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount){
        if(amount>0){
        this.balance += amount;
        System.out.println("Gửi tiền thành công ");
        return true; }
        System.out.println("Gửi tiền thất bại ");
        return false;}

    public boolean withdraw(double amount,double fee)
    {

            if(amount>0 && amount+fee<=this.balance){
            this.balance-=amount+fee;
            System.out.println("Rút tiền thành công ");
            return true;
        }
        System.out.println("Rút tiền không thành công vui lòng kiểm tra số dư \n ");

        return false;
    }
    public void addInterest(){
        this.balance = this.balance+(this.balance*RATE);
        System.out.printf("Đã cộng tiền lãi vào tài khoản của " + this.name + "\n\n");
    }
    public boolean transfer(Account acc2,double amount){
        if(this.balance>amount) {
            this.balance -= amount;
            acc2.balance += amount;
            System.out.println("Chuyển tiền thành công \n");
            return true;
        }
        System.out.println("Chuyển tiền không thành công! Vui lòng kiểm tra số dư!");
        return false;
    }
    public void Kttk(){
        if (accountNumber<0) this.accountNumber = 999999;
        if (doStuff(name)) this.name = "Uncomfirm";
        if (balance>=50000) this.balance = 50000;
    }
    public boolean doStuff(String name){
        if (this.name.isBlank() && this.name.isEmpty()){
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printcurrency(){
    Locale local = new Locale("en","US");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
    String currency =formatter.format(getBalance());
        System.out.printf("Số dư hiện tại của " + this.name + " là "  + currency + "\n\n");}

    @Override
    public String toString() {
        Locale local = new Locale("en","US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String currency =formatter.format(getBalance());
        String s1 = String.format("Số tài khoản " + this.accountNumber +"\n");
        String s2 = String.format("Chủ tài khoản " + this.name + "\n");
        String s3 = String.format("Số dư hiện tại " + currency +"\n" );
         return s1 + s2 + s3;
                 /*"Số tài khoản" + this.accountNumber + "\n" +
                "Chủ tài khoản " + this.name + "\n" +
                "Số dư hiện tại" + printcurrency();*/
    }



}
