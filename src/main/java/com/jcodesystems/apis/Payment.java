package com.jcodesystems.apis;

import jakarta.persistence.Entity;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Payment extends PanacheEntity {
    public List<String> namesList;
    public String message;
    public Boolean status;
}
