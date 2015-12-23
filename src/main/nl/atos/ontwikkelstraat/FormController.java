package nl.atos.ontwikkelstraat;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nerom on 23-12-2015.
 */

@Controller
@EnableAutoConfiguration
public class FormController {
    /**
     * @return hello world!
     */
    @RequestMapping("/form")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
