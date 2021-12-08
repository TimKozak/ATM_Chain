package atm;

public class DefaultBill implements Bill{
    private Bill next;
    private final int billAmount;

    public DefaultBill (int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill next) {
        this.next = next;
    };

    @Override
    public int process(int amount) {
        int balance = amount % this.billAmount;

        if (next != null){
            final int process = next.process(balance);
        } else if (balance > 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        System.out.println("You should receive " + amount / billAmount + " " + billAmount + "UAH bills");
        return amount / billAmount;
    };
}
