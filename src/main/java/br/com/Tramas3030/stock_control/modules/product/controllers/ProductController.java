package br.com.Tramas3030.stock_control.modules.product.controllers;

import br.com.Tramas3030.stock_control.modules.product.entity.ProductEntity;
import br.com.Tramas3030.stock_control.modules.product.useCase.CreateProductUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private CreateProductUseCase createProductUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody ProductEntity productEntity) {
        var result = this.createProductUseCase.execute(productEntity);
        return ResponseEntity.ok().body(result);
    }
}
