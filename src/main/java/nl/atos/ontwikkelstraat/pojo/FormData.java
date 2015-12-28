package nl.atos.ontwikkelstraat.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FormData {

    @Size (min=2, max=20)
    private String name;

    @Size(min=2, max=20)
    private String surname;

    @Size(min=4, max=35)
    private String streetName;

    @NotNull
    @Min(1)
    @Max(9999)
    private Integer houseNumber;

    @Size(min=6, max=6)
    private String zipCode;

    public FormData(){}

    public FormData(String name, String surname, String streetName, Integer houseNumber, String zipCode) {
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

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
