package nl.atos.ontwikkelstraat.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import nl.atos.ontwikkelstraat.pojos.FormData;


@Controller
@EnableAutoConfiguration
@RequestMapping("/form")
public class FormController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus (HttpStatus.OK)
    public void processData(
            @RequestParam() String name,
            @RequestParam() String surName,
            @RequestParam() String streetName,
            @RequestParam() int houseNumber,
            @RequestParam() String zipCode) {

        FormData formData = new FormData(name, surName, streetName, houseNumber, zipCode);

        String address = formData.getStreetName() + " " + formData.getHouseNumber() + " " + formData.getZipCode();
        String nawData = formData.getName() + " " + formData.getSurname() + " " + address;

        printData(formData, address, nawData);
    }

    private void printData(FormData formData, String address, String nawData){
        System.out.println("voornaam: " + formData.getName());
        System.out.println("achternaam: " + formData.getSurname());
        System.out.println("postcode: " + formData.getZipCode());
        System.out.println("huisNummer: " + formData.getHouseNumber());
        System.out.println("straatNaam: " + formData.getStreetName());
        System.out.println("adres: " + address);
        System.out.println("nawGegevens: " + nawData);
    }

}
