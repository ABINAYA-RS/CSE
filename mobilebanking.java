package basics;
class Account {
    private int accountNumber;
    private double accountBalance;
    private String accountHolder;

    public Account(int accountNumber, double accountBalance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public boolean withdraw(double amount, DebitCard debitCard) {
        if (amount > 0 && amount <= accountBalance && debitCard.validatePin()) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }
}
class DebitCard {
    private long cardNumber;
    private int cardPin;

    public DebitCard(long cardNumber, int cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }

    public boolean validatePin() {
        return true;
    }
}
class GPay {
    private int upiPin;
    private String username;

    public GPay(int upiPin, String username) {
        this.upiPin = upiPin;
        this.username = username;
    }

    public boolean payBill(String billerName, double billedAmount, String billerType, int enteredUpiPin) {
        if (upiPin == enteredUpiPin) {
            System.out.println("Paying bill to " + billerName + " of amount $" + billedAmount);
            return true;
        }
        return false;
    }
}

public class mobilebanking {
    public static void main(String[] args) {
        Account account = new Account(123456789, 5000.0, "John Doe");
        DebitCard debitCard = new DebitCard(1234567890123456L, 1234);
        double amountToWithdraw = 1000.0;
        if (account.withdraw(amountToWithdraw, debitCard)) {
            System.out.println("Withdrawal of $" + amountToWithdraw + " approved.");
            System.out.println("Remaining balance: $" + account.getAccountBalance());
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or incorrect PIN.");
        }
        GPay gPay = new GPay(5678, "JohnDoe");
        String billerName = "Utility Provider";
        double billedAmount = 200.0;
        String billerType = "Utility";
        int enteredUpiPin = 5678;

        if (gPay.payBill(billerName, billedAmount, billerType, enteredUpiPin)) {
            System.out.println("Bill payment successful.");
        } else {
            System.out.println("Bill payment failed. Invalid UPI PIN.");
        }
    }
}



