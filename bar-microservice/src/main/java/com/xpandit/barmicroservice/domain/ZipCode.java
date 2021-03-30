package com.xpandit.barmicroservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "zips")
@Data
@AllArgsConstructor
public class ZipCode {

    @Id
    @Field("_id")
    private String id;

    private String city;

    private double[] loc;

    private int pop;

    private String state;

}
