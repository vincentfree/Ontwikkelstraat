package nl.atos.ontwikkelstraat.controller;

import nl.atos.ontwikkelstraat.pojo.FormData;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.*;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


public class FormControllerTest {

    private MockMvc mockMvc;
    private FormData formData;


    @Before
    public void setUp() {
        String firstName = "testFirst";
        String surName = "testSur";
        String streetName = "testStreet";
        Integer houseNumber = 11;
        String zipCode = "AAAA11";
        formData = new FormData(firstName,surName,streetName,houseNumber,zipCode);
        this.mockMvc = standaloneSetup(new FormController()).build();
    }

    @Test
    public void index() throws Exception {
        this.mockMvc.perform(get("/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk());
    }

    //Passes, but should fail as formData = null. setFormat return "index"
    @Test
    public void addNewPost() throws Exception {
        this.mockMvc.perform(post("/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk());
    }

    //Passes as formData object is passed. setFormat return "result"
    @Test
    public void addNewPost2() throws Exception {
        this.mockMvc.perform(post("/").flashAttr("formData",formData).accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk());
    }

    @Test (expected = AssertionError.class)
    public void addNewGetWrongEndpoint() throws Exception {
        this.mockMvc.perform(get("/ffefew").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk());
    }

    @Test (expected = AssertionError.class)
    public void addNewPostWrongEndpoint() throws Exception {
        this.mockMvc.perform(post("/ffefew").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk());
    }

    @Test
    public void setNAW() throws Exception {
        this.mockMvc.perform(post("/naw").accept(MediaType.APPLICATION_JSON_UTF8)).andExpect(status().isOk());
    }

}
