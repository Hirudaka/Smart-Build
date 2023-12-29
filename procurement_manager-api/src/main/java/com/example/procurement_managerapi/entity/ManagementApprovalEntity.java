package com.example.procurement_managerapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data
import lombok.NoArgsConstructor; 

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Approvals")
public class ManagementApprovalEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String orderId;
    private String siteName;
    private String supplierName;
    private Date reqDate;
    private String siteAddress;
    private String orderDescription;
    private Double totalPrice;
    private String status;


}
