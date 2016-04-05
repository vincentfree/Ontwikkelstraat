package nl.atos.ontwikkelstraat.pojo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormDataTest {

    public FormData formData = new FormData("Henk", "Visser", "Hereweg", 112, "9714AP");

    @Test
    public void getName() {
        assertEquals(formData.getName(), "Henk");
    }

    @Test
    public void getSurname() {
        assertEquals(formData.getSurname(), "Visser");
    }

    @Test
    public void getStreetName() {
        assertEquals(formData.getStreetName(), "Hereweg");
    }

    @Test
    public void getHouseNumber() {
        assertEquals(formData.getHouseNumber(), Integer.valueOf(112));
    }

    @Test
    public void getZipCode() {
        assertEquals(formData.getZipCode(), "9714AP");
    }

    @Test
    public void setName() {
        formData.setName("Hendrik");
        assertEquals(formData.getName(), "Hendrik");
    }

    @Test
    public void setSurname() {
        formData.setSurname("Bakker");
        assertEquals(formData.getSurname(), "Bakker");
    }

    @Test
    public void setStreetName() {
        formData.setStreetName("Hoofdstraat");
        assertEquals(formData.getStreetName(), "Hoofdstraat");
    }

    @Test
    public void setHouseNumber() {
        formData.setHouseNumber(14);
        assertEquals(formData.getHouseNumber().intValue(), 14);
    }

    @Test
    public void setZipCode() {
        formData.setZipCode("9757XT");
        assertEquals(formData.getZipCode(), "9757XT");
    }
}
