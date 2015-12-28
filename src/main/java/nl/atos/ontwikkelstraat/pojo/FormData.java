package nl.atos.ontwikkelstraat.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by vagrant on 12/23/15.
 */
public class FormData {

    @NotNull
    @Size (min=2, max=20)
    private String name;

    @NotNull
    @Size(min=2, max=20)
    private String surname;

    @NotNull
    @Size(min=4, max=35)
    private String streetName;

    @NotNull
    @Min(1)
    @Max(4)
    private int houseNumber;

    @NotNull
    @Size(min=6, max=6)
    private String zipCode;

    public FormData(){}

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
