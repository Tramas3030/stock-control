package br.com.Tramas3030.stock_control.modules.product.useCase;

import br.com.Tramas3030.stock_control.modules.product.entity.ProductEntity;
import br.com.Tramas3030.stock_control.modules.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductUseCase {

    @Autowired
    private ProductRepository productRepository;

    public ProductEntity execute(ProductEntity productEntity) {
        return this.productRepository.save(productEntity);
    }
}
