package br.com.Tramas3030.stock_control.modules.company.repositories;

import br.com.Tramas3030.stock_control.modules.company.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity> findByEmail(String email);
}
