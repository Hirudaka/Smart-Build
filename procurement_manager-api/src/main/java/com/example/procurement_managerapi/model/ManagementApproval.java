package com.example.procurement_managerapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagementApproval {
    private long id;
    private String orderId;
    private String siteName;
    private String supplierName;
    private Date reqDate;
    private String siteAddress;
    private String orderDescription;
    private Double totalPrice;
    private String status;

    public Object thenReturn(ManagementApproval managementApproval) {
        return null;
    }
}
