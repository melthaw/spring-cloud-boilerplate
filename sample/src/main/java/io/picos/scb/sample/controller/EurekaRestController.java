package io.picos.scb.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaRestController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello cloud";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String info() {
        return "sample api";
    }

    @RequestMapping("/health")
    @ResponseBody
    public String health() {
        return "ok";
    }

}
