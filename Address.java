public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  // Constructor
  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  // Copy constructor

  public Address(Address otherAddress) {
    this.street = otherAddress.street;
    this.city = otherAddress.city;
    this.state = otherAddress.state;
    this.zip = otherAddress.zip;
  }

  public String toString() {
    return String.format("%s, %s, %s, %s", street, city, state, zip);
  }
}
