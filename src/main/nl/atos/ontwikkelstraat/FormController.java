package nl.atos.ontwikkelstraat;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import pojo.FormData;


@Controller
@EnableAutoConfiguration
@RequestMapping("/form")
public class FormController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus (HttpStatus.CREATED)
    public void processData(
            @RequestParam() String name,
            @RequestParam() String surName,
            @RequestParam() String streetName,
            @RequestParam() String houseNumber,
            @RequestParam() String zipCode) {

        String address = streetName + " " + houseNumber + " " + zipCode;
        String nawData = name + " " + surName + " " + address;


        System.out.println("name: " + name);
        System.out.println("surName: " + surName);
        System.out.println("zipCode: " + zipCode);
        System.out.println("houseNumber: " + houseNumber);
        System.out.println("streetName: " + streetName);
        System.out.println("address: " + address);
        System.out.println("nawData: " + nawData);
    }
}
