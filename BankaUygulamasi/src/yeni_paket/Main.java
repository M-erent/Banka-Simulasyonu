package yeni_paket;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("--- Banka Hesabı Oluşturuluyor ---");
        // İsterseniz buraları da kullanıcıdan alabilirsiniz ama doküman "main içinde nesne oluşturun" demiş.
        BankAccount myAccount = new BankAccount("TR123456", "Ahmet Yılmaz", 1000.0);

        System.out.println("Hesap başarıyla oluşturuldu.");

        int choice = -1;


        while (choice != 0) {
            System.out.println("\n--- BANKA İŞLEMLERİ MENÜSÜ ---");
            System.out.println("1- Para Yatır");
            System.out.println("2- Para Çek");
            System.out.println("3- Bakiye Görüntüle");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");


            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next(); // Hatalı girdiyi temizle
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.print("Yatırılacak miktar: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Çekilecek miktar: ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    myAccount.printInfo();
                    break;
                case 0:
                    System.out.println("Sistemden çıkış yapılıyor. İyi günler!");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
                    break;
            }
        }

        scanner.close();
    }
}
