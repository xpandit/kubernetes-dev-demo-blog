package com.xpandit.foomicroservice.client;

import com.xpandit.foomicroservice.client.dto.ZipCodeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("bar-microservice-service")
public interface ZipCodeClient {

    @GetMapping("/api/bar")
    List<ZipCodeDTO> getAllZipCode();

}
