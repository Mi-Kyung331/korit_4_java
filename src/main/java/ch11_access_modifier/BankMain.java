package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");
        bank1.setBalance(100000);
        bank1.setPinNumber(1234);

        bank1.showAccountInfo();
        System.out.println();

        bank1.disposit(50000, 1234);
        bank1.withdraw(200000, 1234);
        bank1.withdraw(100000, 1234);

        bank1.displayInfo();

        System.out.println("------------");

        Bank bank2 = new Bank();

        bank2.setAccountNum(987654);
        bank2.setAccountHolder("신사임당");
        bank2.setBalance(500000);
        bank2.setPinNumber(0000);

        bank2.showAccountInfo();
        System.out.println();

        bank2.withdraw(100000, 0000);
        bank2.disposit(200000, 0000);

        bank2.displayInfo();

    }


}
