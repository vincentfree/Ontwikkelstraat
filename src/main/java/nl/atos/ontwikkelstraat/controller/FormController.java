package nl.atos.ontwikkelstraat.controller;

import nl.atos.ontwikkelstraat.pojo.FormData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class FormController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(FormData formData) {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewPost(@Valid FormData formData, BindingResult bindingResult, Model model) {
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

//    @RequestMapping(value="/", method=RequestMethod.POST)
//    public void processData(
//            @RequestParam() String name,
//            @RequestParam() String surName,
//            @RequestParam() String streetName,
//            @RequestParam() int houseNumber,
//            @RequestParam() String zipCode) {
//
//        FormData formData = new FormData(name, surName, streetName, houseNumber, zipCode);
//
//        String address = formData.getStreetName() + " " + formData.getHouseNumber() + " " + formData.getZipCode();
//        String nawData = formData.getName() + " " + formData.getSurname() + " " + address;
//
//        printData(formData, address, nawData);
//    }
//
//    private void printData(FormData formData, String address, String nawData){
//        System.out.println("voornaam: " + formData.getName());
//        System.out.println("achternaam: " + formData.getSurname());
//        System.out.println("postcode: " + formData.getZipCode());
//        System.out.println("huisNummer: " + formData.getHouseNumber());
//        System.out.println("straatNaam: " + formData.getStreetName());
//        System.out.println("adres: " + address);
//        System.out.println("nawGegevens: " + nawData);
//    }

}
