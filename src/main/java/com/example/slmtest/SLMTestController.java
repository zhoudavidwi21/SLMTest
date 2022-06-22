package com.example.slmtest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SLMTestController {

    private SLMTest slmTest = new SLMTest();

    @RequestMapping("/ounceToGram")
    public double ozToG(@RequestParam double oz){
        return slmTest.ounceToGram(oz);
    }

    @RequestMapping("/stoneToKilo")
    public double stoneToKilo(@RequestParam double stone){
        return slmTest.stoneToKilo(stone);
    }

}
