package br.com.Tramas3030.stock_control.modules.company.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class CompanyEntity {

    private UUID id;
    private String name;
    private String address;
    private String password;
    private String email;
//    @CreationTimestamp e @UpdateTimestamp
}
