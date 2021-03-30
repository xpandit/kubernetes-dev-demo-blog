package com.xpandit.foomicroservice.service;

import com.xpandit.foomicroservice.client.ZipCodeClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FooService {

    private final ZipCodeClient zipCodeClient;

    public FooService(ZipCodeClient zipCodeClient) {
        this.zipCodeClient = zipCodeClient;
    }

    public List<String> getAllCitiesLowerCase() {
        return this.zipCodeClient.getAllZipCode().stream()
                .map(z -> z.getCity().toLowerCase())
                .collect(Collectors.toList());
    }
}
