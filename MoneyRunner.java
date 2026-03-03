class MoneyRunner {

    public static void main(String[] args) {

        Money m1 = new Money();
        Money m2 = new Money();

        m1.earn();
        m1.spend();
        m1.save();
        m1.deposit();
        m1.withdraw();
        m1.transfer();
        m1.invest();
        m1.donate();
        m1.count();
        m1.exchange();
        m1.borrow();
        m1.lend();
        m1.budget();
        m1.calculateTax();
        m1.secure();

        m2.earn();
        m2.spend();
        m2.save();
        m2.deposit();
        m2.withdraw();
        m2.transfer();
        m2.invest();
        m2.donate();
        m2.count();
        m2.exchange();
        m2.borrow();
        m2.lend();
        m2.budget();
        m2.calculateTax();
        m2.secure();

        Money.showCurrencyType();
        Money.showDigitalMoney();
        Money.showImportance();
        Money.showValue();
        Money.showBankingSystem();
    }
}