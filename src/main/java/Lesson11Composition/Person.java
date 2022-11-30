package Lesson11Composition;
                                                            // 6)
public class Person {
    private Address address;
    private String name;
    private String lastName;
    private int year;
                                                            // 7)
                                                            // constructor
    public Person(Address address, String name, String lastName, int year) {
        this.address = address;
        this.name = name;
        this.lastName = lastName;
        this.year = year;

    }
                                                            // 8)
                                                            // create getter and setters
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}