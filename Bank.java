import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    Account ob1;

    void createAccount() {
        String customer;
        int account;
        String type;
        int initBal;

        System.out.print("Enter the customer name: ");
        customer = sc.nextLine();
        System.out.print("Enter account Number: ");
        account = sc.nextInt();
        sc.nextLine();  // Consume the newline
        System.out.print("Enter Account type (Savings or Current): ");
        type = sc.nextLine();
        System.out.print("Enter the initial Balance: ");
        initBal = sc.nextInt();

        if (type.equals("Savings")) {
            ob1 = new Savings(customer, account, initBal);
        } else {
            ob1 = new Current(customer, account, initBal);
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount();

        while (true) {
            System.out.println("-------------------MENU-----------------");
            System.out.println("1. Deposit     2. Withdraw");
            System.out.println("3. Compute interest");
            System.out.println("4. Display account details");
            System.out.println("5. exit " ) ;
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bank.ob1.deposit();
                    break;
                case 2:
                    bank.ob1.withdraw();
                    break;
                case 3:
                    if (bank.ob1 instanceof Savings) {
                        ((Savings) bank.ob1).computeInterest();
                    } else {
                        System.out.println("Interest computation is only available for Savings accounts.");
                    }
                    break;
                case 4:
                    bank.ob1.display();
                    break;
                case 5:
                    break ;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if(choice == 5) break ;
        }
    }
}

class Account {
    String customerName;
    int accountNumber;
    int balance;

    Account(String customer, int accountNum, int bal) {
        customerName = customer;
        accountNumber = accountNum;
        balance = bal;
    }

    void deposit() {
        System.out.print("Enter the amount to deposit: ");
        int amt = Bank.sc.nextInt();
        balance += amt;
        System.out.println("Deposited: " + amt + ", New Balance: " + balance);
    }

    void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        int amt = Bank.sc.nextInt();
        if (balance - amt < 0) {
            System.out.println("Insufficient Balance to withdraw the given amount.");
        } else {
            balance -= amt;
            System.out.println("Amount of " + amt + " withdrawn successfully. Current Balance is " + balance);
        }
    }

    void display() {
        System.out.println("The Balance in the account is " + balance);
    }
}

class Savings extends Account {
    double interestPercent;

    Savings(String customer, int accountNum, int bal) {
        super(customer, accountNum, bal);
        System.out.print("Enter the interest percentage on the account: ");
        interestPercent = Bank.sc.nextDouble();
    }

    void computeInterest() {
        balance += balance * (interestPercent / 100);
        System.out.println("Amount after applying interest is: " + balance);
    }
}

class Current extends Account {
    int minBalance = 1000;

    Current(String customer, int accountNum, int bal) {
        super(customer, accountNum, bal);
    }

    void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        int amt = Bank.sc.nextInt();
        if (balance - amt < minBalance) {
            System.out.println("Insufficient Balance to maintain the minimum required.");
        } else {
            balance -= amt;
            System.out.println("Amount of " + amt + " withdrawn successfully. Current Balance is " + balance);
        }
    }
}