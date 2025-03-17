package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Scope("prototype")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private Timestamp created;
    private Timestamp updated;
}
