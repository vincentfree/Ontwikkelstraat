package nl.atos.ontwikkelstraat.controller;

import nl.atos.ontwikkelstraat.pojo.FormData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class FormController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getFormData(FormData formData) {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String setFormData(@Valid FormData formData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }

        model.addAttribute("name", formData.getName());
        model.addAttribute("surname", formData.getSurname());
        model.addAttribute("streetName", formData.getStreetName());
        model.addAttribute("houseNumber", formData.getHouseNumber());
        model.addAttribute("zipCode", formData.getZipCode());

        return "result";
    }

    @RequestMapping(value="/naw", method = RequestMethod.POST)
    public String setNaw(@Valid FormData formData, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "index";
        }

        model.addAttribute("fullName", formData.getName() + " " + formData.getSurname());
        model.addAttribute("address",
                formData.getStreetName() + " " + formData.getHouseNumber() + "\n" + formData.getZipCode() + "\n" + "Groningen");

        return "naw";
    }

}
