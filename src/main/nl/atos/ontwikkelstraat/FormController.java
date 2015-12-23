package nl.atos.ontwikkelstraat;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.FormData;

/**
 * Created by nerom on 23-12-2015.
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("/form")
public class FormController {
    /**
     * @return hello world!
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    void processData(@RequestBody FormData data) {

//        data.name;
//        data.surname;
//        data.address;
//        data.houseNumber;
//        data.postalCode;

        System.out.println(data.getName());
        System.out.println(data.getSurname());
        System.out.println(data.getHouseNumber());
        System.out.println(data.getPostalCode());
        System.out.println(data.getAddress());

    }
}
