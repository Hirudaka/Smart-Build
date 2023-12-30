package com.example.procurement_managerapi.entity;

import jakarta.persistence.*;
import lombok.Data

@Entity
@Data
@Table(name="sites")
public class SiteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String siteName;
    private String address;
    private long phone;
    private long budget;
    private String status;
    private String siteManager;

}
