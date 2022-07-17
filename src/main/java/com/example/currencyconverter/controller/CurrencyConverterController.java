package com.example.currencyconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@RestController("/currencies")
@RequestMapping("/currencies")
public class CurrencyConverterController {

    @GetMapping
    public String getCurrencies(){return "Hello word";
    }
}
