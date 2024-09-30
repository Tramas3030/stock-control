package br.com.Tramas3030.stock_control.modules.company.controllers;

import br.com.Tramas3030.stock_control.modules.company.entity.CompanyEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @PostMapping("/")
    public void create(@RequestBody CompanyEntity companyEntity) {

    }

}
