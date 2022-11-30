package Lesson11Composition;

                                                        // 12)
                                                        // new class House
public class House {
    private Address address;
    private Person owner;
    private int bedrooms;
    private int bathrooms;
    private int year;

                                                        // 13)
                                                        // make constructor
    public House(Address address, Person owner, int bedrooms, int bathrooms, int year) {
        this.address = address;
        this.owner = owner;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.year = year;
    }

                                                        // 14)
                                                        // make only getters
    public Address getAddress() {
        return address;
    }

    public Person getOwner() {
        return owner;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getYear() {
        return year;
    }
}
