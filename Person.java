public class Person {
  private String lastName;
  private String firstName;
  private Address home;

  // Constructor
  public Person(String lastName, String firstName, Address home) {
      this.lastName = lastName;
      this.firstName = firstName;
      this.home = new Address(home);
  }

  public Person(Person otherPerson) {
    this.lastName = otherPerson.lastName;
    this.firstName = otherPerson.firstName;
    this.home = new Address(otherPerson.home);
  }


  @Override
  public String toString() {
      return String.format("%s %s, %s", firstName, lastName, home.toString());
  }
}