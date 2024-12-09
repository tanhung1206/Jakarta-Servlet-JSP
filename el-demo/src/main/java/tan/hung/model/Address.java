package tan.hung.model;

public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }
}
