package nl.atos.ontwikkelstraat.unit.pojo;

import nl.atos.ontwikkelstraat.pojo.FormData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormDataTest {

    FormData formData = new FormData("Henk", "Visser", "Hereweg", 112, "9714AP");

    @Test
    public void getName(){
        assertEquals(formData.getName(), "Henk");
    }

    @Test
    public void getSurname(){
        assertEquals(formData.getSurname(), "Visser");
    }

    @Test
    public void getStreetName(){
        assertEquals(formData.getStreetName(), "Hereweg");
    }

    @Test
    public void getHouseNumber(){
        assertEquals(formData.getHouseNumber(), Integer.valueOf(112));
    }

    @Test
    public void getZipCode(){
        assertEquals(formData.getZipCode(), "9714AP");
    }
    @Test
    public void setName(){
        formData.setName("Hendrik");
        assertEquals(formData.getName(), "Hendrik");
    }
}
