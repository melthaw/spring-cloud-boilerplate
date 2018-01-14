package io.picos.scb.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to spring cloud sample.";
    }

}
