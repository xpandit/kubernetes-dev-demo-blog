package com.xpandit.foomicroservice.controller;

import com.xpandit.foomicroservice.service.FooService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foo")
public class FooController {

    private final FooService fooService;

    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping()
    public List<String> getZipCodeCities() {
        return this.fooService.getAllCitiesLowerCase();
    }

}
