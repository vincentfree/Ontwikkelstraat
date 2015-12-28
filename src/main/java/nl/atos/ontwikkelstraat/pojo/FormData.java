package nl.atos.ontwikkelstraat.pojo;

import javax.validation.constraints.Size;

/**
 * Created by vagrant on 12/23/15.
 */
public class FormData {

    @Size (min=4, max=35)
    private String name;
    @Size(min=4, max=35)
    private String surname;
    @Size(min=4, max=35)
    private String streetName;
    @Size(min=4, max=35)
    private String houseNumber;
    @Size(min=4, max=35)
    private String zipCode;

    public FormData(){}

    public FormData(String name, String surname, String streetName, String houseNumber, String zipCode) {
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

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
