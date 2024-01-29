public class CreditCard {
  private Money balance;
  private Money creditLimit;
  private Person owner;

  // Constructor
  
  public CreditCard(Person newCardHolder, Money limit) {
    this.owner = newCardHolder;
    this.creditLimit = new Money(limit);
    this.balance = new Money(0);
  }

  // Get the balance as a new Money object

  public Money getBalance() {
    return new Money(balance);
  }

  // Get the credit limit as a new Money pbject

  public Money getCreditLimit() {
    return new Money(creditLimit);
  }

  // Get the owners information as a formatted string
  public String getPersonals() {
    return owner.toString();
  }

  // Charge the specified amount to the credit card

  public void charge(Money amount) {
    if (balance.add(amount).compareTo(creditLimit) <= 0) {
      balance = balance.add(amount);
      System.out.println("Charge: " + amount);
    } else {
      System.out.println("Exceeds credit limit");
    }

  }

  // Make a payment on the credit card

  public void payment(Money amount) {
    balance = balance.subtract(amount);
    System.out.println("Payment: " + amount);
  }
}
