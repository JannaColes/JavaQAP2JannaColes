public class Money {
  private long dollars;
  private long cents;

  // Constructor
  public Money(double amount) {
    this.dollars = (long) amount;
    this.cents = Math.round((amount - dollars) * 100);
  }

  // Copy constructor

  public Money(Money otherObject) {
    this.dollars = otherObject.dollars;
    this.cents = otherObject.cents;
  }

  // Add otherAmount to this Monet, returning a new Money Object

  public Money add(Money otherAmount) {
    double totalAmount = this.getAmount() + otherAmount.getAmount();
    return new Money(totalAmount);
  }
    //Subtract otherAmount from this Money, returning a new Money object
    public Money subtract(Money otherAmount) {
      double totalAmount = this.getAmount() - otherAmount.getAmount();
      return new Money(totalAmount);
  }
  
  // Compare this Money to otherMoney
  public int compareTo(Money otherObject) {
    double difference = this.getAmount() - otherObject.getAmount();
    return Double.compare(difference, 0);
  }

  // Check if this Money is equal to otherMoney
  public boolean equals(Money otherObject) {
    return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
  }

  // Get the amount represented by this Money object
  public double getAmount() {
    return dollars + (cents / 100.0);
  }

  public String toString() {
    return String.format("$%d.%02d", dollars, cents);
  }
  
}
