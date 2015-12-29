package nl.atos.ontwikkelstraat.unit.controller;

import nl.atos.ontwikkelstraat.controller.FormController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class FormControllerTest {

    private MockMvc mockMvc;


    @Before
    public void setup() {
        this.mockMvc = standaloneSetup(new FormController()).build();
    }

    @Test
    public void index() throws Exception {
        this.mockMvc.perform(get("/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk());
    }

    @Test
    public void addNewPost() throws Exception {
        this.mockMvc.perform(post("/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
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

}
