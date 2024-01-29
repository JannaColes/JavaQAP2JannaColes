public class Person {
  private String lastName;
  private String firstName;
  private Address home;

  // Constructor to initialize Person with details
  public Person(String lastName, String firstName, Address home) {
      this.lastName = lastName;
      this.firstName = firstName;
      this.home = new Address(home);
  }
 
  // Copy constructor to create a new Person object from an existing one
  public Person(Person otherPerson) {
    this.lastName = otherPerson.lastName;
    this.firstName = otherPerson.firstName;
    this.home = new Address(otherPerson.home);
  }


  @Override
  public String toString() {
    // Return a formatted string of the person
      return String.format("%s %s, %s", firstName, lastName, home.toString());
  }
}