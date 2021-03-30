package com.xpandit.barmicroservice.controller;

import com.xpandit.barmicroservice.domain.ZipCode;
import com.xpandit.barmicroservice.service.BarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/bar")
public class BarController {

    private final BarService barService;

    public BarController(BarService barService) {
        this.barService = barService;
    }

    @GetMapping()
    public List<ZipCode> getAll() {
        return this.barService.getAllZips();
    }

}
