package com.xpandit.foomicroservice.client.dto;

import lombok.Data;

@Data
public class ZipCodeDTO {

    private String id;

    private String city;

    private double[] loc;

    private int pop;

    private String state;

}
