package com.example.procurement_managerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Site {

    private long id;
    private String siteName;
    private String address;
    private long phone;
    private long budget;
    private String status;
    private String siteManager;

}
