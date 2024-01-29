public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  // Constructor to initialize Address with details
  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  // Copy constructor to create a new Address object from an existing one 

  public Address(Address otherAddress) {
    this.street = otherAddress.street;
    this.city = otherAddress.city;
    this.state = otherAddress.state;
    this.zip = otherAddress.zip;
  }

  public String toString() {
    // Return a formatted string of the address
    return String.format("%s, %s, %s, %s", street, city, state, zip);
  }
}
