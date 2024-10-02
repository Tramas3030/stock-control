package br.com.Tramas3030.stock_control.modules.product.repositories;

import br.com.Tramas3030.stock_control.modules.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {

}