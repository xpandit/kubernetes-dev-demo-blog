package com.xpandit.barmicroservice.repository;

import com.xpandit.barmicroservice.domain.ZipCode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ZipCodeRepository extends MongoRepository<ZipCode, String> {
}
