package Lesson11Composition;

// 2)
public class Address {
    private String addressLine1;
    private String city;
    private State state;
    private String zip;
// 4) I will make a constructor
    public Address(String addressLine1, String city, State state, String zip) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // 5) I will make getter and setter
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 9) more getters ans setters
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
