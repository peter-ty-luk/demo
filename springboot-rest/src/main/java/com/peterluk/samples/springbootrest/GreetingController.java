package com.peterluk.samples.springbootrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "Hello World";
    }
}
