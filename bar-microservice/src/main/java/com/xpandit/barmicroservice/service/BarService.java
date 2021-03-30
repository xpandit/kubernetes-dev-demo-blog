package com.xpandit.barmicroservice.service;

import com.xpandit.barmicroservice.domain.ZipCode;
import com.xpandit.barmicroservice.repository.ZipCodeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarService {

    private final ZipCodeRepository zipCodeRepository;

    public BarService(ZipCodeRepository zipCodeRepository) {
        this.zipCodeRepository = zipCodeRepository;
    }

    public List<ZipCode> getAllZips() {
        return this.zipCodeRepository.findAll();
    }
}
