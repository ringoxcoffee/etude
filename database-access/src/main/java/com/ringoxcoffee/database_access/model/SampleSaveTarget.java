package com.ringoxcoffee.database_access.model;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

@Entity
public class SampleSaveTarget implements Serializable {
    private String ci;
    private String targetValue;
}
