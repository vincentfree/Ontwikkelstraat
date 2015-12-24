package nl.atos.ontwikkelstraat.pojos;

/**
 * Created by vagrant on 12/23/15.
 */
public class FormData {

    private String name;
    private String surname;
    private String streetName;
    private int houseNumber;
    private String zipCode;
    private int testInt;

    public FormData(String name, String surname, String streetName, int houseNumber, String zipCode) {
        this.name = name;
        this.surname = surname;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
