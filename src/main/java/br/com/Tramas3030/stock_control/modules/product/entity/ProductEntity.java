package br.com.Tramas3030.stock_control.modules.product.entity;

import br.com.Tramas3030.stock_control.modules.company.entity.CompanyEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank()
    private String name;

    @NotBlank()
    private String description;

    @Column(precision = 10, scale = 2, name = "cost_price")
    private BigDecimal costPrice;

    @Column(precision = 10, scale = 2, name = "sale_price")
    private BigDecimal salePrice;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    @ManyToOne()
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    private CompanyEntity companyEntity;

    @Column(name = "company_id", nullable = false)
    private UUID companyId;


    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
