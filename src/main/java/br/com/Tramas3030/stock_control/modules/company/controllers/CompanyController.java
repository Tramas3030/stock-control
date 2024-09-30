package br.com.Tramas3030.stock_control.modules.company.controllers;

import br.com.Tramas3030.stock_control.modules.company.entity.CompanyEntity;
import br.com.Tramas3030.stock_control.modules.company.repositories.CompanyRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping("/")
    public CompanyEntity create(@Valid @RequestBody CompanyEntity companyEntity) {
        return this.companyRepository.save(companyEntity);
    }

}
