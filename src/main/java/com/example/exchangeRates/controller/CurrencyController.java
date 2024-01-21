package com.example.exchangeRates.controller;

import com.example.exchangeRates.service.ExchangeRatesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
    private static final Logger logger = LoggerFactory.getLogger(CurrencyController.class);

    @Autowired
    ExchangeRatesService ratesService;

    @GetMapping(value = "")
    public String[] getSupportedCurrenciesWithMessage() {
        // Log "Hello World" using SLF4J
        logger.info("Hello World");

        // Get the supported currencies
        String[] currencies = ratesService.getSupportedCurrencies();

        // Create a new array that includes the message and currencies
        String[] result = new String[currencies.length + 1];
        result[0] = "Hello World";
        System.arraycopy(currencies, 0, result, 1, currencies.length);

        // Return the combined array
        return result;
    }
}
