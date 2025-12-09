package yeni_paket;


public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;


    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Para yatırma işlemi başarılı.");
        } else {
            System.out.println("Hata: Yatırılacak miktar 0 veya negatif olamaz.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Hata: Çekilecek miktar 0 veya negatif olamaz.");
        } else if (amount > this.balance) {
            System.out.println("Hata: Yetersiz bakiye! Çekilebilecek maksimum tutar: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Para çekme işlemi başarılı.");
        }
    }


    public void printInfo() {
        System.out.println("--------------------------------");
        System.out.println("Hesap Sahibi: " + this.ownerName);
        System.out.println("Hesap No    : " + this.accountNumber);
        System.out.println("Güncel Bakiye: " + this.balance + " TL");
        System.out.println("--------------------------------");
    }
}
