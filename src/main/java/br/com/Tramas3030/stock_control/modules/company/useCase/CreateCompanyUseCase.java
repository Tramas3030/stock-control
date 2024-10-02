package br.com.Tramas3030.stock_control.modules.company.useCase;

import br.com.Tramas3030.stock_control.exceptions.CompanyFoundException;
import br.com.Tramas3030.stock_control.modules.company.entity.CompanyEntity;
import br.com.Tramas3030.stock_control.modules.company.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity) {
        this.companyRepository.findByEmail(companyEntity.getEmail())
                .ifPresent((company) -> {
                    throw new CompanyFoundException();
                });

        return this.companyRepository.save(companyEntity);
    }
}
